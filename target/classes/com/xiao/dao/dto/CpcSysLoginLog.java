package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_sys_login_log")
@Data
public class CpcSysLoginLog {
    /**
     * 登录日志主键id
     */
    @ApiModelProperty(value = "登录日志主键id")
    private Long id;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号")
    private String userId;

    /**
     * 用户名称、昵称
     */
    @ApiModelProperty(value = "用户名称、昵称")
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
     * 登录ip
     */
    @ApiModelProperty(value = "登录ip")
    private String loginIp;

    @ApiModelProperty(value = "")
    private Integer status;

    @ApiModelProperty(value = "")
    private String remark;

    /**
     * 登录时间
     */
    @ApiModelProperty(value = "登录时间")
    private Date loginTime;
}