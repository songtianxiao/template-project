package com.wss.templateproject.service;

import com.wss.templateproject.common.beans.CommonPage;
import com.wss.templateproject.model.PmsBrand;

import java.util.List;

/**
 * @创建人 songtx
 * @创建时间 2019-05-15 21:34
 * @描述
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    CommonPage<PmsBrand> listBrand(PmsBrand brand,Integer pageNum, Integer pageSize);

    PmsBrand getBrand(Long id);
}
