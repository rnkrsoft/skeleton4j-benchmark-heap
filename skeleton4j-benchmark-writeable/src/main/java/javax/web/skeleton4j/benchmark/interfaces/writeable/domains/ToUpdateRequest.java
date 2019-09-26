package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class ToUpdateRequest implements Serializable{
    @ApidocElement(value = "流水号", unique = true)
    String serialNo;
}
