package com.team05.utils;

import java.util.UUID;

/**
 * Created by dllo on 18/3/2.
 */
public class CommonUtils {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
