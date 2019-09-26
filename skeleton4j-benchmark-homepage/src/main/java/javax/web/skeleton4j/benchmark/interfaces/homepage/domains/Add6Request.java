package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.services.CityService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add6Request implements Serializable {
    @ApidocElement(value = "流水号", hidden = false, unique = true, defaults = "123546")
    String serialNo;

    @ApidocElement(value = "单选1", placeholder = "请输入单选1 级联字段流水号", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "单选2", placeholder = "请输入单选2", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "单选3", placeholder = "请输入单选3", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "单选4", placeholder = "请输入单选4", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "单选5", placeholder = "请输入单选5", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "单选6", placeholder = "请输入单选6", valueDisplayType = ValueDisplayType.SELECTION,
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
