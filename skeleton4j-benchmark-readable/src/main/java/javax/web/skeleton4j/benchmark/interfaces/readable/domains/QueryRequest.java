package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.AbstractRequestPage;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@Data
@ToString
public class QueryRequest extends AbstractRequestPage{
    @ApidocElement(value = "姓名", maxLen = 10, required = false)
    String name;
    @ApidocElement(value = "年龄1", maxLen = 2, required = false)
    int age1;
    @ApidocElement(value = "年龄2", maxLen = 2, required = false)
    Integer age2;
}
