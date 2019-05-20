package com.wss.templateproject.controller;

import com.wss.templateproject.common.beans.CommonPage;
import com.wss.templateproject.common.beans.ResultBean;
import com.wss.templateproject.model.PmsBrand;
import com.wss.templateproject.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 songtx
 * @创建时间 2019-05-16 20:43
 * @描述 品牌管理
 */
@Api(tags = "PmsBrandController",description = "商品品牌管理")
@RestController
@RequestMapping("/pmsBrand/")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @ApiOperation("分页查询品牌列表")
    @GetMapping("selectPmsBrandPage")
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public ResultBean<CommonPage<PmsBrand>> selectPmsBrandPage(
            PmsBrand pmsBrand,
            @RequestParam(value = "pageNum",defaultValue = "1") @ApiParam("页码") Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "3") @ApiParam("每页数量") Integer pageSize){
        return new ResultBean<CommonPage<PmsBrand>>(pmsBrandService.listBrand(pmsBrand,pageNum,pageSize));
    }

    @ApiOperation("添加品牌")
    @PostMapping("addPmsBrand")
    @PreAuthorize("hasAuthority('pms:brand:create')")
    public ResultBean<Integer> addPmsBrand(PmsBrand pmsBrand){
        return new ResultBean<Integer>(pmsBrandService.createBrand(pmsBrand));
    }

    @ApiOperation("更新指定id品牌的信息")
    @PostMapping("updatePmsBrand")
    @PreAuthorize("hasAuthority('pms:brand:update')")
    public ResultBean<Integer> updatePmsBrand(Long id,PmsBrand pmsBrand){
        return new ResultBean<Integer>(pmsBrandService.updateBrand(id,pmsBrand));
    }

    @ApiOperation("删除指定id的品牌")
    @GetMapping("deletePmsBrand")
    @PreAuthorize("hasAuthority('pms:brand:delete')")
    public ResultBean<Integer> deletePmsBrand(Long id){
        return new ResultBean<Integer>(pmsBrandService.deleteBrand(id));
    }

    @ApiOperation("获取指定id的品牌详情")
    @GetMapping("selectPmsBrand")
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public ResultBean<PmsBrand> selectPmsBrand(Long id){
        return new ResultBean<PmsBrand>(pmsBrandService.getBrand(id));
    }

}
