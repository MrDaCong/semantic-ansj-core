package com.gemantic.semantic.ansj.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 只读类
 * Created by wangcong on 2017/2/13.
 */
@ApiModel(value = "ansj分词结果")
public class AnsjTerm implements Serializable {

    private static final long serialVersionUID = 6898552393596556457L;

    @ApiModelProperty(value = "当前词")
    private String name;

    @ApiModelProperty(value = "realName")
    private String realName;

    @ApiModelProperty(value = "当前词的起始位置")
    private int offe;

    @ApiModelProperty(value = "本身这个term的词性.需要在词性识别之后才会有值,默认是空")
    private String nature = null;

    @ApiModelProperty(value = "是否是一个新词")
    private boolean newWord;

    @ApiModelProperty(value = "同义词")
    private Set<String> synonyms;

    private List<Map<String,String>> property;

    public List<Map<String, String>> getProperty() {
        return property;
    }

    public void setProperty(List<Map<String, String>> property) {
        this.property = property;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getOffe() {
        return offe;
    }

    public void setOffe(int offe) {
        this.offe = offe;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public boolean isNewWord() {
        return newWord;
    }

    public void setNewWord(boolean newWord) {
        this.newWord = newWord;
    }

    public Set<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(Set<String> synonyms) {
        this.synonyms = synonyms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnsjTerm that = (AnsjTerm) o;

        return Objects.equal(this.name, that.name) &&
                Objects.equal(this.realName, that.realName) &&
                Objects.equal(this.offe, that.offe) &&
                Objects.equal(this.nature, that.nature) &&
                Objects.equal(this.newWord, that.newWord) &&
                Objects.equal(this.synonyms, that.synonyms) &&
                Objects.equal(this.property, that.property);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, realName, offe, nature, newWord, synonyms,
                property);
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("realName", realName)
                .add("offe", offe)
                .add("nature", nature)
                .add("newWord", newWord)
                .add("synonyms", synonyms)
                .add("property", property)
                .toString();
    }
}
