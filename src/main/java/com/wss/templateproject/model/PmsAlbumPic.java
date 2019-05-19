package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_album_pic`")
public class PmsAlbumPic {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`album_id`")
    @ApiModelProperty("")
    private Long albumId;

    @Column(name = "`pic`")
    @ApiModelProperty("")
    private String pic;
}