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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2019/3/15.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupRecord implements Serializable{

    @ApidocElement(value = "文本信息1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT)
    String text1;

    @ApidocElement(value = "文本信息2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT)
    String text2;

    @ApidocElement(value = "文本信息1", maxLen = 36, required = false, valueDisplayType = ValueDisplayType.TEXT, defaults = "123")
    String text3;

    @ApidocElement(value = "文本信息2", maxLen = 36, required = true, valueDisplayType = ValueDisplayType.TEXT, defaults = "456")
    String text4;

    @ApidocElement(value = "余额", maxLen = 2, valueDisplayType = ValueDisplayType.DECIMAL, required = false, patternType = PatternType.FORMAT, pattern = "999999.99")
    String amt;

    @ApidocElement(value = "年龄1", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = false)
    int age1;

    @ApidocElement(value = "年龄2", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "2", required = false)
    int age2;

    @ApidocElement(value = "年龄3", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = false)
    Integer age3;

    @ApidocElement(value = "年龄4", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "4", required = false)
    Integer age4;

    @ApidocElement(value = "年龄5", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, required = true)
    Integer age5;

    @ApidocElement(value = "年龄6", maxLen = 2, valueDisplayType = ValueDisplayType.INTEGER, defaults = "4", required = true)
    Integer age6;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd")
    String date1;

    @ApidocElement(value = "日期2", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss")
    String date2;

    @ApidocElement(value = "日期3", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss")
    String date3;

    @ApidocElement(value = "日期4", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd", defaults = "2018/01/02")
    String date4;

    @ApidocElement(value = "日期5", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "HH:mm:ss", defaults = "10:10:10")
    String date5;

    @ApidocElement(value = "日期6", valueDisplayType = ValueDisplayType.DATE, patternType = PatternType.FORMAT, pattern = "yyyy/MM/dd HH:mm:ss", defaults = "2018/01/03 01:02:03")
    String date6;

    @ApidocElement(value = "市1", enumClass = CityEnum.class)
    String city1;

    @ApidocElement(value = "市2", enumClass = CityEnum.class, defaults = "023")
    String city2;

    @ApidocElement(value = "市3", enumClass = CityEnum.class, defaults = "028")
    String city3;

    @ApidocElement(value = "区域类型1", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    String type1;
    @ApidocElement(value = "区域类型2", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            defaults = "028"
    )
    String type2;
    @ApidocElement(value = "区域类型3", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            defaults = "0828"
    )
    String type3;

    @ApidocElement(value = "图片1", valueDisplayType = ValueDisplayType.IMAGE)
    String image1;

    @ApidocElement(value = "图片2", valueDisplayType = ValueDisplayType.IMAGE, defaults = "/image/icon2.png")
    String image2;

    @ApidocElement(value = "区域类型1", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> types1 = new ArrayList<String>();

    @ApidocElement(value = "区域类型2", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> types2 = new ArrayList<String>();

    @ApidocElement(value = "区域类型3", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> types3 = new ArrayList<String>();
    @ApidocElement(value = "区域类型4", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    Set<String> types4 = new HashSet<String>();

    @ApidocElement(value = "区域类型5", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    Set<String> types5 = new HashSet<String>();

    @ApidocElement(value = "区域类型6", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    Set<String> types6 = new HashSet<String>();


    @ApidocElement(value = "Richtext1", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false)
    String richtext1;

    @ApidocElement(value = "Richtext2", valueDisplayType = ValueDisplayType.RICH_TEXT, required = false, defaults = "<p>123</p>")
    String richtext2;

    @ApidocElement(value = "Richtext3", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true)
    String richtext3;

    @ApidocElement(value = "Richtext4", valueDisplayType = ValueDisplayType.RICH_TEXT, required = true, defaults = "<p>123</p>")
    String richtext4;


    @ApidocElement(value = "Textarea1", valueDisplayType = ValueDisplayType.TEXTAREA, required = false)
    String textarea1;

    @ApidocElement(value = "Textarea2", valueDisplayType = ValueDisplayType.TEXTAREA, required = false, defaults = "123\n456")
    String textarea2;

    @ApidocElement(value = "Textarea3", valueDisplayType = ValueDisplayType.TEXTAREA, required = true)
    String textarea3;

    @ApidocElement(value = "Textarea4", valueDisplayType = ValueDisplayType.TEXTAREA, required = true, defaults = "456\n789")
    String textarea4;
}
