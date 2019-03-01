package com.deepxi.com.deepxi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.com.deepxi.domain.eo.SpcProductPreCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  SpcProductPreCategoryMapper extends BaseMapper<SpcProductPreCategory> {

    List<SpcProductPreCategory> findList(@Param("eo")  SpcProductPreCategory eo);

    int deleteByIds(@Param("ids") List<String> ids);

}