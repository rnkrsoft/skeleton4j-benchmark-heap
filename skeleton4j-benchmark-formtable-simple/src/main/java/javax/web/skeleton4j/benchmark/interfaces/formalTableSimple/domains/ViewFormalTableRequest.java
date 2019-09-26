package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Data
public class ViewFormalTableRequest implements Serializable{
    @ApidocElement(value = "流水号", unique = true, valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;
}
