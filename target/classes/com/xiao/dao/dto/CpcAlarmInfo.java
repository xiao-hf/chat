package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_alarm_info")
@Data
public class CpcAlarmInfo {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private String id;

    /**
     * 商汤告警人脸id
     */
    @ApiModelProperty(value = "商汤告警人脸id")
    private String alarmId;

    /**
     * 人员id
     */
    @ApiModelProperty(value = "人员id")
    private Long personId;

    /**
     * 人员身份证
     */
    @ApiModelProperty(value = "人员身份证")
    private String personIdCode;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String personName;

    /**
     * 相似度
     */
    @ApiModelProperty(value = "相似度")
    private Double similarityDegree;

    /**
     * 抓拍时间
     */
    @ApiModelProperty(value = "抓拍时间")
    private Date shotTime;

    /**
     * 抓拍小区id
     */
    @ApiModelProperty(value = "抓拍小区id")
    private String alarmCommunityId;

    /**
     * 抓拍小区代码
     */
    @ApiModelProperty(value = "抓拍小区代码")
    private String alarmCommunityDmdm;

    /**
     * 国标设备id
     */
    @ApiModelProperty(value = "国标设备id")
    private String deviceCode;

    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    /**
     * 商汤设备id
     */
    @ApiModelProperty(value = "商汤设备id")
    private String deviceId;

    /**
     * 相机经纬度
     */
    @ApiModelProperty(value = "相机经纬度")
    private Double latitude;

    /**
     * 相机经纬度
     */
    @ApiModelProperty(value = "相机经纬度")
    private Double longitude;

    /**
     * 大图url
     */
    @ApiModelProperty(value = "大图url")
    private String bigUrl;

    /**
     * 小图url
     */
    @ApiModelProperty(value = "小图url")
    private String smallUrl;

    /**
     * 插入时间
     */
    @ApiModelProperty(value = "插入时间")
    private Date createDate;
}