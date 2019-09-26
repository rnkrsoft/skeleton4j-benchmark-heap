package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/31.
 */
@Data
public class GetSelectsResponse extends AbstractResponse {
    @ApidocElement(value = "值", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class)
    final List<String> value1 = new ArrayList<String>();
}
