package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`oms_order_item`")
public class OmsOrderItem {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    /**
     * 订单id
     */
    @Column(name = "`order_id`")
    @ApiModelProperty("订单id")
    private Long orderId;

    /**
     * 订单编号
     */
    @Column(name = "`order_sn`")
    @ApiModelProperty("订单编号")
    private String orderSn;

    @Column(name = "`product_id`")
    @ApiModelProperty("")
    private Long productId;

    @Column(name = "`product_pic`")
    @ApiModelProperty("")
    private String productPic;

    @Column(name = "`product_name`")
    @ApiModelProperty("")
    private String productName;

    @Column(name = "`product_brand`")
    @ApiModelProperty("")
    private String productBrand;

    @Column(name = "`product_sn`")
    @ApiModelProperty("")
    private String productSn;

    /**
     * 销售价格
     */
    @Column(name = "`product_price`")
    @ApiModelProperty("销售价格")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @Column(name = "`product_quantity`")
    @ApiModelProperty("购买数量")
    private Integer productQuantity;

    /**
     * 商品sku编号
     */
    @Column(name = "`product_sku_id`")
    @ApiModelProperty("商品sku编号")
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    @Column(name = "`product_sku_code`")
    @ApiModelProperty("商品sku条码")
    private String productSkuCode;

    /**
     * 商品分类id
     */
    @Column(name = "`product_category_id`")
    @ApiModelProperty("商品分类id")
    private Long productCategoryId;

    /**
     * 商品的销售属性
     */
    @Column(name = "`sp1`")
    @ApiModelProperty("商品的销售属性")
    private String sp1;

    @Column(name = "`sp2`")
    @ApiModelProperty("")
    private String sp2;

    @Column(name = "`sp3`")
    @ApiModelProperty("")
    private String sp3;

    /**
     * 商品促销名称
     */
    @Column(name = "`promotion_name`")
    @ApiModelProperty("商品促销名称")
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    @Column(name = "`promotion_amount`")
    @ApiModelProperty("商品促销分解金额")
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @Column(name = "`coupon_amount`")
    @ApiModelProperty("优惠券优惠分解金额")
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    @Column(name = "`integration_amount`")
    @ApiModelProperty("积分优惠分解金额")
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @Column(name = "`real_amount`")
    @ApiModelProperty("该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @Column(name = "`gift_integration`")
    @ApiModelProperty("")
    private Integer giftIntegration;

    @Column(name = "`gift_growth`")
    @ApiModelProperty("")
    private Integer giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @Column(name = "`product_attr`")
    @ApiModelProperty("商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量',' value' :'4G' }]")
    private String productAttr;
}