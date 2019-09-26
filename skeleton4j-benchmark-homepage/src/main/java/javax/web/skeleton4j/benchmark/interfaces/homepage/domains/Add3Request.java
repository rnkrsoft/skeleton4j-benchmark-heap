package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add3Request implements Serializable{

    @ApidocElement(value = "日期类型1", placeholder = "请输入日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", required = false)
    String date1;

    @ApidocElement(value = "日期类型2", placeholder = "请输入日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", required = false)
    String date2;

    @ApidocElement(value = "日期类型3", placeholder = "请输入日期3", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", required = false)
    String date3;

    @ApidocElement(value = "日期类型4", placeholder = "请输入日期4", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd",defaults = "2019/01/01", required = false)
    String date4;

    @ApidocElement(value = "日期类型5", placeholder = "请输入日期5", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", defaults = "01:02:03", required = false)
    String date5;

    @ApidocElement(value = "日期类型6", placeholder = "请输入日期6", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", defaults = "2019/01/01 01:02:03", required = false)
    String date6;

    @ApidocElement(value = "日期类型7", placeholder = "请输入日期7", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", required = true)
    String date7;

    @ApidocElement(value = "日期类型8", placeholder = "请输入日期8", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", required = true)
    String date8;

    @ApidocElement(value = "日期类型9", placeholder = "请输入日期9", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", required = true)
    String date9;

    @ApidocElement(value = "日期类型10", placeholder = "请输入日期10", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd",defaults = "2019/01/01", required = true)
    String date10;

    @ApidocElement(value = "日期类型11", placeholder = "请输入日期11", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", defaults = "01:02:03", required = true)
    String date11;

    @ApidocElement(value = "日期类型12", placeholder = "请输入日期12", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", defaults = "2019/01/01 01:02:03", required = true)
    String date12;
}
