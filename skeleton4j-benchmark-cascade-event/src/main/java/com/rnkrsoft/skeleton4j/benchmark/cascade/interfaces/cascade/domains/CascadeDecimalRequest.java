package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class CascadeDecimalRequest implements Serializable{
    @ApidocElement("类型")
    String type;
    @ApidocElement("性别")
    String sex;
    @ApidocElement(value = "姓名", interfaces = {
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test1", cascadeEvent = WebTriggerEvent.CHANGE, cascadeColumn = {"type", "sex", "age"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test2", cascadeEvent = WebTriggerEvent.FOCUS, cascadeColumn = {"type", "sex"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test2", cascadeEvent = WebTriggerEvent.BLUR, cascadeColumn = {"type", "sex"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
    String age;
}
