package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 消息聊天表
 */
@ApiModel(description = "消息聊天表")
@Data
public class CpcGroupChatMessage {
    /**
     * 消息唯一标识
     */
    @ApiModelProperty(value = "消息唯一标识")
    private Long id;

    /**
     * 消息存在的群组id
     */
    @ApiModelProperty(value = "消息存在的群组id")
    private Long groupId;

    /**
     * 消息内容
     */
    @ApiModelProperty(value = "消息内容")
    private String content;

    /**
     * 消息的类型 ('文本'/'图片'/'视频'/'文件')
     */
    @ApiModelProperty(value = "消息的类型 ('文本'/'图片'/'视频'/'文件')")
    private String contentType;

    /**
     * 消息是否被删除
     */
    @ApiModelProperty(value = "消息是否被删除")
    private Boolean isDeleted;

    /**
     * 是否标记为关键信息
     */
    @ApiModelProperty(value = "是否标记为关键信息")
    private Boolean isKeyMessage;

    /**
     * 是否被置顶
     */
    @ApiModelProperty(value = "是否被置顶")
    private Boolean isPinned;

    /**
     * 消息被置顶的时间
     */
    @ApiModelProperty(value = "消息被置顶的时间")
    private Date pinnedTime;

    /**
     * 消息创建的时间
     */
    @ApiModelProperty(value = "消息创建的时间")
    private Date createTime;

    /**
     * 消息更新者的id
     */
    @ApiModelProperty(value = "消息更新者的id")
    private Long updateUserId;
}