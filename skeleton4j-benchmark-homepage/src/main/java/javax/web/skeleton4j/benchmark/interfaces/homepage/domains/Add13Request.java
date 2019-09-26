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
public class Add13Request implements Serializable {
    @ApidocElement(value = "textarea1", valueDisplayType = ValueDisplayType.TEXTAREA, required = false)
    String textarea1;

    @ApidocElement(value = "textarea2", valueDisplayType = ValueDisplayType.TEXTAREA, required = false, defaults = "<p>123</p>")
    String textarea2;

    @ApidocElement(value = "textarea3", valueDisplayType = ValueDisplayType.TEXTAREA, required = true)
    String textarea3;

    @ApidocElement(value = "textarea4", valueDisplayType = ValueDisplayType.TEXTAREA, required = true, defaults = "<p>456</p>")
    String textarea4;
}
