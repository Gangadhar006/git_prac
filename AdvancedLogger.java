package exam.loggerproblem;

import java.util.Date;

public class AdvancedLogger implements ILogger {

    private Date date;
    private ILogger logger;

    public AdvancedLogger(ILogger logger) {
        date = new Date();
        this.logger = logger;
    }

    @Override
    public void info(String msg) {
        msg += ": " + date;
        logger.info(msg);
    }

    @Override
    public void error(String msg) {
        msg += ": " + date;
        logger.error(msg);
    }
}