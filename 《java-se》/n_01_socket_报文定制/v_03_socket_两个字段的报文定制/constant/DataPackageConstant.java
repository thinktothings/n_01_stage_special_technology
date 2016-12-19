package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_03_socket_两个字段的报文定制.constant;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class DataPackageConstant {

    /**
     * 数据包编号长度，和多少个byte来存放
     * 1个byte存放
     */
    public static  int idLengthPlaceholder = 1;


    /**
     * 业务代码长度,1个byte存放
     */
    public static  int businessIdLengthPlaceholder = 1;

    /**
     * 内容长度,4个byte存放
     */
    public static int contentLength = 4;


}
