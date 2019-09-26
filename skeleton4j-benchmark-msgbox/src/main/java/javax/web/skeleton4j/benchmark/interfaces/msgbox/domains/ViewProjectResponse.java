package javax.web.skeleton4j.benchmark.interfaces.msgbox.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.msgbox.services.MessageBoxService;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@Data
public class ViewProjectResponse extends AbstractResponse{
    @ApidocElement(value = "项目编号", unique = true, interfaces = {
            @WebCascadeInterface(serviceClass = MessageBoxService.class, value = "enabledProject"),
            @WebCascadeInterface(serviceClass = MessageBoxService.class, value = "disabledProject")
    })
    String projectId;
    @ApidocElement(value = "项目名称", valueDisplayType = ValueDisplayType.TEXT)
    String name;
    @ApidocElement(value = "起始日期", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd")
    String beginDate;
    @ApidocElement(value = "结束日期", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd")
    String endDate;
}
