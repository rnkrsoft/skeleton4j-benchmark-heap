package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View14Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "richtext1", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false)
    String richtext1;

    @ApidocElement(value = "richtext2", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false, defaults = "<p>123</p>")
    String richtext2;

    @ApidocElement(value = "richtext3", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true)
    String richtext3;

    @ApidocElement(value = "richtext4", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true, defaults = "<p>123</p>")
    String richtext4;
}
