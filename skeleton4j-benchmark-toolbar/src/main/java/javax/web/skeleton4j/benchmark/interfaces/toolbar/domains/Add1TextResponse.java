package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebLayout;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add1TextResponse extends AbstractResponse{
    @ApidocElement(value = "文本框1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, layout = WebLayout.LINEAR, readonly = true)
    String text1;

    @ApidocElement(value = "文本框2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, readonly = true)
    String text2;
}
