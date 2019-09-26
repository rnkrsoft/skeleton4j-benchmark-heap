package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View13Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "textarea1", valueDisplayType = ValueDisplayType.TEXTAREA, required = false)
    String textarea1;

    @ApidocElement(value = "textarea2", valueDisplayType = ValueDisplayType.TEXTAREA, required = false, defaults = "<p>123</p>")
    String textarea2;

    @ApidocElement(value = "textarea3", valueDisplayType = ValueDisplayType.TEXTAREA, required = true)
    String textarea3;

    @ApidocElement(value = "textarea4", valueDisplayType = ValueDisplayType.TEXTAREA, required = true, defaults = "<p>456</p>")
    String textarea4;
}
