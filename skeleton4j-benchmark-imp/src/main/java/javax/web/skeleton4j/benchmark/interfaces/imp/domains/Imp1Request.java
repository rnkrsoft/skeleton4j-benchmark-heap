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
public class Imp1Request implements Serializable{
    @ApidocElement(value = "记录1", required = false)
    final List<Record1> records1 = new ArrayList<Record1>();
}
