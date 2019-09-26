package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Data;

import javax.web.doc.AbstractRequestPage;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@Data
public class QueryFormalTableRequest extends AbstractRequestPage{
    @ApidocElement(value = "流水号", required = false, valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;
}
