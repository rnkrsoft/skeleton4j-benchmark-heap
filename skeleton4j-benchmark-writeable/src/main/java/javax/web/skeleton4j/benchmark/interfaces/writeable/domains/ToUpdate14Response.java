package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.interfaces.writeable.services.UpdateService;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class ToUpdate14Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true, unique = true, interfaces = {
            @WebCascadeInterface(serviceClass = UpdateService.class, value = "update14", displayName = "修改保存", resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
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
