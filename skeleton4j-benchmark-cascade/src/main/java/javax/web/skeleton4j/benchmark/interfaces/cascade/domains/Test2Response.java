package javax.web.skeleton4j.benchmark.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class Test2Response extends AbstractResponse{
    @ApidocElement("姓名")
    String name;
}
