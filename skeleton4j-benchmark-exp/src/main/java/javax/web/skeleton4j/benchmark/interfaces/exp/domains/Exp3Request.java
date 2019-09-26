package javax.web.skeleton4j.benchmark.interfaces.exp.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.PatternType;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.io.Serializable;

@Data
public class Exp3Request implements Serializable {
    @ApidocElement(value = "姓名", placeholder = "请输入在文本框输入姓名", required = false)
    String name;

    @ApidocElement(value = "文件路径", placeholder = "请输入在文本框输入文件路径", required = false)
    String filePath;

    @ApidocElement(value = "数据类型", placeholder = "请输入在文本框输入数据类型", required = false, enumClass = ExportType.class, valueDisplayType = ValueDisplayType.SELECTION, defaults = "000")
    String type;

    @ApidocElement(value = "省", placeholder = "请输入在文本框输入省", required = false, valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    String provence;

    @ApidocElement(value = "日期类型1", placeholder = "请输入日期1", required = false,valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd")
    String date1;

    @ApidocElement(value = "日期类型2", placeholder = "请输入日期2", required = false, valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss")
    String date2;

    @ApidocElement(value = "日期类型3", placeholder = "请输入日期3", required = false, valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss")
    String date3;
}
