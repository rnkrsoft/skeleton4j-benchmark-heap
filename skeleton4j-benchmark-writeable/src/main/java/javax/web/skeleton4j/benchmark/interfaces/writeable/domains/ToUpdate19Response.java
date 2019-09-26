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
public class ToUpdate19Response extends AbstractResponse{
    @ApidocElement(value = "流水号", unique = true, hidden = true, interfaces = {
            @WebCascadeInterface(serviceClass = UpdateService.class, value = "update19", displayName = "修改保存", resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
    String serialNo;

}
