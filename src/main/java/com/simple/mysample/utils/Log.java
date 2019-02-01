package com.simple.mysample.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author hych
 * @date 2019/1/31 17:30
 */
public class Log {

    private static Logger log() {
        return LogManager.getLogger();
    }

    public static void i(String info) {
        log().info(info);
    }

    public static void w(String warn) {
        log().warn(warn);
    }

    public static void e(String error) {
        log().error(error);
    }

}
