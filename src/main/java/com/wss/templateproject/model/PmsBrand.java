package com.wss.templateproject.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`pms_brand`")
public class PmsBrand {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    /**
     * 首字母
     */
    @Column(name = "`first_letter`")
    private String firstLetter;

    @Column(name = "`sort`")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @Column(name = "`factory_status`")
    private Integer factoryStatus;

    @Column(name = "`show_status`")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @Column(name = "`product_count`")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @Column(name = "`product_comment_count`")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @Column(name = "`logo`")
    private String logo;

    /**
     * 专区大图
     */
    @Column(name = "`big_pic`")
    private String bigPic;

    /**
     * 品牌故事
     */
    @Column(name = "`brand_story`")
    private String brandStory;
}