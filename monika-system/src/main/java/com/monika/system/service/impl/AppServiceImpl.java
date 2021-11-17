package com.monika.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monika.system.entity.App;
import com.monika.system.service.AppService;
import com.monika.system.mapper.AppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
* @author sckj
* @description 针对表【app(app表)】的数据库操作Service实现
* @createDate 2021-11-14 00:41:54
*/
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>
    implements AppService{

    @Autowired
    private AppMapper appMapper;

    @Override
    public Page<App> selectAppsPage(Page<App> page, String keyword) {
        QueryWrapper<App> queryWrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            queryWrapper.like("app_name", keyword);
        }
        return appMapper.selectPage(page, queryWrapper);
    }
}




