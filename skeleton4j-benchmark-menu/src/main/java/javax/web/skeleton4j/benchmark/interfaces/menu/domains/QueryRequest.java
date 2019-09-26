package javax.web.skeleton4j.benchmark.interfaces.menu.domains;

import lombok.Data;

import javax.web.doc.AbstractRequestPage;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2018/12/29.
 */
@Data
public class QueryRequest extends AbstractRequestPage{
    @ApidocElement(value = "姓名", maxLen = 10, required = false)
    String name;
}
