package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 城市猎人用户表
 */
@ApiModel(description = "城市猎人用户表")
@Data
public class CpcUser {
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * token
     */
    @ApiModelProperty(value = "token")
    private String token;

    /**
     * 警员编号
     */
    @ApiModelProperty(value = "警员编号")
    private String userNo;

    /**
     * 警员姓名
     */
    @ApiModelProperty(value = "警员姓名")
    private String userName;

    /**
     * 电话
     */
    @ApiModelProperty(value = "电话")
    private String userPhone;

    /**
     * 所属单位编号
     */
    @ApiModelProperty(value = "所属单位编号")
    private String userUnitNo;

    /**
     * 是否启用
     */
    @ApiModelProperty(value = "是否启用")
    private Boolean userEnable;

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

    /**
     * 最近一次登录日期
     */
    @ApiModelProperty(value = "最近一次登录日期")
    private Date loginTime;

    /**
     * 登录密码
     */
    @ApiModelProperty(value = "登录密码")
    private String password;
}