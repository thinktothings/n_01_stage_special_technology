package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_06_SHA_加密算法;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class Run_sha1Hex {

    public static void main(String[] args) {

        String str = "abcd";
        String sha1 = DigestUtils.sha1Hex(str);
        System.out.println("md5:" + sha1);
        System.out.println("长度:"+ sha1.length());
    }
}
