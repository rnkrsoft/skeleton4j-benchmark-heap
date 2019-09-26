package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains;

import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services.TestService;
import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import java.io.Serializable;
@Data
@Builder
public class Query1Record implements Serializable {
    @ApidocElement(unique = true, maxLen = 36, interfaces = {
            @WebCascadeInterface(serviceClass = TestService.class,
                    value = "test2",
                    params = {
                        @WebParam(name = "type", value = "${serialNo}"),
//                        @WebParam(name = "sex", type = WebParamType.CASCADE, value = "name")
                    }
            )
    })
    String serialNo;

    @ApidocElement(value = "姓名", maxLen = 36)
    String name;
}
