package com.ruoyi.alarm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预警任务对象 alarm_task
 * 
 * @author ruoyi
 * @date 2024-09-22
 */
public class AlarmTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 是否启用，1-是  2-否 */
    @Excel(name = "是否启用，1-是  2-否")
    private Long enable;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 幂等id */
    @Excel(name = "幂等id")
    private String idempotentValue;

    /** 最小间隔 */
    @Excel(name = "最小间隔")
    private Long notifyMinInterval;

    /** appId */
    @Excel(name = "appId")
    private String appId;

    /** 通知用户 */
    @Excel(name = "通知用户")
    private String notifyUserIds;

    /** 级别 */
    @Excel(name = "级别")
    private Long level;

    /** 类型 */
    @Excel(name = "类型")
    private Long type;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIdempotentValue(String idempotentValue) 
    {
        this.idempotentValue = idempotentValue;
    }

    public String getIdempotentValue() 
    {
        return idempotentValue;
    }
    public void setNotifyMinInterval(Long notifyMinInterval) 
    {
        this.notifyMinInterval = notifyMinInterval;
    }

    public Long getNotifyMinInterval() 
    {
        return notifyMinInterval;
    }
    public void setAppId(String appId) 
    {
        this.appId = appId;
    }

    public String getAppId() 
    {
        return appId;
    }
    public void setNotifyUserIds(String notifyUserIds) 
    {
        this.notifyUserIds = notifyUserIds;
    }

    public String getNotifyUserIds() 
    {
        return notifyUserIds;
    }
    public void setLevel(Long level) 
    {
        this.level = level;
    }

    public Long getLevel() 
    {
        return level;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("enable", getEnable())
            .append("name", getName())
            .append("idempotentValue", getIdempotentValue())
            .append("notifyMinInterval", getNotifyMinInterval())
            .append("appId", getAppId())
            .append("notifyUserIds", getNotifyUserIds())
            .append("level", getLevel())
            .append("type", getType())
            .toString();
    }
}
