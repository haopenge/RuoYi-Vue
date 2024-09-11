package com.ruoyi.alarm.mapper;

import java.util.List;
import com.ruoyi.alarm.domain.AlarmTemplate;

/**
 * 预警模板Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-11
 */
public interface AlarmTemplateMapper 
{
    /**
     * 查询预警模板
     * 
     * @param id 预警模板主键
     * @return 预警模板
     */
    public AlarmTemplate selectAlarmTemplateById(String id);

    /**
     * 查询预警模板列表
     * 
     * @param alarmTemplate 预警模板
     * @return 预警模板集合
     */
    public List<AlarmTemplate> selectAlarmTemplateList(AlarmTemplate alarmTemplate);

    /**
     * 新增预警模板
     * 
     * @param alarmTemplate 预警模板
     * @return 结果
     */
    public int insertAlarmTemplate(AlarmTemplate alarmTemplate);

    /**
     * 修改预警模板
     * 
     * @param alarmTemplate 预警模板
     * @return 结果
     */
    public int updateAlarmTemplate(AlarmTemplate alarmTemplate);

    /**
     * 删除预警模板
     * 
     * @param id 预警模板主键
     * @return 结果
     */
    public int deleteAlarmTemplateById(String id);

    /**
     * 批量删除预警模板
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAlarmTemplateByIds(String[] ids);
}
