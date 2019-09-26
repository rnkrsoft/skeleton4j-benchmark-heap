package javax.web.skeleton4j.benchmark.interfaces.event.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.event.services.EventTestService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@Data
public class EventComplexRequest implements Serializable {
    @ApidocElement(value = "字符串", valueDisplayType = ValueDisplayType.TEXT, interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    String string;

    @ApidocElement(value = "整数", valueDisplayType = ValueDisplayType.INTEGER, interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    Integer integer;

    @ApidocElement(value = "十进制数", valueDisplayType = ValueDisplayType.DECIMAL, interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    String decimal;

    @ApidocElement(value = "日期", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd",interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    String date;

    @ApidocElement(value = "多行文本", valueDisplayType = ValueDisplayType.TEXTAREA, interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    String textarea;

    @ApidocElement(value = "图片", valueDisplayType = ValueDisplayType.IMAGE, defaults = "/images/demo1.jpg",interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    String image;

    @ApidocElement(value = "文件", valueDisplayType = ValueDisplayType.FILE, defaults = "/images/demo1.jpg", interfaces = {
            @WebCascadeInterface(serviceClass = EventTestService.class, value = "eventTestName", cascadeEvent = WebTriggerEvent.MOUSE_MOVE),
    })
    String file;
}
