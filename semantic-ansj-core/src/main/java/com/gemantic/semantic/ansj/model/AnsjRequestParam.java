package com.gemantic.semantic.ansj.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by wangcong on 2017/6/16.
 */
@ApiModel("请求分词服务的参数对象")
public class AnsjRequestParam implements Serializable{

    private static final long serialVersionUID = 4679558944505607738L;
    @ApiModelProperty(value = "分词的原文")
    private String content;
    @ApiModelProperty(value = "是否使用停用词")
    private Boolean filter = true;
    @ApiModelProperty(value = "结果中是否带文本词性")
    private Boolean nature = false;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getFilter() {
        return filter;
    }

    public void setFilter(Boolean filter) {
        this.filter = filter;
    }

    public Boolean getNature() {
        return nature;
    }

    public void setNature(Boolean nature) {
        this.nature = nature;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnsjRequestParam that = (AnsjRequestParam) o;

        return Objects.equal(this.content, that.content) &&
                Objects.equal(this.filter, that.filter) &&
                Objects.equal(this.nature, that.nature);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(content, filter, nature);
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("content", content)
                .add("filter", filter)
                .add("nature", nature)
                .toString();
    }
}
