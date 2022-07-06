package com.example.springbootmybatisplus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootmybatisplus.Utils.FileOut;
import com.example.springbootmybatisplus.Utils.LogUtil;
import com.example.springbootmybatisplus.mapper.BookMapper;
import com.example.springbootmybatisplus.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @auther xukj
 * @date 2022/7/5 11:20
 */
@SpringBootTest
public class App {

    @Autowired
    private BookMapper bookmapper;
    @Autowired
    private FileOut fileOut;
    @Autowired
    LogUtil logUtil;


    @Test
    public void testSelect( ){
//        Book book = bookmapper.selectById(2);
//        System.out.println(book.toString());
//        Book b1 = new Book(13,"sphinx", "dossssss", "hop!!");
//        b1.setName("sphinx!!!@@@");
//        bookmapper.updateById(b1);
//        Book book = new Book();
//
//        book.setName("lucy");
//        book.setDesc("null");
//        book.setType("dos");
//        bookmapper.insert(book);

//        QueryWrapper<Book> qw = new QueryWrapper<Book>();
//        qw.ge("uid",1).ge("is_delete",2);
    /**
     *
     * MyBatisPlus大于等于、小于等于等等函数
     * 原符号   <    <=    >    >=   <>
     * 对应函数 lt() le() gt() ge() ne()
     * Mybatis-plus写法： queryWrapper.ge("create_time", localDateTime);
     * Mybatis写法： where create_time >= #{localDateTime}
     */
        Page<Book> page = new Page<>(1,3);
        Page<Book> page1 = bookmapper.selectPage(page, null);
        System.out.println(bookmapper.selectNameAndTypeAndDescriptionById(2));
        System.out.println(bookmapper.selectNameAndDescriptionByIdAfter(2));


    }

    }
