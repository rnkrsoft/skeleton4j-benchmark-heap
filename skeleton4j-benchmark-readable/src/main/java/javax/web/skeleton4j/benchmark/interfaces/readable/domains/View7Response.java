package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View7Response extends AbstractResponse {
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;



    @ApidocElement(value = "多选1", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "多选2", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "多选3", valueDisplayType = ValueDisplayType.SELECTION,
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


    @ApidocElement(value = "多选4", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "多选5", valueDisplayType = ValueDisplayType.SELECTION,
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

    @ApidocElement(value = "多选6", valueDisplayType = ValueDisplayType.SELECTION,
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
