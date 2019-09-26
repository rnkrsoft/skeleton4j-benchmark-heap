package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebLayout;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add1Request implements Serializable{
    @ApidocElement(value = "文本信息1", cssClasses = "xxx", stylesheet = "width:10px", extras = "selectParent:false", layout = WebLayout.LINEAR, maxLen = 36, required = false, placeholder = "文本框非必输")
    String text1;

    @ApidocElement(value = "文本信息2", maxLen = 36, required = false, defaults = "123", placeholder = "文本框非必输默认值")
    String text2;

    @ApidocElement(value = "文本信息3", maxLen = 36, required = true, placeholder = "文本框必输")
    String text3;

    @ApidocElement(value = "文本信息4", maxLen = 36, required = true, layout = WebLayout.LINEAR, defaults = "456", placeholder = "文本框必输默认值")
    String text4;

    @ApidocElement(value = "文本信息5", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, placeholder = "文本框非必输")
    String text5;

    @ApidocElement(value = "文本信息6", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, defaults = "789", placeholder = "文本框非必输默认值")
    String text6;

    @ApidocElement(value = "文本信息7", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, placeholder = "文本框必输")
    String text7;

    @ApidocElement(value = "文本信息8", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, defaults = "1234", placeholder = "文本框必输默认值")
    String text8;
}
