package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_unit")
@Data
public class CpcUnit {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "单位名称")
    private String unitName;

    /**
     * 单位编号
     */
    @ApiModelProperty(value = "单位编号")
    private String unitNo;

    /**
     * 单位地址
     */
    @ApiModelProperty(value = "单位地址")
    private String unitAdress;

    /**
     * 层级
     */
    @ApiModelProperty(value = "层级")
    private Integer unitNum;

    /**
     * 上级单位编号
     */
    @ApiModelProperty(value = "上级单位编号")
    private String unitParentUnitNo;

    /**
     * 单位类型
     */
    @ApiModelProperty(value = "单位类型")
    private Integer type;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
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
    private String createUser;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人")
    private String updateUser;
}