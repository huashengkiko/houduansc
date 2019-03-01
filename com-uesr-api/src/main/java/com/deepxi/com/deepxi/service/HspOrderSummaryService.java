package com.deepxi.com.deepxi.service;

import com.deepxi.com.deepxi.domain.eo.HspOrderSummary;
import com.deepxi.com.deepxi.domain.dto.HspOrderSummaryDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * hsp_order_summary
 */
public interface HspOrderSummaryService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<HspOrderSummary> findPage(HspOrderSummary eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<HspOrderSummary> findAll(HspOrderSummary eo);

    /**
      获取详情
    * @return
    */
    HspOrderSummary detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,HspOrderSummary eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(HspOrderSummary eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(String pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(String...pk);
}