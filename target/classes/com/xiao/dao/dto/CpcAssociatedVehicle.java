package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 关联车辆表
 */
@ApiModel(description = "关联车辆表")
@Data
public class CpcAssociatedVehicle {
    /**
     * 载具唯一标识
     */
    @ApiModelProperty(value = "载具唯一标识")
    private Long id;

    /**
     * 载具被关联到的群组id
     */
    @ApiModelProperty(value = "载具被关联到的群组id")
    private Long associatedGroupId;

    /**
     * 载具的号牌,无号牌的情况下为'无号牌'
     */
    @ApiModelProperty(value = "载具的号牌,无号牌的情况下为'无号牌'")
    private String name;

    /**
     * 载具需要填写颜色
     */
    @ApiModelProperty(value = "载具需要填写颜色")
    private String vehicleColor;

    /**
     * 填充时要带上照片
     */
    @ApiModelProperty(value = "填充时要带上照片")
    private String entityPicture;

    /**
     * 载具关联创建时间
     */
    @ApiModelProperty(value = "载具关联创建时间")
    private Date createTime;

    /**
     * 载具关联最近更新的时间
     */
    @ApiModelProperty(value = "载具关联最近更新的时间")
    private Date updateTime;

    /**
     * 载具关联创建者的id
     */
    @ApiModelProperty(value = "载具关联创建者的id")
    private Long createUserId;

    /**
     * 载具关联更新者的id
     */
    @ApiModelProperty(value = "载具关联更新者的id")
    private Long updateUserId;
}