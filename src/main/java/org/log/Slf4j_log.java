package org.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4j_log {

    private static Logger logger = LoggerFactory.getLogger(Slf4j_log.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }

}
