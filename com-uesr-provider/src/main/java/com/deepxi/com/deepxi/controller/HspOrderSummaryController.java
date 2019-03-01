package com.deepxi.com.deepxi.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepxi.com.deepxi.service.HspOrderSummaryService;
import com.deepxi.com.deepxi.domain.eo.HspOrderSummary;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/hsp_order_summary", description = "$desc")
@RestController
@RequestMapping("/api/v1/hspOrderSummarys")
public class  HspOrderSummaryController {

    @Autowired
    private HspOrderSummaryService hspOrderSummaryService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(HspOrderSummary eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(hspOrderSummaryService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(HspOrderSummary eo) {
        return new Payload(hspOrderSummaryService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspOrderSummaryService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改HspOrderSummary")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody HspOrderSummary eo) {
     eo.setId(pk);
     return new Payload(hspOrderSummaryService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建HspOrderSummary", notes = "创建HspOrderSummary")
    public Payload create(@RequestBody HspOrderSummary eo) {
        return new Payload(hspOrderSummaryService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除HspOrderSummary", notes = "根据id删除HspOrderSummary")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(hspOrderSummaryService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除HspOrderSummary", notes = "根据id批量删除HspOrderSummary")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(hspOrderSummaryService.delete(ids));
    }

}