package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString(callSuper = true)
public class GetSysdate2Response extends AbstractResponse{
    @ApidocElement(value = "系统时间", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss")
    String sysdate;
}
