package com.deepxi.com.deepxi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.com.deepxi.domain.eo.SpcProductPreCategory;
import com.deepxi.com.deepxi.service.SpcProductPreCategoryService;
import com.deepxi.com.deepxi.mapper.SpcProductPreCategoryMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class SpcProductPreCategoryServiceImpl implements SpcProductPreCategoryService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SpcProductPreCategoryMapper spcProductPreCategoryMapper;

    @Override
    public PageBean<SpcProductPreCategory> findPage(SpcProductPreCategory eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SpcProductPreCategory> pages =  spcProductPreCategoryMapper.findList(eo);
        return new PageBean<SpcProductPreCategory>(pages);
    }

    @Override
    public List<SpcProductPreCategory> findAll(SpcProductPreCategory eo) {
        List<SpcProductPreCategory> list = spcProductPreCategoryMapper.findList(eo);
        return list;
    }
    @Override
    public SpcProductPreCategory detail(String pk) {
        SpcProductPreCategory eo = spcProductPreCategoryMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,SpcProductPreCategory eo) {
        SpcProductPreCategory old = spcProductPreCategoryMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = spcProductPreCategoryMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(SpcProductPreCategory eo) {
        int result = spcProductPreCategoryMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = spcProductPreCategoryMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = spcProductPreCategoryMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}