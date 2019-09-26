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
public class Record1 implements Serializable{
    @ApidocElement("文本1")
    String text1;

    @ApidocElement("文本2")
    String text2;

    @ApidocElement("整数1")
    int int1;

    @ApidocElement("整数2")
    Integer int2;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE)
    String date1;
}
