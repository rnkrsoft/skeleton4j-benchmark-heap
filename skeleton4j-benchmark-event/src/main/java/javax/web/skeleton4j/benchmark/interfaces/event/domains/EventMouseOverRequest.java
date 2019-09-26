package javax.web.skeleton4j.benchmark.interfaces.event.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebResultDisplay;
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
public class EventMouseOverRequest implements Serializable{
    @ApidocElement(value = "姓名", interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class,
                    value = "eventTestName",
                    params = @WebParam(name = "name", value = "${name}"),
                    cascadeEvent = WebTriggerEvent.MOUSE_OVER,
                    resultDisplay = @WebResultDisplay(column = "result1", displayType = WebDisplayType.DATA_SOURCE)
            ),
    })
    String name;
    @ApidocElement(value = "结果1", required = false)
    String result1;
    @ApidocElement(value = "结果2", required = false)
    String result2;
}
