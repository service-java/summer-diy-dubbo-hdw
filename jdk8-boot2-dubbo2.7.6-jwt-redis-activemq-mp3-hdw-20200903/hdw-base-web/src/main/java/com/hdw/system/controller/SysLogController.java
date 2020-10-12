package com.hdw.system.controller;


import com.hdw.common.api.CommonResult;
import com.hdw.common.mybatis.base.vo.PageVo;
import com.hdw.system.entity.SysLog;
import com.hdw.system.dto.LogDTO;
import com.hdw.system.service.ISysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TuMinglong
 * @description 日志管理
 * @date 2018年3月6日 上午9:42:00
 */
@Api(value = "日志管理接口", tags = {"日志管理接口"})
@RestController
@RequestMapping("/sys/log")
public class SysLogController {

    @Reference
    private ISysLogService sysLogService;

    @ApiOperation(value = "日志列表", notes = "日志列表")
    @GetMapping("/list")
    public CommonResult<PageVo<SysLog>> dataGrid(LogDTO logDTO) {

        PageVo<SysLog> page = sysLogService.pageList(logDTO);
        return CommonResult.success(page);
    }
}
