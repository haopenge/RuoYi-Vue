package com.ruoyi.alarm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.alarm.mapper.AlarmTemplateMapper;
import com.ruoyi.alarm.domain.AlarmTemplate;
import com.ruoyi.alarm.service.IAlarmTemplateService;

/**
 * 预警模板Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-11
 */
@Service
public class AlarmTemplateServiceImpl implements IAlarmTemplateService 
{
    @Autowired
    private AlarmTemplateMapper alarmTemplateMapper;

    /**
     * 查询预警模板
     * 
     * @param id 预警模板主键
     * @return 预警模板
     */
    @Override
    public AlarmTemplate selectAlarmTemplateById(String id)
    {
        return alarmTemplateMapper.selectAlarmTemplateById(id);
    }

    /**
     * 查询预警模板列表
     * 
     * @param alarmTemplate 预警模板
     * @return 预警模板
     */
    @Override
    public List<AlarmTemplate> selectAlarmTemplateList(AlarmTemplate alarmTemplate)
    {
        return alarmTemplateMapper.selectAlarmTemplateList(alarmTemplate);
    }

    /**
     * 新增预警模板
     * 
     * @param alarmTemplate 预警模板
     * @return 结果
     */
    @Override
    public int insertAlarmTemplate(AlarmTemplate alarmTemplate)
    {
        alarmTemplate.setCreateTime(DateUtils.getNowDate());
        return alarmTemplateMapper.insertAlarmTemplate(alarmTemplate);
    }

    /**
     * 修改预警模板
     * 
     * @param alarmTemplate 预警模板
     * @return 结果
     */
    @Override
    public int updateAlarmTemplate(AlarmTemplate alarmTemplate)
    {
        alarmTemplate.setUpdateTime(DateUtils.getNowDate());
        return alarmTemplateMapper.updateAlarmTemplate(alarmTemplate);
    }

    /**
     * 批量删除预警模板
     * 
     * @param ids 需要删除的预警模板主键
     * @return 结果
     */
    @Override
    public int deleteAlarmTemplateByIds(String[] ids)
    {
        return alarmTemplateMapper.deleteAlarmTemplateByIds(ids);
    }

    /**
     * 删除预警模板信息
     * 
     * @param id 预警模板主键
     * @return 结果
     */
    @Override
    public int deleteAlarmTemplateById(String id)
    {
        return alarmTemplateMapper.deleteAlarmTemplateById(id);
    }
}
