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
* @desc hsp_active_product
* @author admin
*/
//@ApiModel(description = "hsp_active_product")
public class HspActiveProduct{

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
// @ApiModelProperty(value = "商品名称")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "商品分类")
    @TableField(value = "`type`")
    private String type;
// @ApiModelProperty(value = "销售价格")
    @TableField(value = "`sale_price`")
    private Integer  salePrice;
// @ApiModelProperty(value = "商品图片")
    @TableField(value = "`image_url`")
    private String imageUrl;
// @ApiModelProperty(value = "商品详情介绍")
    @TableField(value = "`description`")
    private String description;
// @ApiModelProperty(value = "当前的拼团个数")
    @TableField(value = "`jion_activity`")
    private Integer  jionActivity;

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

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setType(String type){
    this.type = type;
    }

    public String getType(){
    return this.type;
    }

    public void setSalePrice(Integer  salePrice){
    this.salePrice = salePrice;
    }

    public Integer  getSalePrice(){
    return this.salePrice;
    }

    public void setImageUrl(String imageUrl){
    this.imageUrl = imageUrl;
    }

    public String getImageUrl(){
    return this.imageUrl;
    }

    public void setDescription(String description){
    this.description = description;
    }

    public String getDescription(){
    return this.description;
    }

    public void setJionActivity(Integer  jionActivity){
    this.jionActivity = jionActivity;
    }

    public Integer  getJionActivity(){
    return this.jionActivity;
    }


}

