package com.gemantic.semantic.ansj.constant;

/**
 * Created by wangcong on 2017/2/23.
 */
public enum NatureEnum {
    ST("股票","st"),
    GN("概念","gn"),
    ZS("指数","zs"),
    RD("热点","rd"),
    XQ("消歧","xq"),
    HY("行业概念","hy"),
    JSZB("技术指标","jszb"),
    CWZB("财务指标","cwzb"),
    BJSJ("基础报价数据","bjsj"),
    XT("形态","xt"),
    JDHQ("阶段行情","jdhq");


    private String name;
    private String nature;

    NatureEnum(String name,String nature) {
        this.name = name;
        this.nature = nature;
    }

    public String getNature() {
        return nature;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}
