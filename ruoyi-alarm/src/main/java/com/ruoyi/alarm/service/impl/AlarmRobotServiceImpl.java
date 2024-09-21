package com.ruoyi.alarm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.alarm.mapper.AlarmRobotMapper;
import com.ruoyi.alarm.domain.AlarmRobot;
import com.ruoyi.alarm.service.IAlarmRobotService;

/**
 * 预警机器人Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-21
 */
@Service
public class AlarmRobotServiceImpl implements IAlarmRobotService 
{
    @Autowired
    private AlarmRobotMapper alarmRobotMapper;

    /**
     * 查询预警机器人
     * 
     * @param id 预警机器人主键
     * @return 预警机器人
     */
    @Override
    public AlarmRobot selectAlarmRobotById(String id)
    {
        return alarmRobotMapper.selectAlarmRobotById(id);
    }

    /**
     * 查询预警机器人列表
     * 
     * @param alarmRobot 预警机器人
     * @return 预警机器人
     */
    @Override
    public List<AlarmRobot> selectAlarmRobotList(AlarmRobot alarmRobot)
    {
        return alarmRobotMapper.selectAlarmRobotList(alarmRobot);
    }

    /**
     * 新增预警机器人
     * 
     * @param alarmRobot 预警机器人
     * @return 结果
     */
    @Override
    public int insertAlarmRobot(AlarmRobot alarmRobot)
    {
        alarmRobot.setCreateTime(DateUtils.getNowDate());
        return alarmRobotMapper.insertAlarmRobot(alarmRobot);
    }

    /**
     * 修改预警机器人
     * 
     * @param alarmRobot 预警机器人
     * @return 结果
     */
    @Override
    public int updateAlarmRobot(AlarmRobot alarmRobot)
    {
        alarmRobot.setUpdateTime(DateUtils.getNowDate());
        return alarmRobotMapper.updateAlarmRobot(alarmRobot);
    }

    /**
     * 批量删除预警机器人
     * 
     * @param ids 需要删除的预警机器人主键
     * @return 结果
     */
    @Override
    public int deleteAlarmRobotByIds(String[] ids)
    {
        return alarmRobotMapper.deleteAlarmRobotByIds(ids);
    }

    /**
     * 删除预警机器人信息
     * 
     * @param id 预警机器人主键
     * @return 结果
     */
    @Override
    public int deleteAlarmRobotById(String id)
    {
        return alarmRobotMapper.deleteAlarmRobotById(id);
    }
}
