package com.gemantic.semantic.ansj.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 只读类
 * Created by wangcong on 2017/2/23.
 */
@ApiModel("分词结果的封装")
public class AnsjResult implements Serializable {
    private static final long serialVersionUID = -2527080547125363973L;

    @ApiModelProperty("分词结果")
    private List<AnsjTerm> terms;

    public List<AnsjTerm> getTerms() {
        return terms;
    }

    public void setTerms(List<AnsjTerm> terms) {
        this.terms = terms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnsjResult that = (AnsjResult) o;

        return Objects.equal(this.terms, that.terms);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(terms);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("terms", terms)
                .toString();
    }
}
