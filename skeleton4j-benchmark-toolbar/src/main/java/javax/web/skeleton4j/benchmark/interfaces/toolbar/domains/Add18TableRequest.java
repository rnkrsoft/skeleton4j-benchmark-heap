package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add18TableRequest implements Serializable{
    @ApidocElement("表格框1")
    List<TableRecord> record;
}
