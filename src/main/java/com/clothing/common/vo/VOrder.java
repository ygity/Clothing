package com.clothing.common.vo;

import com.clothing.entity.OrderDetail;

import java.util.Date;
import java.util.List;

public class VOrder {
    private Integer ordernum;
    private Double totalprice;
    private Integer uid;
    private List<OrderDetail> DetailList;
    private int  oid;
    private int  state;
    private String uname;
    private Date createdate;
    private String imgpath;
    private Integer cid;

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public List<OrderDetail> getDetailList() {
        return DetailList;
    }

    public void setDetailList(List<OrderDetail> detailList) {
        DetailList = detailList;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
