package javax.web.skeleton4j.benchmark.interfaces.msgbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@Data
public class GetTxDateResponse extends AbstractResponse{
    @ApidocElement("文本信息")
    String text;
}
