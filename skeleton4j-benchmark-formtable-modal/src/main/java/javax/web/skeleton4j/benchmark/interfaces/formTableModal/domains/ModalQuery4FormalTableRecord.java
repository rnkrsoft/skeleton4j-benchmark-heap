package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.services.ModalViewFormalTableService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Builder
@Data
public class ModalQuery4FormalTableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, unique = true,maxLen = 36, placeholder = "演示文本", interfaces = {
            @WebCascadeInterface(serviceClass = ModalViewFormalTableService.class, value = "view4")
    })
    String serialNo;

    @ApidocElement(value = "年龄1", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 2, placeholder = "演示数字")
    Integer age1;

    @ApidocElement(value = "年龄2", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 1, placeholder = "演示一位数字")
    int age2;

    @ApidocElement(value = "金额1", valueDisplayType = ValueDisplayType.DECIMAL, maxLen = 3, placeholder = "演示一个浮点数")
    String amt1;
}
