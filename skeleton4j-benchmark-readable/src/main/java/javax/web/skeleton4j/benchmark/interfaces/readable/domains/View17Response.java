package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View17Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

}
