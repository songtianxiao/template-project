package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_product_attribute_category`")
public class PmsProductAttributeCategory {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    /**
     * 属性数量
     */
    @Column(name = "`attribute_count`")
    @ApiModelProperty("属性数量")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @Column(name = "`param_count`")
    @ApiModelProperty("参数数量")
    private Integer paramCount;
}