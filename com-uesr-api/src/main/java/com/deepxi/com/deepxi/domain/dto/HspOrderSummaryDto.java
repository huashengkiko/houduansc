package com.deepxi.com.deepxi.domain.dto;

import com.deepxi.com.deepxi.domain.eo.HspOrderSummary;
import java.util.Collection;
import java.util.List;

/**
* @desc hsp_order_summary
* @author admin
*/
public class HspOrderSummaryDto extends HspOrderSummary{

public HspOrderSummaryDto(){};

public HspOrderSummaryDto(HspOrderSummary eo) {
    this.setId(eo.getId());
    this.setTenantCode(eo.getTenantCode());
    this.setCreatedAt(eo.getCreatedAt());
    this.setCreatedBy(eo.getCreatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setVersion(eo.getVersion());
    this.setDr(eo.getDr());
    this.setPlatformDiscountMoney(eo.getPlatformDiscountMoney());
    this.setShopDiscountMoney(eo.getShopDiscountMoney());
    this.setSkuDiscountMoney(eo.getSkuDiscountMoney());
    this.setFreightMoney(eo.getFreightMoney());
    this.setItemMoney(eo.getItemMoney());
    this.setPayMoney(eo.getPayMoney());
    this.setMemberId(eo.getMemberId());
    this.setMemberName(eo.getMemberName());
    this.setMemberCode(eo.getMemberCode());
    this.setPayType(eo.getPayType());
    this.setPayChannel(eo.getPayChannel());
    this.setPayDeadline(eo.getPayDeadline());
    this.setPayOrderNo(eo.getPayOrderNo());
    this.setPayStatus(eo.getPayStatus());
    this.setPaidAt(eo.getPaidAt());
    this.setMemberPhone(eo.getMemberPhone());
    this.setRemark1(eo.getRemark1());
    this.setRemark2(eo.getRemark2());
    this.setRemark3(eo.getRemark3());
    this.setRemark4(eo.getRemark4());
}
}

