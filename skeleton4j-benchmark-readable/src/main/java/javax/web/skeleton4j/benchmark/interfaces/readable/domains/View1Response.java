package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View1Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "文本信息1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT)
    String text1;

    @ApidocElement(value = "文本信息2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT)
    String text2;

    @ApidocElement(value = "文本信息1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, defaults = "123")
    String text3;

    @ApidocElement(value = "文本信息2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, defaults = "456")
    String text4;
}
