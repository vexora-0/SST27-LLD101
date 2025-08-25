public class Demo10 {
    public static void main(String[] args) {
        ILogger logger = new ConsoleLogger();
        new ReportService(logger).generate();
    }
}
