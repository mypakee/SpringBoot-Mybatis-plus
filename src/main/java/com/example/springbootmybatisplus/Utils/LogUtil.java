package com.example.springbootmybatisplus.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @auther xukj
 * @date 2022/7/5 12:28
 */
@Component
public   class LogUtil {
    String path = "C:\\Users\\Administrator\\Desktop\\temp.txt";
    DateFormat dateFormat = null;
    @Autowired
    FileOut fileOut;
    public   <T> void doLog(List<T> list){
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //记录日志时间
        fileOut.writerOut(path,"======="+dateFormat.format(date)+"=======\r\n");
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            T t = iterator.next();
            fileOut.writerOut(path,t.toString()+"\r\n");
        }
    }
}
