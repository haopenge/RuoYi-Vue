package com.ruoyi.alarm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预警机器人对象 alarm_robot
 * 
 * @author ruoyi
 * @date 2024-09-21
 */
public class AlarmRobot extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 是否启用，1-是  2-否 */
    @Excel(name = "是否启用，1-是  2-否")
    private Long enable;

    /** 模板类型：1-slack 2-wechat 3-submail */
    @Excel(name = "模板类型：1-slack 2-wechat 3-submail")
    private Long type;

    /** 机器人id */
    @Excel(name = "机器人id")
    private String robotId;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String name;

    /** 模板内容 */
    @Excel(name = "模板内容")
    private String hookUrl;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setEnable(Long enable) 
    {
        this.enable = enable;
    }

    public Long getEnable() 
    {
        return enable;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setRobotId(String robotId) 
    {
        this.robotId = robotId;
    }

    public String getRobotId() 
    {
        return robotId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setHookUrl(String hookUrl) 
    {
        this.hookUrl = hookUrl;
    }

    public String getHookUrl() 
    {
        return hookUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("enable", getEnable())
            .append("type", getType())
            .append("robotId", getRobotId())
            .append("name", getName())
            .append("hookUrl", getHookUrl())
            .toString();
    }
}
