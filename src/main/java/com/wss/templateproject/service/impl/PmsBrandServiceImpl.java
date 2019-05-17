package com.wss.templateproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.wss.templateproject.common.beans.CommonPage;
import com.wss.templateproject.mapper.PmsBrandMapper;
import com.wss.templateproject.model.PmsBrand;
import com.wss.templateproject.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @创建人 songtx
 * @创建时间 2019-05-15 23:27
 * @描述
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

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
        brand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CommonPage<PmsBrand> listBrand(PmsBrand pmsBrand,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(PmsBrand.class);
        return CommonPage.restPage(pmsBrandMapper.selectByExample(example));
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
