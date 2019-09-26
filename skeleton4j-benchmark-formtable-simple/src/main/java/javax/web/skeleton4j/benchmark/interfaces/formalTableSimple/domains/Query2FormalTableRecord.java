package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services.ViewFormalTableService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Builder
@Data
public class Query2FormalTableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT,unique = true,maxLen = 36, placeholder = "演示文本", interfaces = {
            @WebCascadeInterface(serviceClass = ViewFormalTableService.class, value = "view2")
    })
    String serialNo;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", placeholder = "演示日期yyyy/MM/dd")
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", placeholder = "演示日期yyyy/MM/dd HH:mm:ss")
    String date2;
}
