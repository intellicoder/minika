package com.monoka.generator.utils;

import cn.hutool.setting.dialect.Props;

public class PropertiesUtils {

    public static String getValue(String key) {
        Props props = new Props("CodeGenConfig.properties");
        return props.getProperty(key);
    }

}
