package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services.ViewFormalTableService;
import java.io.Serializable;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Builder
@Data
public class Query3FormalTableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, unique = true, maxLen = 36, placeholder = "演示文本", interfaces = {
            @WebCascadeInterface(serviceClass = ViewFormalTableService.class, value = "view3")
    })
    String serialNo;

    @ApidocElement(value = "单选1", placeholder = "请输入单选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    String select1;

    @ApidocElement(value = "多选1", placeholder = "请输入多选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    List<String> selects1;
}
