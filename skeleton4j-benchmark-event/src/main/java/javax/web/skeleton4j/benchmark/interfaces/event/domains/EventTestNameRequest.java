package javax.web.skeleton4j.benchmark.interfaces.event.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@Data
public class EventTestNameRequest implements Serializable{
    @ApidocElement(value = "姓名", required = false)
    String name;
}
