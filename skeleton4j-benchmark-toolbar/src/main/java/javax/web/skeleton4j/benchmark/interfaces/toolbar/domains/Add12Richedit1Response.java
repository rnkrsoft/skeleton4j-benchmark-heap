package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2019/1/1.
 */
@Data
public class Add12Richedit1Response extends AbstractResponse{
    @ApidocElement(value = "内容1", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false)
    String richtext1;

    @ApidocElement(value = "内容2", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true)
    String richtext2;
}
