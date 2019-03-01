package com.deepxi.com.deepxi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.com.deepxi.domain.eo.HspActiveProduct;
import com.deepxi.com.deepxi.service.HspActiveProductService;
import com.deepxi.com.deepxi.mapper.HspActiveProductMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class HspActiveProductServiceImpl implements HspActiveProductService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HspActiveProductMapper hspActiveProductMapper;

    @Override
    public PageBean<HspActiveProduct> findPage(HspActiveProduct eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<HspActiveProduct> pages =  hspActiveProductMapper.findList(eo);
        return new PageBean<HspActiveProduct>(pages);
    }

    @Override
    public List<HspActiveProduct> findAll(HspActiveProduct eo) {
        List<HspActiveProduct> list = hspActiveProductMapper.findList(eo);
        return list;
    }
    @Override
    public HspActiveProduct detail(String pk) {
        HspActiveProduct eo = hspActiveProductMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,HspActiveProduct eo) {
        HspActiveProduct old = hspActiveProduc