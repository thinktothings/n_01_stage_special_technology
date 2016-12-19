package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_04_socket_三个字段的报文定制.util;

import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_04_socket_三个字段的报文定制.bean.DataPacketBean;
import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_04_socket_三个字段的报文定制.bean.SocketPacketBean;
import com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_04_socket_三个字段的报文定制.constant.DataPackageConstant;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class DataPacketUtil {

    /**
     * 解析报表
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

        //得到业务占几个byte
        String businessIdLengthPlaceholder = extract(dataPacketByteArray,resultArrayIndex, DataPackageConstant.businessIdLengthPlaceholder);
        resultArrayIndex += DataPackageConstant.businessIdLengthPlaceholder;

        //业务id
        String businessId = extract(dataPacketByteArray,resultArrayIndex,Integer.parseInt(businessIdLengthPlaceholder));
        resultArrayIndex += Integer.parseInt(businessIdLengthPlaceholder);


        //得到内容占几个byte
        String contentLengthPlaceholder = extract(dataPacketByteArray,resultArrayIndex, DataPackageConstant.contentLengthPlaceholder);
        resultArrayIndex += DataPackageConstant.contentLengthPlaceholder;

        //内容
        String content = extract(dataPacketByteArray,resultArrayIndex,Integer.parseInt(contentLengthPlaceholder));
        resultArrayIndex += Integer.parseInt(contentLengthPlaceholder);




        DataPacketBean dataPacketBean = new DataPacketBean(id,businessId,content,"");

        return dataPacketBean;
    }


    /**
     * 从二进制数组中提取字段
     * @param array
     * @param beginIndex
     * @param length
     * @return
     */
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
                + DataPackageConstant.businessIdLengthPlaceholder //业务长度占位长度
                + dataPacketBean.getBusinessId().getBytes().length //业务长度

                + DataPackageConstant.contentLengthPlaceholder //内容长度占位长度
                + dataPacketBean.getContent().getBytes().length //内容长度



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


        //业务长度
        byte[] businessIdLengthArray = (dataPacketBean.getBusinessId().getBytes().length + "").getBytes();
        System.arraycopy(businessIdLengthArray,0,resultArray,resultArrayIndex, businessIdLengthArray.length);
        resultArrayIndex += DataPackageConstant.businessIdLengthPlaceholder;

        //存业务到 数组中
        System.arraycopy(dataPacketBean.getBusinessId().getBytes(),0,resultArray,resultArrayIndex, dataPacketBean.getBusinessId().getBytes().length); //存放编号到 数组中
        resultArrayIndex += dataPacketBean.getBusinessId().getBytes().length;


        //内容长度
        byte[] contentLengthArray = (dataPacketBean.getContent().getBytes().length + "").getBytes();
        System.arraycopy(contentLengthArray,0,resultArray,resultArrayIndex, contentLengthArray.length);
        resultArrayIndex += DataPackageConstant.contentLengthPlaceholder;

        //存内容到 数组中
        System.arraycopy(dataPacketBean.getContent().getBytes(),0,resultArray,resultArrayIndex, dataPacketBean.getContent().getBytes().length); //存放编号到 数组中
        resultArrayIndex += dataPacketBean.getContent().getBytes().length;


        socketPacketBean.setDataPacketByteArray(resultArray);


        return socketPacketBean;
    }
}
