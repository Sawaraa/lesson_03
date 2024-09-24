import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggerFile {


    private static Logger log = Logger.getLogger(CustomLoggerFile.class);

    public static void main(String[] args) {
        logConcole();
        logDomConfigurator();

    }

    public static void logConcole(){
        BasicConfigurator.configure();

        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

    public static void logDomConfigurator(){
        DOMConfigurator.configure("loggerConfig.xml");

        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error2");
        log.error("error");
    }



}
