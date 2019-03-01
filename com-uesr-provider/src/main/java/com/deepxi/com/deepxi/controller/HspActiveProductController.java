package com.deepxi.com.deepxi.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.com.deepxi.service.HspActiveProductService;
import com.deepxi.com.deepxi.domain.eo.HspActiveProduct;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/hsp_active_product", description = "$desc")
@RestController
@RequestMapping("/api/v1/hspActiveProducts")
public class  HspActiveProductController {

    @Autowired
    private HspActiveProductService hspActiveProductService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(HspActiveProduct eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(hspActiveProductService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(HspActiveProduct eo) {
        return new Payload(hspActiveProductService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspActiveProductService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改HspActiveProduct")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody HspActiveProduct eo) {
     eo.setId(pk);
     return new Payload(hspActiveProductService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建HspActiveProduct", notes = "创建HspActiveProduct")
    public Payload create(@RequestBody HspActiveProduct eo) {
        return new Payload(hspActiveProductService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除HspActiveProduct", notes = "根据id删除HspActiveProduct")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspActiveProductService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除HspActiveProduct", notes = "根据id批量删除HspActiveProduct")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(hspActiveProductService.delete(ids));
    }

}