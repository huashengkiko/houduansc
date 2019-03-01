package com.deepxi.com.deepxi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.com.deepxi.domain.eo.SpcImages;
import com.deepxi.com.deepxi.service.SpcImagesService;
import com.deepxi.com.deepxi.mapper.SpcImagesMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class SpcImagesServiceImpl implements SpcImagesService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SpcImagesMapper spcImagesMapper;

    @Override
    public PageBean<SpcImages> findPage(SpcImages eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SpcImages> pages =  spcImagesMapper.findList(eo);
        return new PageBean<SpcImages>(pages);
    }

    @Override
    public List<SpcImages> findAll(SpcImages eo) {
        List<SpcImages> list = spcImagesMapper.findList(eo);
        return list;
    }
    @Override
    public SpcImages detail(String pk) {
        SpcImages eo = spcImagesMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,SpcImages eo) {
        SpcImages old = spcImagesMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = spcImagesMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(SpcImages eo) {
        int result = spcImagesMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = spcImagesMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = spcImagesMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}