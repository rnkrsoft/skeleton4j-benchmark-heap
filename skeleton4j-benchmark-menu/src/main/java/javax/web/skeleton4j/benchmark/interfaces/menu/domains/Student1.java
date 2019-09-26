package javax.web.skeleton4j.benchmark.interfaces.menu.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.menu.service.DetailService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/12/29.
 */
@Data
@Builder
public class Student1 implements Serializable {
    @ApidocElement(value = "流水号", unique = true, maxLen = 36,
            interfaces = {
                    @WebCascadeInterface(displayName = "详情1", serviceClass = DetailService.class, value = "viewStudent_1=viewStudent1"),
                    @WebCascadeInterface(displayName = "详情2", serviceClass = DetailService.class, value = "viewStudent_2=viewStudent1")
            }
    )
    int serialNo;
    @ApidocElement(value = "姓名", maxLen = 4)
    String name;
    @ApidocElement(value = "年龄", maxLen = 3)
    int age;
    @ApidocElement(value = "地址", maxLen = 12)
    String address;
}
