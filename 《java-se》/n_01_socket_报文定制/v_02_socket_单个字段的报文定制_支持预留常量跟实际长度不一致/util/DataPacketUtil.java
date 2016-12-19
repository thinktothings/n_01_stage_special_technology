package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_02_socket_单个字段的报文定制_支持预留常量跟实际长度不一致.util;

import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_02_socket_单个字段的报文定制_支持预留常量跟实际长度不一致.bean.DataPacketBean;
import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_02_socket_单个字段的报文定制_支持预留常量跟实际长度不一致.bean.SocketPacketBean;
import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_02_socket_单个字段的报文定制_支持预留常量跟实际长度不一致.constant.DataPackageConstant;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class DataPacketUtil {

    /**
     * 报文解析
     * @param socketPacketBean
     * @return
     */
    public static DataPacketBean analyzingData(SocketPacketBean socketPacketBean){


        byte[] dataPacketByteArray = socketPacketBean.getDataPacketByteArray();

        //得到编号占几个byte
        String idLengthStringPlaceholder = extract(dataPacketByteArray,0, DataPackageConstant.idLengthPlaceholder);
        int resultArrayIndex = DataPackageConstant.idLengthPlaceholder;

        //编号
        String id = extract(dataPacketByteArray,resultArrayIndex,Integer.parseInt(idLengthStringPlaceholder));
        resultArrayIndex += Integer.parseInt(idLengthStringPlaceholder);





        DataPacketBean dataPacketBean = new DataPacketBean(id,"","","");

        return dataPacketBean;
    }


    public static String extract(byte[] array,int beginIndex,int length){
        byte[] resultArray = new byte[length];
        System.arraycopy(array,beginIndex,resultArray,0,length);

        return new String(resultArray).trim();
    }

    /**
     * 把数据进行报文定制处理
     * @param dataPacketBean 数据包Bean
     * @return
     */
    public static SocketPacketBean processingData(DataPacketBean dataPacketBean){

        SocketPacketBean socketPacketBean = new SocketPacketBean();
        int resultArrayLength = DataPackageConstant.idLengthPlaceholder //编号长度占位长度
                + dataPacketBean.getId().getBytes().length //编号长度



                ;

      //加工后的数组
        byte[] resultArray = new byte[resultArrayLength];


        int resultArrayIndex = 0;

        //编号长度
        byte[] idLengthArray = (dataPacketBean.getId().getBytes().length + "").getBytes();
        System.arraycopy(idLengthArray,0,resultArray,resultArrayIndex, idLengthArray.length);
        resultArrayIndex += DataPackageConstant.idLengthPlaceholder ;

        //存放编号到 数组中
        System.arraycopy(dataPacketBean.getId().getBytes(),0,resultArray,resultArrayIndex, dataPacketBean.getId().getBytes().length); //存放编号到 数组中
        resultArrayIndex += dataPacketBean.getId().getBytes().length;



        socketPacketBean.setDataPacketByteArray(resultArray);


        return socketPacketBean;
    }


}
