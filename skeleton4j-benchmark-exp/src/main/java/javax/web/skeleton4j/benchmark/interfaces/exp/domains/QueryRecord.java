package javax.web.skeleton4j.benchmark.interfaces.exp.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@Data
@Builder
public class QueryRecord implements Serializable{
    @ApidocElement(value = "流水号", unique = true, hidden = true)
    String id;

    @ApidocElement(value = "文本1",maxLen = 20)
    String text1;

    @ApidocElement(value = "文本2",maxLen = 30)
    String text2;

    @ApidocElement(value = "整数1", maxLen = 15)
    int int1;

    @ApidocElement(value = "整数2", maxLen = 5)
    Integer int2;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, maxLen = 20)
    String date1;
}
