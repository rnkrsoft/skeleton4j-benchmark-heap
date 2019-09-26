package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Builder;
import lombok.Data;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Data
@Builder
public class ModalView3FormalTable implements Serializable{

    @ApidocElement(value = "单选1", placeholder = "请输入单选1", maxLen = 20, valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    String select1;

    @ApidocElement(value = "多选1", placeholder = "请输入多选1", maxLen = 21,valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    List<String> selects1 = new ArrayList<String>();
}
