import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUse {
    public static void main(String[] args) {
        final Logger logger=Logger.getGlobal();
        logger.info("Hello, world");
        Object level;
        logger.log(Level.INFO,"Hello, world");
    }
}
