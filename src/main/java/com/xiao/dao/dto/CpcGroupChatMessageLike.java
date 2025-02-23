package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 消息点赞记录表
 */
@ApiModel(description = "消息点赞记录表")
@Data
public class CpcGroupChatMessageLike {
    /**
     * 点赞唯一标识
     */
    @ApiModelProperty(value = "点赞唯一标识")
    private Long id;

    /**
     * 消息id
     */
    @ApiModelProperty(value = "消息id")
    private Long messageId;

    /**
     * 点赞者id
     */
    @ApiModelProperty(value = "点赞者id")
    private Long likerId;

    /**
     * 点赞时间
     */
    @ApiModelProperty(value = "点赞时间")
    private Date likeTime;
}