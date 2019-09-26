package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add19Complex2Request implements Serializable{
    @ApidocElement("表格框1")
    List<TableRecord> record1;

    @ApidocElement("表格框2")
    List<TableRecord> record2;

    @ApidocElement("组合框1")
    GroupRecord groupRecord1;

    @ApidocElement("组合框2")
    GroupRecord groupRecord2;
}
