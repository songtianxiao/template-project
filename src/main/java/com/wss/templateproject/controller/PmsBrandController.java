package com.wss.templateproject.controller;

import com.wss.templateproject.common.beans.CommonPage;
import com.wss.templateproject.common.beans.ResultBean;
import com.wss.templateproject.model.PmsBrand;
import com.wss.templateproject.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 songtx
 * @创建时间 2019-05-16 20:43
 * @描述
 */
@RestController
@RequestMapping("/pmsBrand/")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @GetMapping("selectPmsBrandPage")
    public ResultBean<CommonPage<PmsBrand>> selectPmsBrandPage(Integer pageNum,Integer pageSize){
        return new ResultBean<CommonPage<PmsBrand>>(pmsBrandService.listBrand(pageNum,pageSize));
    }

    @PostMapping("addPmsBrand")
    public ResultBean<Integer> addPmsBrand(PmsBrand pmsBrand){
        return new ResultBean<Integer>(pmsBrandService.createBrand(pmsBrand));
    }

    @PostMapping("updatePmsBrand")
    public ResultBean<Integer> updatePmsBrand(PmsBrand pmsBrand){
        return new ResultBean<Integer>(pmsBrandService.createBrand(pmsBrand));
    }

    @GetMapping("deletePmsBrand")
    public ResultBean<Integer> deletePmsBrand(Long id){
        return new ResultBean<Integer>(pmsBrandService.deleteBrand(id));
    }

    @GetMapping("selectPmsBrand")
    public ResultBean<PmsBrand> selectPmsBrand(Long id){
        return new ResultBean<PmsBrand>(pmsBrandService.getBrand(id));
    }

}
