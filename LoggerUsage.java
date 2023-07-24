package exam.loggerproblem;

public class LoggerUsage {
    public static void main(String[] args) {
        ILogger logger = new LoggerImpl();
        logger.info("successful");
        logger.error("something went wrong");

        ILogger advancedLogger = new AdvancedLogger(logger);
        advancedLogger.info("successful");
        advancedLogger.error("something went wrong");
    }
}