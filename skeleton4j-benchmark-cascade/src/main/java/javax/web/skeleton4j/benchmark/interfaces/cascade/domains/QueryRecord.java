package javax.web.skeleton4j.benchmark.interfaces.cascade.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.benchmark.interfaces.cascade.services.CascadeService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/7/26.
 */
@Data
@Builder
public class QueryRecord implements Serializable{
    @ApidocElement(value = "流水号", unique = true, maxLen = 36, interfaces = {
            @WebCascadeInterface(displayName = "查看",
                    serviceClass = CascadeService.class,
                    value = "view",
                    confirm = true,
                    confirmMessage = "${serialNo}----${name}=-==${age}",
                    params = {
                            @WebParam(name = "serialNo1", value = "${serialNo}"),
                            @WebParam(name = "name", value = "${name}")
                    }
            )
    })
    String serialNo;
    @ApidocElement(value = "姓名", maxLen = 20)
    String name;
    @ApidocElement(value = "年龄", maxLen = 10)
    Integer age;
}
