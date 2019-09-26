package javax.web.skeleton4j.benchmark.common.interfaces.domains;


import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2019/4/1.
 */
@Data
public class FetchMobileResponse extends AbstractResponse {
    @ApidocElement("文本")
    String text;
}
