package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`cms_topic_comment`")
public class CmsTopicComment {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`member_nick_name`")
    @ApiModelProperty("")
    private String memberNickName;

    @Column(name = "`topic_id`")
    @ApiModelProperty("")
    private Long topicId;

    @Column(name = "`member_icon`")
    @ApiModelProperty("")
    private String memberIcon;

    @Column(name = "`content`")
    @ApiModelProperty("")
    private String content;

    @Column(name = "`create_time`")
    @ApiModelProperty("")
    private Date createTime;

    @Column(name = "`show_status`")
    @ApiModelProperty("")
    private Integer showStatus;
}