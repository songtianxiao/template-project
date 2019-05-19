package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_product_category_attribute_relation`")
public class PmsProductCategoryAttributeRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`product_category_id`")
    @ApiModelProperty("")
    private Long productCategoryId;

    @Column(name = "`product_attribute_id`")
    @ApiModelProperty("")
    private Long productAttributeId;
}