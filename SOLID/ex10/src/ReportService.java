public class ReportService {
    ILogger logger;

    public ReportService(ILogger logger) {
        this.logger = logger;
    }

    void generate(){
        logger.log("Generating daily report...");
        logger.log("Report contents...");
        logger.log("Report generated successfully");
    }
}