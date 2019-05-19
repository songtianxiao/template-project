package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_member_task`")
public class UmsMemberTask {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    /**
     * 赠送成长值
     */
    @Column(name = "`growth`")
    @ApiModelProperty("赠送成长值")
    private Integer growth;

    /**
     * 赠送积分
     */
    @Column(name = "`intergration`")
    @ApiModelProperty("赠送积分")
    private Integer intergration;

    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    @Column(name = "`type`")
    @ApiModelProperty("任务类型：0->新手任务；1->日常任务")
    private Integer type;
}