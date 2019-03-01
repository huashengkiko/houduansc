package com.deepxi.com.deepxi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepxi.com.deepxi.domain.eo.HspOrderSummary;
import com.deepxi.com.deepxi.service.HspOrderSummaryService;
import com.deepxi.com.deepxi.mapper.HspOrderSummaryMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class HspOrderSummaryServiceImpl implements HspOrderSummaryService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HspOrderSummaryMapper hspOrderSummaryMapper;

    @Override
    public PageBean<HspOrderSummary> findPage(HspOrderSummary eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<HspOrderSummary> pages =  hspOrderSummaryMapper.findList(eo);
        return new PageBean<HspOrderSummary>(pages);
    }

    @Override
    public List<HspOrderSummary> findAll(HspOrderSummary eo) {
        List<HspOrderSummary> list = hspOrderSummaryMapper.findList(eo);
        return list;
    }
    @Override
    public HspOrderSummary detail(String pk) {
        HspOrderSummary eo = hspOrderSummaryMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,HspOrderSummary eo) {
        HspOrderSummary old = hspOrderSummaryMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = hspOrderSummaryMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(HspOrderSummary eo) {
        int result = hspOrderSummaryMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = hspOrderSummaryMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = hspOrderSummaryMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}