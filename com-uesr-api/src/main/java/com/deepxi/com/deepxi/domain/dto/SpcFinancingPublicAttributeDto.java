package com.deepxi.com.deepxi.domain.dto;

import com.deepxi.com.deepxi.domain.eo.SpcFinancingPublicAttribute;
import java.util.Collection;
import java.util.List;

/**
* @desc spc_financing_public_attribute
* @author admin
*/
public class SpcFinancingPublicAttributeDto extends SpcFinancingPublicAttribute{

public SpcFinancingPublicAttributeDto(){};

public SpcFinancingPublicAttributeDto(SpcFinancingPublicAttribute eo) {
    this.setId(eo.getId());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedAt(eo.getCreatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setTenantId(eo.getTenantId());
    this.setProductId(eo.getProductId());
    this.setDr(eo.getDr());
    this.setIsExchange(eo.getIsExchange());
    this.setIsJoiningTraderVisible(eo.getIsJoiningTraderVisible());
    this.setIsCalculateSalesPerformance(eo.getIsCalculateSalesPerformance());
    this.setIsSalesPerformanceDistribution(eo.getIsSalesPerformanceDistribution());
    this.setIsCalculateManualPerformance(eo.getIsCalculateManualPerformance());
    this.setIsDistributionSecondaryPerformance(eo.getIsDistributionSecondaryPerformance());
    this.setShowyuDistributionProportion(eo.getShowyuDistributionProportion());
    this.setChunyuDistributionProportion(eo.getChunyuDistributionProportion());
    this.setIsVendibility(eo.getIsVendibility());
    this.setExt1(eo.getExt1());
    this.setExt2(eo.getExt2());
    this.setExt3(eo.getExt3());
    this.setExt4(eo.getExt4());
    this.setExtJson(eo.getExtJson());
}
}

