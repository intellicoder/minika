package com.monoka.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.monoka.generator.config.DefaultDataSourceConfig;
import com.monoka.generator.config.DefaultGlobalConfig;
import com.monoka.generator.config.DefaultPackageConfig;
import com.monoka.generator.utils.PropertiesUtils;

public class CodeGen {

    public void genCode() {

        AutoGenerator mpg = new AutoGenerator();

        mpg.setGlobalConfig(DefaultGlobalConfig.getGlobalConfig());
        mpg.setDataSource(DefaultDataSourceConfig.getDataSourceConfig());
        mpg.setPackageInfo(DefaultPackageConfig.getPackageConfig());

    }

    public static void main(String[] args) {

        System.out.println(PropertiesUtils.getValue("package.parent"));


    }

}
