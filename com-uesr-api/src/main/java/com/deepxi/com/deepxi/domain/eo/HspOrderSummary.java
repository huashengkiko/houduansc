package com.deepxi.com.deepxi.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc hsp_order_summary
* @author admin
*/
//@ApiModel(description = "hsp_order_summary")
public class HspOrderSummary{

// @ApiModelProperty(value = "")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "租户")
    @TableField(value = "`tenant_code`")
    private String tenantCode;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`created_at`")
    private Date createdAt;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`created_by`")
    private String createdBy;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`updated_at`")
    private Date updatedAt;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`updated_by`")
    private String updatedBy;
// @ApiModelProperty(value = "版本记录,修改时自增")
    @TableField(value = "`version`")
    private Integer  version;
// @ApiModelProperty(value = "删除标志 1=已删除, 0=未删除")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;
// @ApiModelProperty(value = "平台优惠金额")
    @TableField(value = "`platform_discount_money`")
    private Integer  platformDiscountMoney;
// @ApiModelProperty(value = "店铺优惠金额")
    @TableField(value = "`shop_discount_money`")
    private Integer  shopDiscountMoney;
// @ApiModelProperty(value = "sku优惠金额")
    @TableField(value = "`sku_discount_money`")
    private Integer  skuDiscountMoney;
// @ApiModelProperty(value = "邮费")
    @TableField(value = "`freight_money`")
    private Integer  freightMoney;
// @ApiModelProperty(value = "商品总额")
    @TableField(value = "`item_money`")
    private Integer  itemMoney;
// @ApiModelProperty(value = "实际支付金额")
    @TableField(value = "`pay_money`")
    private Integer  payMoney;
// @ApiModelProperty(value = "会员Id")
    @TableField(value = "`member_id`")
    private String memberId;
// @ApiModelProperty(value = "会员名称")
    @TableField(value = "`member_name`")
    private String memberName;
// @ApiModelProperty(value = "会员编码")
    @TableField(value = "`member_code`")
    private String memberCode;
// @ApiModelProperty(value = "支付方式, 对公/对私")
    @TableField(value = "`pay_type`")
    private String payType;
// @ApiModelProperty(value = "支付渠道")
    @TableField(value = "`pay_channel`")
    private String payChannel;
// @ApiModelProperty(value = "支付截止日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`pay_deadline`")
    private Date payDeadline;
// @ApiModelProperty(value = "支付编号")
    @TableField(value = "`pay_order_no`")
    private String payOrderNo;
// @ApiModelProperty(value = "订单支付状态")
    @TableField(value = "`pay_status`")
    private String payStatus;
// @ApiModelProperty(value = "支付时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`paid_at`")
    private Date paidAt;
// @ApiModelProperty(value = "客户电话")
    @TableField(value = "`member_phone`")
    private String memberPhone;
// @ApiModelProperty(value = "remark1")
    @TableField(value = "`remark1`")
    private String remark1;
// @ApiModelProperty(value = "remark2")
    @TableField(value = "`remark2`")
    private String remark2;
// @ApiModelProperty(value = "remark3")
    @TableField(value = "`remark3`")
    private String remark3;
// @ApiModelProperty(value = "remark4")
    @TableField(value = "`remark4`")
    private String remark4;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setTenantCode(String tenantCode){
    this.tenantCode = tenantCode;
    }

    public String getTenantCode(){
    return this.tenantCode;
    }

    public void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
    return this.createdAt;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setUpdatedAt(Date updatedAt){
    this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
    return this.updatedAt;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setVersion(Integer  version){
    this.version = version;
    }

    public Integer  getVersion(){
    return this.version;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }

    public void setPlatformDiscountMoney(Integer  platformDiscountMoney){
    this.platformDiscountMoney = platformDiscountMoney;
    }

    public Integer  getPlatformDiscountMoney(){
    return this.platformDiscountMoney;
    }

    public void setShopDiscountMoney(Integer  shopDiscountMoney){
    this.shopDiscountMoney = shopDiscountMoney;
    }

    public Integer  getShopDiscountMoney(){
    return this.shopDiscountMoney;
    }

    public void setSkuDiscountMoney(Integer  skuDiscountMoney){
    this.skuDiscountMoney = skuDiscountMoney;
    }

    public Integer  getSkuDiscountMoney(){
    return this.skuDiscountMoney;
    }

    public void setFreightMoney(Integer  freightMoney){
    this.freightMoney = freightMoney;
    }

    public Integer  getFreightMoney(){
    return this.freightMoney;
    }

    public void setItemMoney(Integer  itemMoney){
    this.itemMoney = itemMoney;
    }

    public Integer  getItemMoney(){
    return this.itemMoney;
    }

    public void setPayMoney(Integer  payMoney){
    this.payMoney = payMoney;
    }

    public Integer  getPayMoney(){
    return this.payMoney;
    }

    public void setMemberId(String memberId){
    this.memberId = memberId;
    }

    public String getMemberId(){
    return this.memberId;
    }

    public void setMemberName(String memberName){
    this.memberName = memberName;
    }

    public String getMemberName(){
    return this.memberName;
    }

    public void setMemberCode(String memberCode){
    this.memberCode = memberCode;
    }

    public String getMemberCode(){
    return this.memberCode;
    }

    public void setPayType(String payType){
    this.payType = payType;
    }

    public String getPayType(){
    return this.payType;
    }

    public void setPayChannel(String payChannel){
    this.payChannel = payChannel;
    }

    public String getPayChannel(){
    return this.payChannel;
    }

    public void setPayDeadline(Date payDeadline){
    this.payDeadline = payDeadline;
    }

    public Date getPayDeadline(){
    return this.payDeadline;
    }

    public void setPayOrderNo(String payOrderNo){
    this.payOrderNo = payOrderNo;
    }

    public String getPayOrderNo(){
    return this.payOrderNo;
    }

    public void setPayStatus(String payStatus){
    this.payStatus = payStatus;
    }

    public String getPayStatus(){
    return this.payStatus;
    }

    public void setPaidAt(Date paidAt){
    this.paidAt = paidAt;
    }

    public Date getPaidAt(){
    return this.paidAt;
    }

    public void setMemberPhone(String memberPhone){
    this.memberPhone = memberPhone;
    }

    public String getMemberPhone(){
    return this.memberPhone;
    }

    public void setRemark1(String remark1){
    this.remark1 = remark1;
    }

    public String getRemark1(){
    return this.remark1;
    }

    public void setRemark2(String remark2){
    this.remark2 = remark2;
    }

    public String getRemark2(){
    return this.remark2;
    }

    public void setRemark3(String remark3){
    this.remark3 = remark3;
    }

    public String getRemark3(){
    return this.remark3;
    }

    public void setRemark4(String remark4){
    this.remark4 = remark4;
    }

    public String getRemark4(){
    return this.remark4;
    }


}

