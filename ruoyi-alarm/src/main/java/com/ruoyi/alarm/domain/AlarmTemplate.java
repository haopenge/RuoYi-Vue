package com.ruoyi.alarm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预警模板对象 alarm_template
 * 
 * @author ruoyi
 * @date 2024-09-11
 */
public class AlarmTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 是否启用，1-是  2-否 */
    @Excel(name = "是否启用，1-是  2-否")
    private Integer enable;

    /** 模板类型：1-slack 2-wechat 3-submail */
    @Excel(name = "模板类型：1-slack 2-wechat 3-submail")
    private Integer type;

    /** 模板id */
    @Excel(name = "模板id")
    private Long templateId;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String name;

    /** 模板内容 */
    @Excel(name = "模板内容")
    private String content;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setEnable(Integer enable) 
    {
        this.enable = enable;
    }

    public Integer getEnable() 
    {
        return enable;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setTemplateId(Long templateId) 
    {
        this.templateId = templateId;
    }

    public Long getTemplateId() 
    {
        return templateId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("enable", getEnable())
            .append("type", getType())
            .append("templateId", getTemplateId())
            .append("name", getName())
            .append("content", getContent())
            .toString();
    }
}
