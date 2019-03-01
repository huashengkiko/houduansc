package com.deepxi.com.deepxi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepxi.com.deepxi.domain.eo.SpcImages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  SpcImagesMapper extends BaseMapper<SpcImages> {

    List<SpcImages> findList(@Param("eo")  SpcImages eo);

    int deleteByIds(@Param("ids") List<String> ids);

}