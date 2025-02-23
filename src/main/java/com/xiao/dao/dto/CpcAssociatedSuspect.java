package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 关联嫌疑人表
 */
@ApiModel(description = "关联嫌疑人表")
@Data
public class CpcAssociatedSuspect {
    /**
     * 嫌疑人唯一标识
     */
    @ApiModelProperty(value = "嫌疑人唯一标识")
    private Long id;

    /**
     * 嫌疑人被关联到的群组id
     */
    @ApiModelProperty(value = "嫌疑人被关联到的群组id")
    private Long associatedGroupId;

    /**
     * 嫌疑人姓名
     */
    @ApiModelProperty(value = "嫌疑人姓名")
    private String name;

    /**
     * 嫌疑人需要填写身份证号
     */
    @ApiModelProperty(value = "嫌疑人需要填写身份证号")
    private String suspectIdNumber;

    /**
     * 填充时要带上照片
     */
    @ApiModelProperty(value = "填充时要带上照片")
    private String entityPicture;

    /**
     * 嫌疑人关联创建时间
     */
    @ApiModelProperty(value = "嫌疑人关联创建时间")
    private Date createTime;

    /**
     * 嫌疑人关联最近更新的时间
     */
    @ApiModelProperty(value = "嫌疑人关联最近更新的时间")
    private Date updateTime;

    /**
     * 嫌疑人关联创建者的id
     */
    @ApiModelProperty(value = "嫌疑人关联创建者的id")
    private Long createUserId;

    /**
     * 嫌疑人关联更新者的id
     */
    @ApiModelProperty(value = "嫌疑人关联更新者的id")
    private Long updateUserId;
}