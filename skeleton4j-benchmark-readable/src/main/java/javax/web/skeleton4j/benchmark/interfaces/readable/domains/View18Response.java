package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View18Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "记录1", required = false, valueDisplayType = ValueDisplayType.GROUP)
    GroupRecord record1;

    @ApidocElement(value = "记录2", required = true, valueDisplayType = ValueDisplayType.GROUP)
    GroupRecord record2;
}
