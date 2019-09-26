package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;

/**
 * Created by rnkrsoft.com on 2019/3/31.
 */
@Data
public class GetTreeResponse  extends AbstractResponse {
    @ApidocElement(value = "值", valueDisplayType = ValueDisplayType.TREE, interfaces = {
            @WebCascadeInterface(serviceClass = CityService.class, value = "fetchProvince", cascadeEvent = WebTriggerEvent.INIT, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE))
    })
    String value1;
}
