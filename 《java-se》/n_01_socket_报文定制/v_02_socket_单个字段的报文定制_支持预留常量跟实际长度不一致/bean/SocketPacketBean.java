package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_02_socket_单个字段的报文定制_支持预留常量跟实际长度不一致.bean;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 * 【报文规则定制】
 * ).编号 + 业务代码长度 + 业务代码 + 内容长度 + 内容
 * ).编号(32byte) + 业务代码长度(1byte) + 业务代码 + 内容长度(4byte) + 内容
 */
public class SocketPacketBean {

    /**
     * 通信的数据包
     */
    private byte[] dataPacketByteArray ;


    public byte[] getDataPacketByteArray() {
        return dataPacketByteArray;
    }

    public void setDataPacketByteArray(byte[] dataPacketByteArray) {
        this.dataPacketByteArray = dataPacketByteArray;
    }
}
