package javax.web.skeleton4j.benchmark.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.interfaces.cascade.services.TestService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class CascadeTextRequest implements Serializable{
    @ApidocElement("类型")
    String type;
    @ApidocElement("性别")
    String sex;
    @ApidocElement(value = "姓名", interfaces = {
            @WebCascadeInterface(
                    serviceClass = TestService.class,
                    value = "test1",
                    cascadeEvent = WebTriggerEvent.CHANGE,
                    params = {
                            @WebParam(name = "type", value = "${type}"),
                            @WebParam(name = "sex", value = "${sex}"),
                            @WebParam(name = "name", value = "${name1}")
                    },
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)
            ),
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test2", cascadeEvent = WebTriggerEvent.FOCUS, cascadeColumn = {"type", "sex"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test2", cascadeEvent = WebTriggerEvent.BLUR, cascadeColumn = {"type", "sex"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
    String name1;
}
