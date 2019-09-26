package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Data
@Builder
public class ModalView2FormalTable implements Serializable{

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, maxLen = 20, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", placeholder = "演示日期yyyy/MM/dd")
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, maxLen = 25, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", placeholder = "演示日期yyyy/MM/dd HH:mm:ss")
    String date2;
}
