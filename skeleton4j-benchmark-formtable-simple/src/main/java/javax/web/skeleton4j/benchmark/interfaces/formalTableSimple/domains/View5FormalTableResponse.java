package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Data
public class View5FormalTableResponse extends AbstractResponse{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;


    @ApidocElement(value = "表格1", valueDisplayType = ValueDisplayType.TABLE, extras = "formStyle:form")
    final List<View5FormalTable> table1 = new ArrayList<View5FormalTable>();
}
