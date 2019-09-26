package javax.web.skeleton4j.benchmark.interfaces.event.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@Data
public class EventTestNameResponse extends AbstractResponse{
    @ApidocElement("xxxx")
    String xxx;
}
