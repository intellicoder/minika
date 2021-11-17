package com.monika.system.controller;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monika.system.common.ResultVo;
import com.monika.system.entity.App;
import com.monika.system.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping
    public ResultVo<?> getAll() {
        return ResultVo.success().setData(appService.list());
    }

    /**
     * 分页查询
     * @param page 页码
     * @param size 页面大小
     * @param keyword 查询关键字
     * @return
     */
    @GetMapping("/queryPage")
    public ResultVo<?> queryPage(long page, long size, String keyword) {
        Page<App> pageVO = new Page<>();
        pageVO.setCurrent(page);
        pageVO.setSize(size);
        return ResultVo.success().setData(appService.selectAppsPage(pageVO, keyword));
    }

    /**
     * 删除app
     * @param appId 应用Id
     * @return
     */
    @DeleteMapping("/{appId}")
    public ResultVo<?> deleteAppById(@PathVariable(value = "appId") String appId) {
        return ResultVo.success().setData(appService.removeById(appId));
    }

    /**
     * 新增app
     * @param app
     * @return
     */
    @PostMapping("/")
    public ResultVo<?> saveOrUpdate(App app) {
        return ResultVo.success().setData(appService.saveOrUpdate(app));
    }


}
