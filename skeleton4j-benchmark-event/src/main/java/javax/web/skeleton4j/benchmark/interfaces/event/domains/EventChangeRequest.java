package javax.web.skeleton4j.benchmark.interfaces.event.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.common.interfaces.services.CityService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.benchmark.interfaces.event.services.EventTestService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@Data
public class EventChangeRequest implements Serializable{
    @ApidocElement(value = "姓名", interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class,
                    value = "eventTestName",
                    params = @WebParam(name = "name", value = "${name1}"),
                    cascadeEvent = WebTriggerEvent.CHANGE,
                    resultDisplay = @WebResultDisplay(column = "result1", displayType = WebDisplayType.DATA_SOURCE)
            )
    })
    String name1;
    @ApidocElement(value = "结果1", required = false)
    String result1;
    @ApidocElement(value = "输入", required = false, interfaces = {
            @WebCascadeInterface(serviceClass = CityService.class,
                    value = "fetchCity",
                    cascadeEvent = WebTriggerEvent.CHANGE,
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE, column = "city")
            )
    })
    String result2;
    @ApidocElement(value = "城市", required = false, valueDisplayType = ValueDisplayType.SELECTION)
    String city;
}
