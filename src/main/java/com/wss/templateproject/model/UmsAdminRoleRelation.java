package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_admin_role_relation`")
public class UmsAdminRoleRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`admin_id`")
    @ApiModelProperty("")
    private Long adminId;

    @Column(name = "`role_id`")
    @ApiModelProperty("")
    private Long roleId;
}