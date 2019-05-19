package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`sms_flash_promotion`")
public class SmsFlashPromotion {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`title`")
    @ApiModelProperty("")
    private String title;

    /**
     * 开始日期
     */
    @Column(name = "`start_date`")
    @ApiModelProperty("开始日期")
    private Date startDate;

    /**
     * 结束日期
     */
    @Column(name = "`end_date`")
    @ApiModelProperty("结束日期")
    private Date endDate;

    /**
     * 上下线状态
     */
    @Column(name = "`status`")
    @ApiModelProperty("上下线状态")
    private Integer status;

    /**
     * 秒杀时间段名称
     */
    @Column(name = "`create_time`")
    @ApiModelProperty("秒杀时间段名称")
    private Date createTime;
}