package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/6/27.
 */
@Data
public class DeleteTree1Request implements Serializable {
    @ApidocElement("值")
    String value;
}
