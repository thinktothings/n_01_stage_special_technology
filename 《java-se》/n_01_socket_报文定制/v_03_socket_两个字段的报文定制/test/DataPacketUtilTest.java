package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_03_socket_两个字段的报文定制.test;

import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_03_socket_两个字段的报文定制.bean.DataPacketBean;
import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_03_socket_两个字段的报文定制.bean.SocketPacketBean;
import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_03_socket_两个字段的报文定制.util.DataPacketUtil;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class DataPacketUtilTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void analyzingData() throws Exception {
        DataPacketBean dataPacketBean = new DataPacketBean("1","001","你好","111");
        SocketPacketBean socketPacketBean = DataPacketUtil.processingData(dataPacketBean);
        DataPacketBean dataPacketBeanResult = DataPacketUtil.analyzingData(socketPacketBean);
        System.out.println(dataPacketBeanResult);
        System.out.println(socketPacketBean.getDataPacketByteArray().length);


    }

    @org.junit.Test
    public void extract() throws Exception {

    }

    @org.junit.Test
    public void processingData() throws Exception {
        DataPacketBean dataPacketBean = new DataPacketBean("1","abc","你好","111");
        SocketPacketBean socketPacketBean = DataPacketUtil.processingData(dataPacketBean);

    }

}