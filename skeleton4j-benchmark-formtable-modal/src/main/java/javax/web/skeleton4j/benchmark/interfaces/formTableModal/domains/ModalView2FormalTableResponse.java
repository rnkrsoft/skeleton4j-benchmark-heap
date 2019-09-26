package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

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
public class ModalView2FormalTableResponse extends AbstractResponse{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;


    @ApidocElement(value = "表格2", valueDisplayType = ValueDisplayType.TABLE, extras = "formStyle:modal")
    final List<ModalView2FormalTable> table1 = new ArrayList<ModalView2FormalTable>();
}
