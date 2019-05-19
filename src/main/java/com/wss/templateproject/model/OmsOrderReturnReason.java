package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`oms_order_return_reason`")
public class OmsOrderReturnReason {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    /**
     * 退货类型
     */
    @Column(name = "`name`")
    @ApiModelProperty("退货类型")
    private String name;

    @Column(name = "`sort`")
    @ApiModelProperty("")
    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    @Column(name = "`status`")
    @ApiModelProperty("状态：0->不启用；1->启用")
    private Integer status;

    /**
     * 添加时间
     */
    @Column(name = "`create_time`")
    @ApiModelProperty("添加时间")
    private Date createTime;
}