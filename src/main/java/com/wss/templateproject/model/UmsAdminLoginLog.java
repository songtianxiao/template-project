package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`ums_admin_login_log`")
public class UmsAdminLoginLog {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`admin_id`")
    @ApiModelProperty("")
    private Long adminId;

    @Column(name = "`create_time`")
    @ApiModelProperty("")
    private Date createTime;

    @Column(name = "`ip`")
    @ApiModelProperty("")
    private String ip;

    @Column(name = "`address`")
    @ApiModelProperty("")
    private String address;

    /**
     * 浏览器登录类型
     */
    @Column(name = "`user_agent`")
    @ApiModelProperty("浏览器登录类型")
    private String userAgent;
}