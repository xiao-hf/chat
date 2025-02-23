package com.xiao.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 群聊人员关系表
 */
@ApiModel(description = "群聊人员关系表")
@Data
public class CpcGroupRelation {
    /**
     * 群组和参与成员之间的唯一标识
     */
    @ApiModelProperty(value = "群组和参与成员之间的唯一标识")
    private Long id;

    /**
     * 群聊id
     */
    @ApiModelProperty(value = "群聊id")
    private Long groupId;

    /**
     * 成员id
     */
    @ApiModelProperty(value = "成员id")
    private Long memberId;

    /**
     * 成员在该群聊内昵称
     */
    @ApiModelProperty(value = "成员在该群聊内昵称")
    private String nickname;

    /**
     * 群员在群内的的身份 ('群主'/'管理员'/'群员')
     */
    @ApiModelProperty(value = "群员在群内的的身份 ('群主'/'管理员'/'群员')")
    private Object role;

    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
    private String username;

    /**
     * 警号
     */
    @ApiModelProperty(value = "警号")
    private String userNo;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "单位名称")
    private String unitName;
}