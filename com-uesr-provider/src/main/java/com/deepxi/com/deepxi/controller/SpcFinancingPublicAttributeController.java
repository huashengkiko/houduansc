package com.deepxi.com.deepxi.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.com.deepxi.service.SpcFinancingPublicAttributeService;
import com.deepxi.com.deepxi.domain.eo.SpcFinancingPublicAttribute;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/spc_financing_public_attribute", description = "$desc")
@RestController
@RequestMapping("/api/v1/spcFinancingPublicAttributes")
public class  SpcFinancingPublicAttributeController {

    @Autowired
    private SpcFinancingPublicAttributeService spcFinancingPublicAttributeService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(SpcFinancingPublicAttribute eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(spcFinancingPublicAttributeService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(SpcFinancingPublicAttribute eo) {
        return new Payload(spcFinancingPublicAttributeService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(spcFinancingPublicAttributeService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改SpcFinancingPublicAttribute")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody SpcFinancingPublicAttribute eo) {
     eo.setId(pk);
     return new Payload(spcFinancingPublicAttributeService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建SpcFinancingPublicAttribute", notes = "创建SpcFinancingPublicAttribute")
    public Payload create(@RequestBody SpcFinancingPublicAttribute eo) {
        return new Payload(spcFinancingPublicAttributeService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除SpcFinancingPublicAttribute", notes = "根据id删除SpcFinancingPublicAttribute")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(spcFinancingPublicAttributeService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除SpcFinancingPublicAttribute", notes = "根据id批量删除SpcFinancingPublicAttribute")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(spcFinancingPublicAttributeService.delete(ids));
    }

}