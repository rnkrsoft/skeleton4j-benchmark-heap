package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.services.AreaTypeService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
public class Add1AreaResponse extends AbstractResponse {
    @ApidocElement(value = "区域类型1", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
            , readonly = true)
    String type1;
    @ApidocElement(value = "区域类型2", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            defaults = "1"
            , readonly = true)
    String type2;
    @ApidocElement(value = "区域类型3", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            defaults = "2"
            , readonly = true)
    String type3;
}
