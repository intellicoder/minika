package com.monika.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monika.system.entity.App;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sckj
* @description 针对表【app(app表)】的数据库操作Service
* @createDate 2021-11-14 00:41:54
*/
public interface AppService extends IService<App> {

    Page<App> selectAppsPage(Page<App> page, String keyword);

}
