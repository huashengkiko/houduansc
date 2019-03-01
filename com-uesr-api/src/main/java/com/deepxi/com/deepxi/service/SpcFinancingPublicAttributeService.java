package com.deepxi.com.deepxi.service;

import com.deepxi.com.deepxi.domain.eo.SpcFinancingPublicAttribute;
import com.deepxi.com.deepxi.domain.dto.SpcFinancingPublicAttributeDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * spc_financing_public_attribute
 */
public interface SpcFinancingPublicAttributeService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<SpcFinancingPublicAttribute> findPage(SpcFinancingPublicAttribute eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<SpcFinancingPublicAttribute> findAll(SpcFinancingPublicAttribute eo);

    /**
      获取详情
    * @return
    */
    SpcFinancingPublicAttribute detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,SpcFinancingPublicAttribute eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(SpcFinancingPublicAttribute eo);

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