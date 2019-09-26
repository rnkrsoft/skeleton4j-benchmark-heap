package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains;

import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services.TestService;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class CascadeTextRequest implements Serializable {
    @ApidocElement(value = "类型", interfaces = {
            @WebCascadeInterface(serviceClass = TestService.class,
                    value = "test1",
                    cascadeEvent = WebTriggerEvent.CLICK,
                    params = {
                            @WebParam(name = "type", value = "${type}"),
                            @WebParam(name = "sex",  value = "123456"),
                            @WebParam(name = "name", value = "${name1}")
                    },
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
    })
    String type;
    @ApidocElement(value = "性别", defaults = "21")
    String sex;
    @ApidocElement(value = "姓名", defaults = "test1", interfaces = {
            @WebCascadeInterface(serviceClass = TestService.class,
                    value = "test1",
                    cascadeEvent = WebTriggerEvent.CHANGE,
                    params = {
                            @WebParam(name = "type",  value = "1"),
                            @WebParam(name = "sex", value = "${sex}"),
                            @WebParam(name = "name", value = "${name1}")
                    },
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
    })
    String name1;
}
