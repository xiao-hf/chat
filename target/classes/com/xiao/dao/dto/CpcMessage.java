package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(description = "cpc_message")
@Data
public class CpcMessage {
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 短信类型
     */
    @ApiModelProperty(value = "短信类型")
    private String type;

    /**
     * 发送的手机号列表
     */
    @ApiModelProperty(value = "发送的手机号列表")
    private String mobiles;

    @ApiModelProperty(value = "")
    private Integer mobilesNum;

    /**
     * 发送时间
     */
    @ApiModelProperty(value = "发送时间")
    private Date time;

    /**
     * 发送人
     */
    @ApiModelProperty(value = "发送人")
    private Long sendUser;

    /**
     * 发送内容
     */
    @ApiModelProperty(value = "发送内容")
    private String content;

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