package com.wss.templateproject.service.impl;

import com.wss.templateproject.mapper.PmsBrandMapper;
import com.wss.templateproject.model.PmsBrand;
import com.wss.templateproject.service.PmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 songtx
 * @创建时间 2019-05-15 23:27
 * @描述
 */
@Service
public class PmsServiceImpl implements PmsService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {

        return pmsBrandMapper.selectAll();
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
