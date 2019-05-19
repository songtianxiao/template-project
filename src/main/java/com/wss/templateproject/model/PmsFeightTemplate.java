package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_feight_template`")
public class PmsFeightTemplate {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    @Column(name = "`charge_type`")
    @ApiModelProperty("计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    /**
     * 首重kg
     */
    @Column(name = "`first_weight`")
    @ApiModelProperty("首重kg")
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    @Column(name = "`first_fee`")
    @ApiModelProperty("首费（元）")
    private BigDecimal firstFee;

    @Column(name = "`continue_weight`")
    @ApiModelProperty("")
    private BigDecimal continueWeight;

    @Column(name = "`continme_fee`")
    @ApiModelProperty("")
    private BigDecimal continmeFee;

    /**
     * 目的地（省、市）
     */
    @Column(name = "`dest`")
    @ApiModelProperty("目的地（省、市）")
    private String dest;
}