public class ReportService {

    public final Logger logger;

    public ReportService(Logger logger) {
        this.logger = logger;
    }

    void generate(){
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}