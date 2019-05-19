package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_admin_permission_relation`")
public class UmsAdminPermissionRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`admin_id`")
    @ApiModelProperty("")
    private Long adminId;

    @Column(name = "`permission_id`")
    @ApiModelProperty("")
    private Long permissionId;

    @Column(name = "`type`")
    @ApiModelProperty("")
    private Integer type;
}