package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_job")
@Data
public class CpcJob {
    /**
     * 任务序号
     */
    @ApiModelProperty(value = "任务序号")
    private Long jobId;

    /**
     * 任务名称
     */
    @ApiModelProperty(value = "任务名称")
    private String jobName;

    /**
     * 任务代码
     */
    @ApiModelProperty(value = "任务代码")
    private String jobCode;

    /**
     * 任务组名
     */
    @ApiModelProperty(value = "任务组名")
    private String jobGroup;

    /**
     * 调用目标字符串
     */
    @ApiModelProperty(value = "调用目标字符串")
    private String invokeTarget;

    /**
     * cron执行表达式
     */
    @ApiModelProperty(value = "cron执行表达式")
    private String cronExpression;

    /**
     * cron计划策略(0=默认,1=立即触发执行,2=触发一次执行,3=不触发立即执行)
     */
    @ApiModelProperty(value = "cron计划策略(0=默认,1=立即触发执行,2=触发一次执行,3=不触发立即执行)")
    private String misfirePolicy;

    /**
     * 是否并发执行（0允许 1禁止）
     */
    @ApiModelProperty(value = "是否并发执行（0允许 1禁止）")
    private String concurrent;

    /**
     * 任务状态（0正常 1暂停）
     */
    @ApiModelProperty(value = "任务状态（0正常 1暂停）")
    private String status;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 插入时间
     */
    @ApiModelProperty(value = "插入时间")
    private Date createDate;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long createUserId;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人")
    private Long updateUserId;
}