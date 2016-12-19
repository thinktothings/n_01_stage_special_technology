package com.opensourcesteam.java.enhance.n_01_socket_报文定制.v_01_socket_单个字段的报文定制.bean;

/**
 * 日期: hadoop on 16/10/19.
 * 出品单位: 小牛学堂 （http://www.edu360.cn）
 * 开发者: 刘文 (liuwen@sunzonedu.com)
 * 功能描述:
 */
public class DataPacketBean {
    public DataPacketBean() {
    }

    public DataPacketBean(String id, String businessId, String content, String md5) {
        this.id = id;
        this.businessId = businessId;
        this.content = content;
        this.md5 = md5;
    }

    /**
     * 数据包编号(只能是数字 + 英文)
     */
    private String id;
    /**
     * 业务代码(只能是数字 + 英文)
     */
    private String businessId;
    /**
     * 内容
     */
    private String content;



    /**
     * 数据验证，防止数据被串改
     */
    private String md5;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Override
    public String toString() {
        return "id:" + id +"\n"
                + "businessId:" + businessId +"\n"
                + "content:" +content +"\n"
                + "md5:" +md5 +"\n"
                ;
    }
}
