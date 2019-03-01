package com.deepxi.com.deepxi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.com.deepxi.domain.eo.HspActiveProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  HspActiveProductMapper extends BaseMapper<HspActiveProduct> {

    List<HspActiveProduct> findList(@Param("eo")  HspActiveProduct eo);

    int deleteByIds(@Param("ids") List<String> ids);

}