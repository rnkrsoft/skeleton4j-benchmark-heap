package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Builder
@Data
public class View1FormalTable implements Serializable{
    @ApidocElement(value = "年龄1", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 5, placeholder = "演示数字")
    Integer age1;

    @ApidocElement(value = "年龄2", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 5, placeholder = "演示一位数字")
    int age2;

    @ApidocElement(value = "金额1", valueDisplayType = ValueDisplayType.DECIMAL, maxLen = 8, placeholder = "演示一个浮点数")
    String amt1;
}
