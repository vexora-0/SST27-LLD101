package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = Objects.requireNonNull(csvReader, "csvReader");
        this.profileService = Objects.requireNonNull(profileService, "profileService");
    }

    @Override
    public int importFrom(Path csvPath) {
        Objects.requireNonNull(csvPath, "csvPath");

        List<String[]> rows = csvReader.read(csvPath);
        int successfulImports = 0;

        for (int i = 0; i < rows.size(); i++) {
            String[] row = rows.get(i);

            if (row.length < 3) {
                System.out.println("Skipping row " + (i + 1) + ": insufficient columns");
                continue;
            }
            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();

            if (id.isEmpty()) {
                System.out.println("Skipping row " + (i + 1) + ": missing id");
                continue;
            }

            if (email.isEmpty()) {
                System.out.println("Skipping row " + (i + 1) + ": missing email");
                continue;
            }

            if (!email.contains("@")) {
                System.out.println("Skipping row " + (i + 1) + ": invalid email format");
                continue;
            }

            try {
                profileService.createProfile(id, email, displayName);
                successfulImports++;
            } catch (IllegalArgumentException e) {
                System.out.println("Skipping row " + (i + 1) + ": " + e.getMessage());
            }
        }

        return successfulImports;
    }
}
