package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add17GroupRequest implements Serializable{
    @ApidocElement("组合框1")
    GroupRecord record;
}
