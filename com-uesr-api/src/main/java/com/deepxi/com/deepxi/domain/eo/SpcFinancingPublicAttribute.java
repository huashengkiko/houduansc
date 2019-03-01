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
* @desc spc_financing_public_attribute
* @author admin
*/
//@ApiModel(description = "spc_financing_public_attribute")
public class SpcFinancingPublicAttribute{

// @ApiModelProperty(value = "主键")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`created_by`")
    private String createdBy;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`created_at`")
    private Date createdAt;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`updated_by`")
    private String updatedBy;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`updated_at`")
    private Date updatedAt;
// @ApiModelProperty(value = "租户id")
    @TableField(value = "`tenant_id`")
    private String tenantId;
// @ApiModelProperty(value = "商品id")
    @TableField(value = "`product_id`")
    private String productId;
// @ApiModelProperty(value = "逻辑删除 是：1 否：0 ")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;
// @ApiModelProperty(value = "是否可兑换 是 : 1  否 : 0")
    @TableField(value = "`is_exchange`")
    private Boolean isExchange;
// @ApiModelProperty(value = "是否加盟商可见 是 : 1  否 : 0")
    @TableField(value = "`is_joining_trader_visible`")
    private Boolean isJoiningTraderVisible;
// @ApiModelProperty(value = "是否计算销售业绩  是 : 1  否 : 0")
    @TableField(value = "`is_calculate_sales_performance`")
    private Boolean isCalculateSalesPerformance;
// @ApiModelProperty(value = "销售业绩是否分配多人   是 : 1  否 : 0")
    @TableField(value = "`is_sales_performance_distribution`")
    private Boolean isSalesPerformanceDistribution;
// @ApiModelProperty(value = "是否计算手工业绩   是 : 1  否 : 0")
    @TableField(value = "`is_calculate_manual_performance`")
    private Boolean isCalculateManualPerformance;
// @ApiModelProperty(value = "是否分配二次业绩   是 : 1  否 : 0")
    @TableField(value = "`is_distribution_secondary_performance`")
    private Boolean isDistributionSecondaryPerformance;
// @ApiModelProperty(value = "秀域业绩分配比例")
    @TableField(value = "`showyu__distribution_proportion`")
    private Integer  showyuDistributionProportion;
// @ApiModelProperty(value = "春语业绩分配比例")
    @TableField(value = "`chunyu__distribution_proportion`")
    private Integer  chunyuDistributionProportion;
// @ApiModelProperty(value = "是否可售 是 : 1  否 : 0")
    @TableField(value = "`is_vendibility`")
    private Boolean isVendibility;
// @ApiModelProperty(value = "预留字段")
    @TableField(value = "`ext1`")
    private String ext1;
// @ApiModelProperty(value = "预留字段")
    @TableField(value = "`ext2`")
    private String ext2;
// @ApiModelProperty(value = "预留字段")
    @TableField(value = "`ext3`")
    private String ext3;
// @ApiModelProperty(value = "预留字段")
    @TableField(value = "`ext4`")
    private String ext4;
// @ApiModelProperty(value = "预留字段")
    @TableField(value = "`ext_json`")
    private String extJson;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
    return this.createdAt;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setUpdatedAt(Date updatedAt){
    this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
    return this.updatedAt;
    }

    public void setTenantId(String tenantId){
    this.tenantId = tenantId;
    }

    public String getTenantId(){
    return this.tenantId;
    }

    public void setProductId(String productId){
    this.productId = productId;
    }

    public String getProductId(){
    return this.productId;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }

    public void setIsExchange(Boolean isExchange){
    this.isExchange = isExchange;
    }

    public Boolean getIsExchange(){
    return this.isExchange;
    }

    public void setIsJoiningTraderVisible(Boolean isJoiningTraderVisible){
    this.isJoiningTraderVisible = isJoiningTraderVisible;
    }

    public Boolean getIsJoiningTraderVisible(){
    return this.isJoiningTraderVisible;
    }

    public void setIsCalculateSalesPerformance(Boolean isCalculateSalesPerformance){
    this.isCalculateSalesPerformance = isCalculateSalesPerformance;
    }

    public Boolean getIsCalculateSalesPerformance(){
    return this.isCalculateSalesPerformance;
    }

    public void setIsSalesPerformanceDistribution(Boolean isSalesPerformanceDistribution){
    this.isSalesPerformanceDistribution = isSalesPerformanceDistribution;
    }

    public Boolean getIsSalesPerformanceDistribution(){
    return this.isSalesPerformanceDistribution;
    }

    public void setIsCalculateManualPerformance(Boolean isCalculateManualPerformance){
    this.isCalculateManualPerformance = isCalculateManualPerformance;
    }

    public Boolean getIsCalculateManualPerformance(){
    return this.isCalculateManualPerformance;
    }

    public void setIsDistributionSecondaryPerformance(Boolean isDistributionSecondaryPerformance){
    this.isDistributionSecondaryPerformance = isDistributionSecondaryPerformance;
    }

    public Boolean getIsDistributionSecondaryPerformance(){
    return this.isDistributionSecondaryPerformance;
    }

    public void setShowyuDistributionProportion(Integer  showyuDistributionProportion){
    this.showyuDistributionProportion = showyuDistributionProportion;
    }

    public Integer  getShowyuDistributionProportion(){
    return this.showyuDistributionProportion;
    }

    public void setChunyuDistributionProportion(Integer  chunyuDistributionProportion){
    this.chunyuDistributionProportion = chunyuDistributionProportion;
    }

    public Integer  getChunyuDistributionProportion(){
    return this.chunyuDistributionProportion;
    }

    public void setIsVendibility(Boolean isVendibility){
    this.isVendibility = isVendibility;
    }

    public Boolean getIsVendibility(){
    return this.isVendibility;
    }

    public void setExt1(String ext1){
    this.ext1 = ext1;
    }

    public String getExt1(){
    return this.ext1;
    }

    public void setExt2(String ext2){
    this.ext2 = ext2;
    }

    public String getExt2(){
    return this.ext2;
    }

    public void setExt3(String ext3){
    this.ext3 = ext3;
    }

    public String getExt3(){
    return this.ext3;
    }

    public void setExt4(String ext4){
    this.ext4 = ext4;
    }

    public String getExt4(){
    return this.ext4;
    }

    public void setExtJson(String extJson){
    this.extJson = extJson;
    }

    public String getExtJson(){
    return this.extJson;
    }


}

