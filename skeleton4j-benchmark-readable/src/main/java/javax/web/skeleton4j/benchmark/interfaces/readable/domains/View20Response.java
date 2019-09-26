package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View20Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "表格1", required = false)
    final List<TableRecord> table1 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格2", required = true)
    final List<TableRecord> table2 = new ArrayList<TableRecord>();
}
