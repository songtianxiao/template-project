package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_member_product_category_relation`")
public class UmsMemberProductCategoryRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`member_id`")
    @ApiModelProperty("")
    private Long memberId;

    @Column(name = "`product_category_id`")
    @ApiModelProperty("")
    private Long productCategoryId;
}