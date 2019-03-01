package com.deepxi.com.deepxi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.com.deepxi.domain.eo.SpcFinancingPublicAttribute;
import com.deepxi.com.deepxi.service.SpcFinancingPublicAttributeService;
import com.deepxi.com.deepxi.mapper.SpcFinancingPublicAttributeMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class SpcFinancingPublicAttributeServiceImpl implements SpcFinancingPublicAttributeService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SpcFinancingPublicAttributeMapper spcFinancingPublicAttributeMapper;

    @Override
    public PageBean<SpcFinancingPublicAttribute> findPage(SpcFinancingPublicAttribute eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SpcFinancingPublicAttribute> pages =  spcFinancingPublicAttributeMapper.findList(eo);
        return new PageBean<SpcFinancingPublicAttribute>(pages);
    }

    @Override
    public List<SpcFinancingPublicAttribute> findAll(SpcFinancingPublicAttribute eo) {
        List<SpcFinancingPublicAttribute> list = spcFinancingPublicAttributeMapper.findList(eo);
        return list;
    }
    @Override
    public SpcFinancingPublicAttribute detail(String pk) {
        SpcFinancingPublicAttribute eo = spcFinancingPublicAttributeMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,SpcFinancingPublicAttribute eo) {
        SpcFinancingPublicAttribute old = spcFinancingPublicAttributeMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = spcFinancingPublicAttributeMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(SpcFinancingPublicAttribute eo) {
        int result = spcFinancingPublicAttributeMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = spcFinancingPublicAttributeMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = spcFinancingPublicAttributeMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}