package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString
public class Delete1Request implements Serializable{
    @ApidocElement("删除物理键")
    String deleteId;
}
