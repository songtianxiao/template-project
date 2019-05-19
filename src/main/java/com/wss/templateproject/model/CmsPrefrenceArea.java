package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`cms_prefrence_area`")
public class CmsPrefrenceArea {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    @Column(name = "`sub_title`")
    @ApiModelProperty("")
    private String subTitle;

    @Column(name = "`sort`")
    @ApiModelProperty("")
    private Integer sort;

    @Column(name = "`show_status`")
    @ApiModelProperty("")
    private Integer showStatus;

    /**
     * 展示图片
     */
    @Column(name = "`pic`")
    @ApiModelProperty("展示图片")
    private byte[] pic;
}