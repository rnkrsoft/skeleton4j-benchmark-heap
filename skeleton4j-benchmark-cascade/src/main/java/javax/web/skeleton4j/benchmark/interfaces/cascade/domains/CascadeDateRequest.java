package javax.web.skeleton4j.benchmark.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class CascadeDateRequest implements Serializable{
    @ApidocElement("类型")
    int type;
    @ApidocElement("性别")
    String sex;
    @ApidocElement(value = "日期", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", interfaces = {
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test1", cascadeEvent = WebTriggerEvent.CHANGE, cascadeColumn = {"type->type", "sex->sex", "date->name"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test2", cascadeEvent = WebTriggerEvent.FOCUS, cascadeColumn = {"type", "sex"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET)),
//            @WebCascadeInterface(serviceClass = TestService.class, value = "test2", cascadeEvent = WebTriggerEvent.BLUR, cascadeColumn = {"type", "sex"}, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
    String date;
}
