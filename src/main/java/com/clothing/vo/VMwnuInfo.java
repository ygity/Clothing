package com.clothing.vo;

import java.util.List;

public class VMwnuInfo {
    private Integer pid;
    private String pname;
    private String cname;

    private List<VMwnuInfo> vMwnuInfos;//子菜单列表

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<VMwnuInfo> getvMwnuInfos() {
        return vMwnuInfos;
    }

    public void setvMwnuInfos(List<VMwnuInfo> vMwnuInfos) {
        this.vMwnuInfos = vMwnuInfos;
    }
}
