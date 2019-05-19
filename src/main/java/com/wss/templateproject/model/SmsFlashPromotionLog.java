package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`sms_flash_promotion_log`")
public class SmsFlashPromotionLog {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Integer id;

    @Column(name = "`member_id`")
    @ApiModelProperty("")
    private Integer memberId;

    @Column(name = "`product_id`")
    @ApiModelProperty("")
    private Long productId;

    @Column(name = "`member_phone`")
    @ApiModelProperty("")
    private String memberPhone;

    @Column(name = "`product_name`")
    @ApiModelProperty("")
    private String productName;

    /**
     * 会员订阅时间
     */
    @Column(name = "`subscribe_time`")
    @ApiModelProperty("会员订阅时间")
    private Date subscribeTime;

    @Column(name = "`send_time`")
    @ApiModelProperty("")
    private Date sendTime;
}