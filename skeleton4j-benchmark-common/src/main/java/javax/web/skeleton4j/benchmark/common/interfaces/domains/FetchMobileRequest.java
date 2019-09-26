package javax.web.skeleton4j.benchmark.common.interfaces.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/4/1.
 */
@Data
public class FetchMobileRequest implements Serializable{
    @ApidocElement(value = "值", required = false)
    String value1;
}
