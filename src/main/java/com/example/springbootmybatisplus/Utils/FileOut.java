package com.example.springbootmybatisplus.Utils;

import org.springframework.stereotype.Component;

import java.io.*;

/**
 * @auther xukj
 * @date 2022/7/5 11:51
 */
@Component
public class FileOut {
    BufferedWriter bw = null;
    public void writerOut(String path, String str)  {
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path,true)));
            bw.append(str);
            bw.flush();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
