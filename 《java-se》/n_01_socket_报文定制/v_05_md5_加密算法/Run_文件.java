package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_05_md5_加密算法;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.FileReader;
import java.io.IOException;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class Run_文件 {

    public static void main(String[] args) {
        String filePath = "/opt/temp/管家婆报表展示error.txt";
        String str = getFileContent(filePath);
        String md5 = DigestUtils.md5Hex(str);
        System.out.println("md5:" + md5);
        System.out.println("长度:"+ md5.length());


    }

    public static String getFileContent(String path){
        try {
            StringBuffer str = new StringBuffer();
            char[] buf = new char[1024];
            FileReader f = new FileReader(path);
            int length = 0 ;
            while((length = f.read(buf))>0){
                if(length == buf.length){
                    str.append(buf);
                }else{
                    char[] newBuf = new char[length];
                    System.arraycopy(buf,0,newBuf,0,length);
                    str.append(newBuf);
                }

            }
            return str.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
