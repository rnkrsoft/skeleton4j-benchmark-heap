package javax.web.skeleton4j.benchmark.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/7/26.
 */
@Data
public class ViewRequest implements Serializable{
    @ApidocElement(value = "流水号", unique = true, maxLen = 36, hidden = true)
    String serialNo1;
    @ApidocElement(value = "姓名", maxLen = 20)
    String name;
}
