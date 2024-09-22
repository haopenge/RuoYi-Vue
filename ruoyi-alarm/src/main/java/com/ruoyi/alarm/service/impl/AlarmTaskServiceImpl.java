package com.ruoyi.alarm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.alarm.mapper.AlarmTaskMapper;
import com.ruoyi.alarm.domain.AlarmTask;
import com.ruoyi.alarm.service.IAlarmTaskService;

/**
 * 预警任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-22
 */
@Service
public class AlarmTaskServiceImpl implements IAlarmTaskService 
{
    @Autowired
    private AlarmTaskMapper alarmTaskMapper;

    /**
     * 查询预警任务
     * 
     * @param id 预警任务主键
     * @return 预警任务
     */
    @Override
    public AlarmTask selectAlarmTaskById(String id)
    {
        return alarmTaskMapper.selectAlarmTaskById(id);
    }

    /**
     * 查询预警任务列表
     * 
     * @param alarmTask 预警任务
     * @return 预警任务
     */
    @Override
    public List<AlarmTask> selectAlarmTaskList(AlarmTask alarmTask)
    {
        return alarmTaskMapper.selectAlarmTaskList(alarmTask);
    }

    /**
     * 新增预警任务
     * 
     * @param alarmTask 预警任务
     * @return 结果
     */
    @Override
    public int insertAlarmTask(AlarmTask alarmTask)
    {
        alarmTask.setCreateTime(DateUtils.getNowDate());
        return alarmTaskMapper.insertAlarmTask(alarmTask);
    }

    /**
     * 修改预警任务
     * 
     * @param alarmTask 预警任务
     * @return 结果
     */
    @Override
    public int updateAlarmTask(AlarmTask alarmTask)
    {
        alarmTask.setUpdateTime(DateUtils.getNowDate());
        return alarmTaskMapper.updateAlarmTask(alarmTask);
    }

    /**
     * 批量删除预警任务
     * 
     * @param ids 需要删除的预警任务主键
     * @return 结果
     */
    @Override
    public int deleteAlarmTaskByIds(String[] ids)
    {
        return alarmTaskMapper.deleteAlarmTaskByIds(ids);
    }

    /**
     * 删除预警任务信息
     * 
     * @param id 预警任务主键
     * @return 结果
     */
    @Override
    public int deleteAlarmTaskById(String id)
    {
        return alarmTaskMapper.deleteAlarmTaskById(id);
    }
}
