package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`cms_prefrence_area_product_relation`")
public class CmsPrefrenceAreaProductRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`prefrence_area_id`")
    @ApiModelProperty("")
    private Long prefrenceAreaId;

    @Column(name = "`product_id`")
    @ApiModelProperty("")
    private Long productId;
}