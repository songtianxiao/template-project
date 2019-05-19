package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`cms_help_category`")
public class CmsHelpCategory {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    /**
     * 分类图标
     */
    @Column(name = "`icon`")
    @ApiModelProperty("分类图标")
    private String icon;

    /**
     * 专题数量
     */
    @Column(name = "`help_count`")
    @ApiModelProperty("专题数量")
    private Integer helpCount;

    @Column(name = "`show_status`")
    @ApiModelProperty("")
    private Integer showStatus;

    @Column(name = "`sort`")
    @ApiModelProperty("")
    private Integer sort;
}