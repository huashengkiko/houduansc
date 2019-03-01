package com.deepxi.com.deepxi.domain.dto;

import com.deepxi.com.deepxi.domain.eo.SpcImages;
import java.util.Collection;
import java.util.List;

/**
* @desc spc_images
* @author admin
*/
public class SpcImagesDto extends SpcImages{

public SpcImagesDto(){};

public SpcImagesDto(SpcImages eo) {
    this.setId(eo.getId());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedAt(eo.getCreatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setTenantId(eo.getTenantId());
    this.setDr(eo.getDr());
    this.setTargetId(eo.getTargetId());
    this.setImagesUrl(eo.getImagesUrl());
    this.setType(eo.getType());
    this.setExt1(eo.getExt1());
    this.setExt2(eo.getExt2());
    this.setExt3(eo.getExt3());
    this.setExt4(eo.getExt4());
    this.setExtJson(eo.getExtJson());
}
}

