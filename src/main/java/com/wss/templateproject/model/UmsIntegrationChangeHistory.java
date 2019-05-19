package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_integration_change_history`")
public class UmsIntegrationChangeHistory {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`member_id`")
    @ApiModelProperty("")
    private Long memberId;

    @Column(name = "`create_time`")
    @ApiModelProperty("")
    private Date createTime;

    /**
     * 改变类型：0->增加；1->减少
     */
    @Column(name = "`change_type`")
    @ApiModelProperty("改变类型：0->增加；1->减少")
    private Integer changeType;

    /**
     * 积分改变数量
     */
    @Column(name = "`change_count`")
    @ApiModelProperty("积分改变数量")
    private Integer changeCount;

    /**
     * 操作人员
     */
    @Column(name = "`operate_man`")
    @ApiModelProperty("操作人员")
    private String operateMan;

    /**
     * 操作备注
     */
    @Column(name = "`operate_note`")
    @ApiModelProperty("操作备注")
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    @Column(name = "`source_type`")
    @ApiModelProperty("积分来源：0->购物；1->管理员修改")
    private Integer sourceType;
}