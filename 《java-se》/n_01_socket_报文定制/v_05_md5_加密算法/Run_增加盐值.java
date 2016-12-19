package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_05_md5_加密算法;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class Run_增加盐值 {

    public static void main(String[] args) {
        String str = "abcd1";
        String md5 = getNewMD5Hex(str,"小牛学堂");
        System.out.println("md5:" + md5);
        System.out.println("长度:"+ md5.length());

    }

    public static String getNewMD5Hex(String str,String salt){
        String md5 = DigestUtils.md5Hex(str + salt);
        return md5;
    }
}
