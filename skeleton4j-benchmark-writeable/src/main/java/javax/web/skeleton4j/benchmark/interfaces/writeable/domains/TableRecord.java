package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/3/15.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, maxLen = 36, placeholder = "演示文本")
    String serialNo;

    @ApidocElement(value = "年龄1", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 2, placeholder = "演示数字")
    Integer age1;

    @ApidocElement(value = "年龄2", valueDisplayType = ValueDisplayType.INTEGER, maxLen = 1, placeholder = "演示一位数字", readonly = true)
    int age2;

    @ApidocElement(value = "金额1", valueDisplayType = ValueDisplayType.DECIMAL, maxLen = 3, placeholder = "演示一个浮点数")
    String amt1;


    @ApidocElement(value = "图片1", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示", defaults = "/images/demo1.jpg")
    String image1;


    @ApidocElement(value = "图片2", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示", readonly = true)
    String image2;

    @ApidocElement(value = "单选1", placeholder = "请输入单选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true, readonly = true)
    String select1;

    @ApidocElement(value = "多选1", placeholder = "请输入多选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    List<String> selects1;

    @ApidocElement(value = "树图单选1", placeholder = "请输入树图1", valueDisplayType = ValueDisplayType.TREE, interfaces = {
            @WebCascadeInterface(serviceClass = CityService.class,
                    value = "fetchProvince",
                    cascadeEvent = WebTriggerEvent.INIT,
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
            )
    },defaults = "028", readonly = true)
    String tree1;

    @ApidocElement(value = "树图多选1", placeholder = "请输入树图多选1", valueDisplayType = ValueDisplayType.TREE, interfaces = {
            @WebCascadeInterface(serviceClass = CityService.class,
                    value = "fetchProvince",
                    cascadeEvent = WebTriggerEvent.INIT,
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
            )
    },defaults = {"023", "0828"})
    List<String> trees1;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", placeholder = "演示日期yyyy/MM/dd", readonly = true)
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", placeholder = "演示日期yyyy/MM/dd HH:mm:ss")
    String date2;
}
