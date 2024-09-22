package com.ruoyi.alarm.mapper;

import java.util.List;
import com.ruoyi.alarm.domain.AlarmTask;

/**
 * 预警任务Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-22
 */
public interface AlarmTaskMapper 
{
    /**
     * 查询预警任务
     * 
     * @param id 预警任务主键
     * @return 预警任务
     */
    public AlarmTask selectAlarmTaskById(String id);

    /**
     * 查询预警任务列表
     * 
     * @param alarmTask 预警任务
     * @return 预警任务集合
     */
    public List<AlarmTask> selectAlarmTaskList(AlarmTask alarmTask);

    /**
     * 新增预警任务
     * 
     * @param alarmTask 预警任务
     * @return 结果
     */
    public int insertAlarmTask(AlarmTask alarmTask);

    /**
     * 修改预警任务
     * 
     * @param alarmTask 预警任务
     * @return 结果
     */
    public int updateAlarmTask(AlarmTask alarmTask);

    /**
     * 删除预警任务
     * 
     * @param id 预警任务主键
     * @return 结果
     */
    public int deleteAlarmTaskById(String id);

    /**
     * 批量删除预警任务
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAlarmTaskByIds(String[] ids);
}
