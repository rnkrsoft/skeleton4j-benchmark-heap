package javax.web.skeleton4j.benchmark.interfaces.group.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@Data
public class Add1GroupRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;

    @ApidocElement(value = "年龄1", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 2, placeholder = "演示数字")
    Integer age1;

    @ApidocElement(value = "年龄2", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 1, placeholder = "演示一位数字")
    int age2;

    @ApidocElement(value = "金额1", valueDisplayType = ValueDisplayType.DECIMAL, maxLen = 3, placeholder = "演示一个浮点数")
    String amt1;
}
