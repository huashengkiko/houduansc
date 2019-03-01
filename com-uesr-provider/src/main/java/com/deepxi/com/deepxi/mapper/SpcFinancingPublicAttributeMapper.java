package com.deepxi.com.deepxi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.com.deepxi.domain.eo.SpcFinancingPublicAttribute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  SpcFinancingPublicAttributeMapper extends BaseMapper<SpcFinancingPublicAttribute> {

    List<SpcFinancingPublicAttribute> findList(@Param("eo")  SpcFinancingPublicAttribute eo);

    int deleteByIds(@Param("ids") List<String> ids);

}