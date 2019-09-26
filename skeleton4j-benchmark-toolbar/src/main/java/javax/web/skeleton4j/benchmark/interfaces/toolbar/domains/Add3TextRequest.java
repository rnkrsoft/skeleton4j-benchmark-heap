package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class Add3TextRequest implements Serializable{
    @ApidocElement(value = "文本框1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, placeholder = "演示无默认值")
    String text1;

    @ApidocElement(value = "文本框2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, placeholder = "演示无默认值")
    String text2;
}
