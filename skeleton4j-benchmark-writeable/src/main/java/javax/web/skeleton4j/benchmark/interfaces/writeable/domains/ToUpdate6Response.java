package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

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
import javax.web.skeleton4j.benchmark.interfaces.writeable.services.UpdateService;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class ToUpdate6Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true, unique = true, interfaces = {
            @WebCascadeInterface(serviceClass = UpdateService.class, value = "update6", displayName = "修改保存", resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
    String serialNo;

    @ApidocElement(value = "单选1", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false
    )
    String select1;

    @ApidocElement(value = "单选2", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            defaults = "023"
    )
    String select2;

    @ApidocElement(value = "单选3", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            defaults = "010"
    )
    String select3;

    @ApidocElement(value = "单选4", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true
    )
    String select4;

    @ApidocElement(value = "单选5", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = "023"
    )
    String select5;

    @ApidocElement(value = "单选6", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = "010"
    )
    String select6;
}
