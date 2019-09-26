package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2019/3/31.
 */
@Data
public class GetDateResponse extends AbstractResponse{
    @ApidocElement(value = "值", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss")
    String value1;
}
