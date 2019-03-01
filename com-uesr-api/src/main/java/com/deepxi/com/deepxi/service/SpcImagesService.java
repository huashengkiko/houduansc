package com.deepxi.com.deepxi.service;

import com.deepxi.com.deepxi.domain.eo.SpcImages;
import com.deepxi.com.deepxi.domain.dto.SpcImagesDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * spc_images
 */
public interface SpcImagesService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<SpcImages> findPage(SpcImages eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<SpcImages> findAll(SpcImages eo);

    /**
      获取详情
    * @return
    */
    SpcImages detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,SpcImages eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(SpcImages eo);

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