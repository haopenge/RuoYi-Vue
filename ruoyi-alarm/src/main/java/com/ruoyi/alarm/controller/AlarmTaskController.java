package com.ruoyi.alarm.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.alarm.domain.AlarmTask;
import com.ruoyi.alarm.service.IAlarmTaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预警任务Controller
 * 
 * @author ruoyi
 * @date 2024-09-22
 */
@RestController
@RequestMapping("/alarm/task")
public class AlarmTaskController extends BaseController
{
    @Autowired
    private IAlarmTaskService alarmTaskService;

    /**
     * 查询预警任务列表
     */
    @PreAuthorize("@ss.hasPermi('alarm:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(AlarmTask alarmTask)
    {
        startPage();
        List<AlarmTask> list = alarmTaskService.selectAlarmTaskList(alarmTask);
        return getDataTable(list);
    }

    /**
     * 导出预警任务列表
     */
    @PreAuthorize("@ss.hasPermi('alarm:task:export')")
    @Log(title = "预警任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AlarmTask alarmTask)
    {
        List<AlarmTask> list = alarmTaskService.selectAlarmTaskList(alarmTask);
        ExcelUtil<AlarmTask> util = new ExcelUtil<AlarmTask>(AlarmTask.class);
        util.exportExcel(response, list, "预警任务数据");
    }

    /**
     * 获取预警任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('alarm:task:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(alarmTaskService.selectAlarmTaskById(id));
    }

    /**
     * 新增预警任务
     */
    @PreAuthorize("@ss.hasPermi('alarm:task:add')")
    @Log(title = "预警任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AlarmTask alarmTask)
    {
        return toAjax(alarmTaskService.insertAlarmTask(alarmTask));
    }

    /**
     * 修改预警任务
     */
    @PreAuthorize("@ss.hasPermi('alarm:task:edit')")
    @Log(title = "预警任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AlarmTask alarmTask)
    {
        return toAjax(alarmTaskService.updateAlarmTask(alarmTask));
    }

    /**
     * 删除预警任务
     */
    @PreAuthorize("@ss.hasPermi('alarm:task:remove')")
    @Log(title = "预警任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(alarmTaskService.deleteAlarmTaskByIds(ids));
    }
}
