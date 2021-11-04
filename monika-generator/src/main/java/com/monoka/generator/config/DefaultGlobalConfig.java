package com.monoka.generator.config;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.monoka.generator.utils.PropertiesUtils;

public class DefaultGlobalConfig {

    public static GlobalConfig getGlobalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();

        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath + "/src/main/java");
        globalConfig.setAuthor(PropertiesUtils.getValue("author"));
        globalConfig.setOpen(false);

        return globalConfig;
    }

}
