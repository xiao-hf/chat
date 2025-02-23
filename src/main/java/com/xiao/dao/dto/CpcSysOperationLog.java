package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_sys_operation_log")
@Data
public class CpcSysOperationLog {
    /**
     * 操作日志id，序号
     */
    @ApiModelProperty(value = "操作日志id，序号")
    private Long id;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号")
    private String userId;

    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    /**
     * 单位编号
     */
    @ApiModelProperty(value = "单位编号")
    private String unitNo;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "单位名称")
    private String unitName;

    /**
     * 操作模块
     */
    @ApiModelProperty(value = "操作模块")
    private String operationTitle;

    /**
     * 操作ip
     */
    @ApiModelProperty(value = "操作ip")
    private String operationIp;

    /**
     * 操作名称
     */
    @ApiModelProperty(value = "操作名称")
    private String operationName;

    /**
     * 操作路径url
     */
    @ApiModelProperty(value = "操作路径url")
    private String operationUrl;

    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间")
    private Date operationTime;

    /**
     * 操作结果（0失败，1成功）
     */
    @ApiModelProperty(value = "操作结果（0失败，1成功）")
    private Integer operationStatus;

    /**
     * 请求参数
     */
    @ApiModelProperty(value = "请求参数")
    private String operationParam;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}