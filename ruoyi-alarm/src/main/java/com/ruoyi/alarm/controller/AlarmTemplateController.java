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
import com.ruoyi.alarm.domain.AlarmTemplate;
import com.ruoyi.alarm.service.IAlarmTemplateService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预警模板Controller
 * 
 * @author ruoyi
 * @date 2024-09-22
 */
@RestController
@RequestMapping("/alarm/template")
public class AlarmTemplateController extends BaseController
{
    @Autowired
    private IAlarmTemplateService alarmTemplateService;

    /**
     * 查询预警模板列表
     */
    @PreAuthorize("@ss.hasPermi('alarm:template:list')")
    @GetMapping("/list")
    public TableDataInfo list(AlarmTemplate alarmTemplate)
    {
        startPage();
        List<AlarmTemplate> list = alarmTemplateService.selectAlarmTemplateList(alarmTemplate);
        return getDataTable(list);
    }

    /**
     * 导出预警模板列表
     */
    @PreAuthorize("@ss.hasPermi('alarm:template:export')")
    @Log(title = "预警模板", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AlarmTemplate alarmTemplate)
    {
        List<AlarmTemplate> list = alarmTemplateService.selectAlarmTemplateList(alarmTemplate);
        ExcelUtil<AlarmTemplate> util = new ExcelUtil<AlarmTemplate>(AlarmTemplate.class);
        util.exportExcel(response, list, "预警模板数据");
    }

    /**
     * 获取预警模板详细信息
     */
    @PreAuthorize("@ss.hasPermi('alarm:template:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(alarmTemplateService.selectAlarmTemplateById(id));
    }

    /**
     * 新增预警模板
     */
    @PreAuthorize("@ss.hasPermi('alarm:template:add')")
    @Log(title = "预警模板", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AlarmTemplate alarmTemplate)
    {
        return toAjax(alarmTemplateService.insertAlarmTemplate(alarmTemplate));
    }

    /**
     * 修改预警模板
     */
    @PreAuthorize("@ss.hasPermi('alarm:template:edit')")
    @Log(title = "预警模板", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AlarmTemplate alarmTemplate)
    {
        return toAjax(alarmTemplateService.updateAlarmTemplate(alarmTemplate));
    }

    /**
     * 删除预警模板
     */
    @PreAuthorize("@ss.hasPermi('alarm:template:remove')")
    @Log(title = "预警模板", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(alarmTemplateService.deleteAlarmTemplateByIds(ids));
    }
}
