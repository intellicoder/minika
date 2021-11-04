package com.monoka.generator.config;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.monoka.generator.utils.PropertiesUtils;

public class DefaultDataSourceConfig {

    public static DataSourceConfig getDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();

        dsc.setDriverName(PropertiesUtils.getValue("datasource.drivername"));
        dsc.setUrl(PropertiesUtils.getValue("datasource.url"));
        dsc.setUsername(PropertiesUtils.getValue("datasource.username"));
        dsc.setPassword(PropertiesUtils.getValue("datasource.password"));

        return dsc;

    }

}
