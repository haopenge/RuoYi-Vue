package com.ruoyi.alarm.service;

import java.util.List;
import com.ruoyi.alarm.domain.AlarmRobot;

/**
 * 预警机器人Service接口
 * 
 * @author ruoyi
 * @date 2024-09-21
 */
public interface IAlarmRobotService 
{
    /**
     * 查询预警机器人
     * 
     * @param id 预警机器人主键
     * @return 预警机器人
     */
    public AlarmRobot selectAlarmRobotById(String id);

    /**
     * 查询预警机器人列表
     * 
     * @param alarmRobot 预警机器人
     * @return 预警机器人集合
     */
    public List<AlarmRobot> selectAlarmRobotList(AlarmRobot alarmRobot);

    /**
     * 新增预警机器人
     * 
     * @param alarmRobot 预警机器人
     * @return 结果
     */
    public int insertAlarmRobot(AlarmRobot alarmRobot);

    /**
     * 修改预警机器人
     * 
     * @param alarmRobot 预警机器人
     * @return 结果
     */
    public int updateAlarmRobot(AlarmRobot alarmRobot);

    /**
     * 批量删除预警机器人
     * 
     * @param ids 需要删除的预警机器人主键集合
     * @return 结果
     */
    public int deleteAlarmRobotByIds(String[] ids);

    /**
     * 删除预警机器人信息
     * 
     * @param id 预警机器人主键
     * @return 结果
     */
    public int deleteAlarmRobotById(String id);
}
