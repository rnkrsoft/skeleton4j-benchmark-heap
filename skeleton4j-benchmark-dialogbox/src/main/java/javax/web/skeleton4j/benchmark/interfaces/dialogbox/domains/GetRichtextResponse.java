package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2019/3/31.
 */
@Data
public class GetRichtextResponse  extends AbstractResponse {
    @ApidocElement(value = "值", valueDisplayType = ValueDisplayType.RICH_TEXT)
    String value1;
}
