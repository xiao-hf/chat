package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_permission")
@Data
public class CpcPermission {
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 权限名称
     */
    @ApiModelProperty(value = "权限名称")
    private String permissionName;

    /**
     * 权限内容
     */
    @ApiModelProperty(value = "权限内容")
    private String content;

    /**
     * 权限类别，url-1，other-2
     */
    @ApiModelProperty(value = "权限类别，url-1，other-2")
    private Integer type;

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