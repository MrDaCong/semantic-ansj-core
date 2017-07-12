package com.gemantic.semantic.ansj.constant;

/**
 * Created by wangcong on 2017/2/23.
 */
public enum StockStatusEnum {

    LISTING("listing"),
    STOP("stop");

    private String status;


    StockStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
