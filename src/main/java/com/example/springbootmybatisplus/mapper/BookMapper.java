package com.example.springbootmybatisplus.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootmybatisplus.pojo.Book;

import java.util.Map;


public interface BookMapper extends BaseMapper<Book> {
    /**
     *
     */
    Map<String,Object> selectMapById(int id);

    List<Book> selectNameAndTypeAndDescriptionById(@Param("id") Integer id);

    List<Book> selectNameAndDescriptionByIdAfter(@Param("id") Integer id);
}
