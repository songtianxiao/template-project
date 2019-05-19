package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`pms_product_full_reduction`")
public class PmsProductFullReduction {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`product_id`")
    @ApiModelProperty("")
    private Long productId;

    @Column(name = "`full_price`")
    @ApiModelProperty("")
    private BigDecimal fullPrice;

    @Column(name = "`reduce_price`")
    @ApiModelProperty("")
    private BigDecimal reducePrice;
}