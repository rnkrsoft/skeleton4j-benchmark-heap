package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add2TextRequest implements Serializable{
    @ApidocElement(value = "文本框1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, placeholder = "演示默认值字符串", defaults = "123")
    String text1;

    @ApidocElement(value = "文本框2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, placeholder = "演示默认值字符串", defaults = "456")
    String text2;
}
