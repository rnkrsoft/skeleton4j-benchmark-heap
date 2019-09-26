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
public class Add14Request implements Serializable {

    @ApidocElement(value = "richtext1", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false)
    String richtext1;

    @ApidocElement(value = "richtext2", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false, defaults = "<p>123</p>")
    String richtext2;

    @ApidocElement(value = "richtext3", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true)
    String richtext3;

    @ApidocElement(value = "richtext4", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true, defaults = "<p>123</p>")
    String richtext4;
}
