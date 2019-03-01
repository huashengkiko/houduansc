package com.deepxi.com.deepxi.service;

import com.deepxi.com.deepxi.domain.eo.SpcProductPreCategory;
import com.deepxi.com.deepxi.domain.dto.SpcProductPreCategoryDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * spc_product_pre_category
 */
public interface SpcProductPreCategoryService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<SpcProductPreCategory> findPage(SpcProductPreCategory eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<SpcProductPreCategory> findAll(SpcProductPreCategory eo);

    /**
      获取详情
    * @return
    */
    SpcProductPreCategory detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,SpcProductPreCategory eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(SpcProductPreCategory eo);

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