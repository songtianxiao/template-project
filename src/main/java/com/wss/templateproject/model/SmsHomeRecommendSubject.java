package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`sms_home_recommend_subject`")
public class SmsHomeRecommendSubject {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`subject_id`")
    @ApiModelProperty("")
    private Long subjectId;

    @Column(name = "`subject_name`")
    @ApiModelProperty("")
    private String subjectName;

    @Column(name = "`recommend_status`")
    @ApiModelProperty("")
    private Integer recommendStatus;

    @Column(name = "`sort`")
    @ApiModelProperty("")
    private Integer sort;
}