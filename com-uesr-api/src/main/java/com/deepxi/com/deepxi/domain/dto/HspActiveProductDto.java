package com.deepxi.com.deepxi.domain.dto;

import com.deepxi.com.deepxi.domain.eo.HspActiveProduct;
import java.util.Collection;
import java.util.List;

/**
* @desc hsp_active_product
* @author admin
*/
public class HspActiveProductDto extends HspActiveProduct{

public HspActiveProductDto(){};

public HspActiveProductDto(HspActiveProduct eo) {
    this.setId(eo.getId());
    this.setTenantCode(eo.getTenantCode());
    this.setCreatedAt(eo.getCreatedAt());
    this.setCreatedBy(eo.getCreatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setVersion(eo.getVersion());
    this.setDr(eo.getDr());
    this.setRemark1(eo.getRemark1());
    this.setRemark2(eo.getRemark2());
    this.setRemark3(eo.getRemark3());
    this.setRemark4(eo.getRemark4());
    this.setName(eo.getName());
    this.setType(eo.getType());
    this.setSalePrice(eo.getSalePrice());
    this.setImageUrl(eo.getImageUrl());
    this.setDescription(eo.getDescription());
    this.setJionActivity(eo.getJionActivity());
}
}

