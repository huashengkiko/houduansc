package com.deepxi.com.deepxi.service;

import com.deepxi.com.deepxi.domain.eo.HspActiveProduct;
import com.deepxi.com.deepxi.domain.dto.HspActiveProductDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * hsp_active_product
 */
public interface HspActiveProductService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<HspActiveProduct> findPage(HspActiveProduct eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<HspActiveProduct> findAll(HspActiveProduct eo);

    /**
      获取详情
    * @return
    */
    HspActiveProduct detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,HspActiveProduct eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(HspActiveProduct eo);

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