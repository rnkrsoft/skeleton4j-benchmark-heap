package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/1/1.
 */
@Data
@Builder
public class Add16Textarea2Request implements Serializable{
    @ApidocElement(value = "内容1", valueDisplayType = ValueDisplayType.TEXTAREA, required = false)
    String text1;

    @ApidocElement(value = "内容2", valueDisplayType = ValueDisplayType.TEXTAREA, required = false)
    String text2;
}
