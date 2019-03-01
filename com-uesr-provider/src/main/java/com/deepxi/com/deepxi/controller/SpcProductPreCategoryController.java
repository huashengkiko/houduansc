package com.deepxi.com.deepxi.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.com.deepxi.service.SpcProductPreCategoryService;
import com.deepxi.com.deepxi.domain.eo.SpcProductPreCategory;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/spc_product_pre_category", description = "$desc")
@RestController
@RequestMapping("/api/v1/spcProductPreCategorys")
public class  SpcProductPreCategoryController {

    @Autowired
    private SpcProductPreCategoryService spcProductPreCategoryService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(SpcProductPreCategory eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(spcProductPreCategoryService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(SpcProductPreCategory eo) {
        return new Payload(spcProductPreCategoryService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(spcProductPreCategoryService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改SpcProductPreCategory")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody SpcProductPreCategory eo) {
     eo.setId(pk);
     return new Payload(spcProductPreCategoryService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建SpcProductPreCategory", notes = "创建SpcProductPreCategory")
    public Payload create(@RequestBody SpcProductPreCategory eo) {
        return new Payload(spcProductPreCategoryService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除SpcProductPreCategory", notes = "根据id删除SpcProductPreCategory")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(spcProductPreCategoryService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除SpcProductPreCategory", notes = "根据id批量删除SpcProductPreCategory")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(spcProductPreCategoryService.delete(ids));
    }

}