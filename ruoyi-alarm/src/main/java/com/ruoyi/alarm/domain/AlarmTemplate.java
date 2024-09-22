package com.ruoyi.alarm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预警模板对象 alarm_template
 * 
 * @author ruoyi
 * @date 2024-09-22
 */
public class AlarmTemplate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Long enable;

    /** 模板类型 */
    @Excel(name = "模板类型")
    private Long type;

    /** 模板id */
    @Excel(name = "模板id")
    private Long templateId;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 模板内容 */
    private String content;

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
