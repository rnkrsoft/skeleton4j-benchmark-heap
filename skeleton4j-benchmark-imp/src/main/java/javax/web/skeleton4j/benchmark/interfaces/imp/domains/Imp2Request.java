package javax.web.skeleton4j.benchmark.interfaces.imp.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@Data
public class Imp2Request implements Serializable{
    @ApidocElement(value = "记录2", required = false)
    final List<Record2> records2 = new ArrayList<Record2>();
}
