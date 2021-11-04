package com.monoka.generator.config;

import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.monoka.generator.utils.PropertiesUtils;
import com.monoka.generator.utils.ScannerUtils;

public class DefaultPackageConfig {

    public static PackageConfig getPackageConfig() {
        PackageConfig packageConfig = new PackageConfig();

        packageConfig.setModuleName(ScannerUtils.scanner("模块名"));
        packageConfig.setParent(PropertiesUtils.getValue("package.parent"));

        return packageConfig;
    }

}
