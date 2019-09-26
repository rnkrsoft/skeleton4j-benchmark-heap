package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString
public class UpdateSysdate2Request implements Serializable{
    @ApidocElement(value = "当前系统时间", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss")
    String currentSysdate;
}
