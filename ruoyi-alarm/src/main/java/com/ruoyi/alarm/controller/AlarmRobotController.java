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
import com.ruoyi.alarm.domain.AlarmRobot;
import com.ruoyi.alarm.service.IAlarmRobotService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预警机器人Controller
 * 
 * @author ruoyi
 * @date 2024-09-21
 */
@RestController
@RequestMapping("/alarm/robot")
public class AlarmRobotController extends BaseController
{
    @Autowired
    private IAlarmRobotService alarmRobotService;

    /**
     * 查询预警机器人列表
     */
    @PreAuthorize("@ss.hasPermi('alarm:robot:list')")
    @GetMapping("/list")
    public TableDataInfo list(AlarmRobot alarmRobot)
    {
        startPage();
        List<AlarmRobot> list = alarmRobotService.selectAlarmRobotList(alarmRobot);
        return getDataTable(list);
    }

    /**
     * 导出预警机器人列表
     */
    @PreAuthorize("@ss.hasPermi('alarm:robot:export')")
    @Log(title = "预警机器人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AlarmRobot alarmRobot)
    {
        List<AlarmRobot> list = alarmRobotService.selectAlarmRobotList(alarmRobot);
        ExcelUtil<AlarmRobot> util = new ExcelUtil<AlarmRobot>(AlarmRobot.class);
        util.exportExcel(response, list, "预警机器人数据");
    }

    /**
     * 获取预警机器人详细信息
     */
    @PreAuthorize("@ss.hasPermi('alarm:robot:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(alarmRobotService.selectAlarmRobotById(id));
    }

    /**
     * 新增预警机器人
     */
    @PreAuthorize("@ss.hasPermi('alarm:robot:add')")
    @Log(title = "预警机器人", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AlarmRobot alarmRobot)
    {
        return toAjax(alarmRobotService.insertAlarmRobot(alarmRobot));
    }

    /**
     * 修改预警机器人
     */
    @PreAuthorize("@ss.hasPermi('alarm:robot:edit')")
    @Log(title = "预警机器人", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AlarmRobot alarmRobot)
    {
        return toAjax(alarmRobotService.updateAlarmRobot(alarmRobot));
    }

    /**
     * 删除预警机器人
     */
    @PreAuthorize("@ss.hasPermi('alarm:robot:remove')")
    @Log(title = "预警机器人", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(alarmRobotService.deleteAlarmRobotByIds(ids));
    }
}
