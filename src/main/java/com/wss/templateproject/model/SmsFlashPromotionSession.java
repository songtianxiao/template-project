package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`sms_flash_promotion_session`")
public class SmsFlashPromotionSession {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("编号")
    private Long id;

    /**
     * 场次名称
     */
    @Column(name = "`name`")
    @ApiModelProperty("场次名称")
    private String name;

    /**
     * 每日开始时间
     */
    @Column(name = "`start_time`")
    @ApiModelProperty("每日开始时间")
    private Date startTime;

    /**
     * 每日结束时间
     */
    @Column(name = "`end_time`")
    @ApiModelProperty("每日结束时间")
    private Date endTime;

    /**
     * 启用状态：0->不启用；1->启用
     */
    @Column(name = "`status`")
    @ApiModelProperty("启用状态：0->不启用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    @ApiModelProperty("创建时间")
    private Date createTime;
}