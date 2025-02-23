package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * 群组信息表
 */
@ApiModel(description = "群组信息表")
@Data
public class CpcGroupTable {
    /**
     * 群组唯一标识
     */
    @ApiModelProperty(value = "群组唯一标识")
    private Long id;

    /**
     * 群组名称
     */
    @ApiModelProperty(value = "群组名称")
    private String groupName;

    /**
     * 关联案件名称
     */
    @ApiModelProperty(value = "关联案件名称")
    private String caseName;

    /**
     * 关联案件的简述
     */
    @ApiModelProperty(value = "关联案件的简述")
    private String caseBrief;

    /**
     * 是否置顶 默认否
     */
    @ApiModelProperty(value = "是否置顶 默认否")
    private Boolean isPinned;

    /**
     * 是否已删除 默认否
     */
    @ApiModelProperty(value = "是否已删除 默认否")
    private Boolean isDeleted;

    /**
     * 是否进行中 ('进行中'/'已结案')
     */
    @ApiModelProperty(value = "是否进行中 ('进行中'/'已结案')")
    private Object groupStatus;

    /**
     * 群组被关联的群组id
     */
    @ApiModelProperty(value = "群组被关联的群组id")
    private Long parentGroupId;

    /**
     * 群聊创建时间
     */
    @ApiModelProperty(value = "群聊创建时间")
    private Date createTime;

    /**
     * 群聊成员最近更新的时间
     */
    @ApiModelProperty(value = "群聊成员最近更新的时间")
    private Date updateTime;

    /**
     * 群聊创建者的id
     */
    @ApiModelProperty(value = "群聊创建者的id")
    private Long createUserId;

    /**
     * 群聊成员更新者的id
     */
    @ApiModelProperty(value = "群聊成员更新者的id")
    private Long updateUserId;
}