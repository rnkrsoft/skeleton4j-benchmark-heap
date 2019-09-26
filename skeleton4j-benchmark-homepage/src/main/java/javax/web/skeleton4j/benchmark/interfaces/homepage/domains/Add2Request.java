package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add2Request implements Serializable{
    @ApidocElement(value = "年龄1", maxLen = 2, required = false, placeholder = "文本框非必输")
    int age1;

    @ApidocElement(value = "年龄2", maxLen = 2, defaults = "2", required = false, placeholder = "文本框非必输")
    int age2;

    @ApidocElement(value = "年龄3", maxLen = 2, required = true, placeholder = "文本框非必输")
    int age3;

    @ApidocElement(value = "年龄4", maxLen = 2, defaults = "4", required = true, placeholder = "文本框非必输")
    int age4;

    @ApidocElement(value = "年龄5", maxLen = 2, required = false, placeholder = "文本框非必输")
    Integer age5;

    @ApidocElement(value = "年龄6", maxLen = 2, defaults = "6", required = false, placeholder = "文本框非必输")
    Integer age6;

    @ApidocElement(value = "年龄7", maxLen = 2, required = true, placeholder = "文本框非必输")
    Integer age7;

    @ApidocElement(value = "年龄8", maxLen = 2, defaults = "8", required = true, placeholder = "文本框非必输")
    Integer age8;

    @ApidocElement(value = "年龄9", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = false, placeholder = "文本框非必输")
    int age9;

    @ApidocElement(value = "年龄10", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "2", required = false, placeholder = "文本框非必输")
    int age10;

    @ApidocElement(value = "年龄11", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = true, placeholder = "文本框非必输")
    int age11;

    @ApidocElement(value = "年龄12", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "4", required = true, placeholder = "文本框非必输")
    int age12;

    @ApidocElement(value = "年龄13", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = false, placeholder = "文本框非必输")
    Integer age13;

    @ApidocElement(value = "年龄14", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "6", required = false, placeholder = "文本框非必输")
    Integer age14;

    @ApidocElement(value = "年龄15", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = true, placeholder = "文本框非必输")
    Integer age15;

    @ApidocElement(value = "年龄16", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "8", required = true, placeholder = "文本框非必输")
    Integer age16;
}
