package javax.web.skeleton4j.benchmark.interfaces.imp.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@Data
public class Exp1Response extends AbstractResponse{
    @ApidocElement("记录1")
    final List<Record1> records1 = new ArrayList<Record1>();
}
