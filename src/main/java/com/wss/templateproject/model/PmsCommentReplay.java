package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_comment_replay`")
public class PmsCommentReplay {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`comment_id`")
    @ApiModelProperty("")
    private Long commentId;

    @Column(name = "`member_nick_name`")
    @ApiModelProperty("")
    private String memberNickName;

    @Column(name = "`member_icon`")
    @ApiModelProperty("")
    private String memberIcon;

    @Column(name = "`content`")
    @ApiModelProperty("")
    private String content;

    @Column(name = "`create_time`")
    @ApiModelProperty("")
    private Date createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    @Column(name = "`type`")
    @ApiModelProperty("评论人员类型；0->会员；1->管理员")
    private Integer type;
}