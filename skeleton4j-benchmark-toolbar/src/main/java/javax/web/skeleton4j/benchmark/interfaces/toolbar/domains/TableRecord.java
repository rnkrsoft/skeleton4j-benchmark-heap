package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/15.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;

    @ApidocElement(value = "年龄1", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 2, placeholder = "演示数字")
    Integer age1;

    @ApidocElement(value = "年龄2", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 1, placeholder = "演示一位数字")
    int age2;

    @ApidocElement(value = "金额1", valueDisplayType = ValueDisplayType.DECIMAL, maxLen = 3, placeholder = "演示一个浮点数")
    String amt1;

    @ApidocElement(value = "金额2", valueDisplayType = ValueDisplayType.DECIMAL, maxLen = 3, placeholder = "演示一个浮点数")
    String amt2;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", placeholder = "演示日期yyyy/MM/dd")
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", placeholder = "演示日期yyyy/MM/dd HH:mm:ss")
    String date2;
}
