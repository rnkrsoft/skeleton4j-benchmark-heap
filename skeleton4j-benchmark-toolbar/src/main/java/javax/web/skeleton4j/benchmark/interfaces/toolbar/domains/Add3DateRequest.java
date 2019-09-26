package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add3DateRequest implements Serializable{
    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", placeholder = "演示无默认值")
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", placeholder = "演示无默认值")
    String date2;

    @ApidocElement(value = "日期3", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", placeholder = "演示无默认值")
    String date3;

}
