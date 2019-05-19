package com.wss.templateproject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`cms_subject_product_relation`")
public class CmsSubjectProductRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`subject_id`")
    @ApiModelProperty("")
    private Long subjectId;

    @Column(name = "`product_id`")
    @ApiModelProperty("")
    private Long productId;
}