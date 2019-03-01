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
* @desc spc_images
* @author admin
*/
//@ApiModel(description = "spc_images")
public class SpcImages{

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
// @ApiModelProperty(value = "逻辑删除 是：1 否：0 ")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;
// @ApiModelProperty(value = "目标id")
    @TableField(value = "`target_id`")
    private String targetId;
// @ApiModelProperty(value = "图片url")
    @TableField(value = "`images_url`")
    private String imagesUrl;
// @ApiModelProperty(value = "类型")
    @TableField(value = "`type`")
    private String type;
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

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }

    public void setTargetId(String targetId){
    this.targetId = targetId;
    }

    public String getTargetId(){
    return this.targetId;
    }

    public void setImagesUrl(String imagesUrl){
    this.imagesUrl = imagesUrl;
    }

    public String getImagesUrl(){
    return this.imagesUrl;
    }

    public void setType(String type){
    this.type = type;
    }

    public String getType(){
    return this.type;
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

