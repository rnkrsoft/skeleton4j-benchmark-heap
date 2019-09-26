package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.services.CityService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add7Request implements Serializable {
    @ApidocElement(value = "多选1", placeholder = "请输入多选1", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false
    )
    final List<String> select1 = new ArrayList<String>();

    @ApidocElement(value = "多选2", placeholder = "请输入多选2", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            defaults = "023"
    )
    final List<String> select2 = new ArrayList<String>();

    @ApidocElement(value = "多选3", placeholder = "请输入多选3", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            defaults = {"023", "010"}
    )
    final List<String> select3 = new ArrayList<String>();


    @ApidocElement(value = "多选4", placeholder = "请输入多选4", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true
    )
    final List<String> select4 = new ArrayList<String>();

    @ApidocElement(value = "多选5", placeholder = "请输入多选5", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = "023"
    )
    final List<String> select5 = new ArrayList<String>();

    @ApidocElement(value = "多选6", placeholder = "请输入多选6", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchCity",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = {"023", "010"}
    )
    final List<String> select6 = new ArrayList<String>();
}
