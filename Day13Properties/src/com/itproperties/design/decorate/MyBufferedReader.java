package com.itproperties.design.decorate;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader extends Reader {
    private FileReader r;
    public MyBufferedReader(FileReader r){
        this.r=r;
    }
    //实现方法,读取文本一行
    //实现读取一行，不会返回换行
    //读取到换行符是结束 \r\n
    public String readLine() throws IOException {
        /*读取换行，到缓冲区
        * 不是换行，继续读*/
        StringBuilder sb=new StringBuilder();
        int len=0;
        while((len=r.read())!=-1){
            if (len=='\r')
                continue;
            if (len=='\n')
                return sb.toString();
            sb.append((char)len);//必须转成字符型才能打印成字符
        }
        if (sb.length()>0)  return sb.toString();
        return null;
    }

    @Override
    public void close() throws IOException {
        r.close();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }
}
