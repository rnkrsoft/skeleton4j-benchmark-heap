package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@Data
public class GetIntegerResponse extends AbstractResponse{
    @ApidocElement(value = "值", valueDisplayType = ValueDisplayType.INTEGER)
    Integer value1;
}
