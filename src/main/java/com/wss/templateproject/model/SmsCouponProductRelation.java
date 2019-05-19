package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`sms_coupon_product_relation`")
public class SmsCouponProductRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`coupon_id`")
    @ApiModelProperty("")
    private Long couponId;

    @Column(name = "`product_id`")
    @ApiModelProperty("")
    private Long productId;

    /**
     * 商品名称
     */
    @Column(name = "`product_name`")
    @ApiModelProperty("商品名称")
    private String productName;

    /**
     * 商品编码
     */
    @Column(name = "`product_sn`")
    @ApiModelProperty("商品编码")
    private String productSn;
}