package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_role_permission_relation`")
public class UmsRolePermissionRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`role_id`")
    @ApiModelProperty("")
    private Long roleId;

    @Column(name = "`permission_id`")
    @ApiModelProperty("")
    private Long permissionId;
}