package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_album`")
public class PmsAlbum {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    @Column(name = "`cover_pic`")
    @ApiModelProperty("")
    private String coverPic;

    @Column(name = "`pic_count`")
    @ApiModelProperty("")
    private Integer picCount;

    @Column(name = "`sort`")
    @ApiModelProperty("")
    private Integer sort;

    @Column(name = "`description`")
    @ApiModelProperty("")
    private String description;
}