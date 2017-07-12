package com.gemantic.semantic.ansj.constant;

/**
 * Created by wangcong on 2017/2/23.
 */
public enum MarketEnum {

    SH("sh"),
    SZ("sz");

    private String market;


    MarketEnum(String market) {
        this.market = market;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }
}
