package com.deepxi.com.deepxi.domain.dto;

import com.deepxi.com.deepxi.domain.eo.SpcProductPreCategory;
import java.util.Collection;
import java.util.List;

/**
* @desc spc_product_pre_category
* @author admin
*/
public class SpcProductPreCategoryDto extends SpcProductPreCategory{

public SpcProductPreCategoryDto(){};

public SpcProductPreCategoryDto(SpcProductPreCategory eo) {
    this.setId(eo.getId());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedAt(eo.getCreatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setTenantId(eo.getTenantId());
    this.setProductId(eo.getProductId());
    this.setCategoryId(eo.getCategoryId());
    this.setDr(eo.getDr());
    this.setExt1(eo.getExt1());
    this.setExt2(eo.getExt2());
    this.setExt3(eo.getExt3());
    this.setExt4(eo.getExt4());
    this.setExtJson(eo.getExtJson());
}
}

