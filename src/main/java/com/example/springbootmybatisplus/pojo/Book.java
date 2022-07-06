package com.example.springbootmybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther xukj
 * @date 2022/7/5 11:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_book")
public class Book {
    @TableId(value = "uid")
    private Integer id;
    private String type;
    private String name;
    @TableField("description")
    private String description;
    @TableLogic
    @TableField("is_delete")
    private Integer isDelete;
}
