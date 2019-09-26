package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@Data
public class Add1DateResponse extends AbstractResponse{
    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", readonly = true)
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", readonly = true)
    String date2;

    @ApidocElement(value = "日期3", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", readonly = true)
    String date3;

}
