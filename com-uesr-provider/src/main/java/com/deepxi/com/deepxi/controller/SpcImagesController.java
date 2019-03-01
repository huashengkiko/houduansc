package com.deepxi.com.deepxi.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.com.deepxi.service.SpcImagesService;
import com.deepxi.com.deepxi.domain.eo.SpcImages;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/spc_images", description = "$desc")
@RestController
@RequestMapping("/api/v1/spcImagess")
public class  SpcImagesController {

    @Autowired
    private SpcImagesService spcImagesService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(SpcImages eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(spcImagesService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(SpcImages eo) {
        return new Payload(spcImagesService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(spcImagesService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改SpcImages")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody SpcImages eo) {
     eo.setId(pk);
     return new Payload(spcImagesService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建SpcImages", notes = "创建SpcImages")
    public Payload create(@RequestBody SpcImages eo) {
        return new Payload(spcImagesService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除SpcImages", notes = "根据id删除SpcImages")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(spcImagesService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除SpcImages", notes = "根据id批量删除SpcImages")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(spcImagesService.delete(ids));
    }

}