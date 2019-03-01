package com.deepxi.com.deepxi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.com.deepxi.domain.eo.HspOrderSummary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  HspOrderSummaryMapper extends BaseMapper<HspOrderSummary> {

    List<HspOrderSummary> findList(@Param("eo")  HspOrderSummary eo);

    int deleteByIds(@Param("ids") List<String> ids);

}