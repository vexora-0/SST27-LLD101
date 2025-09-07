package com.example.video;

import java.util.Objects;

public class SharpenAdapter {
    private final LegacySharpen legacySharpen;

    public SharpenAdapter(LegacySharpen legacySharpen) {
        this.legacySharpen = Objects.requireNonNull(legacySharpen, "legacySharpen");
    }

    public Frame[] sharpen(Frame[] frames, int strength) {
        String handle = "FRAMES:" + frames.length;
        String result = legacySharpen.applySharpen(handle, strength);
        return frames;
    }
}
