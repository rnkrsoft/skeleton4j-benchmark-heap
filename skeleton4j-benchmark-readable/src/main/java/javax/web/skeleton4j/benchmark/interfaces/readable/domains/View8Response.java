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

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View8Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "城市1", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            placeholder = "演示城市为空"
    )
    String city1;

    @ApidocElement(value = "城市2", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            placeholder = "演示城市选中四川1",
            defaults = "0831"
    )
    String city2;

    @ApidocElement(value = "城市3", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            placeholder = "演示城市选中成都1",
            defaults = "028"
    )
    String city3;

    @ApidocElement(value = "城市4", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            placeholder = "演示城市为空"
    )
    String city4;

    @ApidocElement(value = "城市5", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            placeholder = "演示城市选中四川1",
            defaults = "0800"
    )
    String city5;

    @ApidocElement(value = "城市6", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            placeholder = "演示城市选中成都1",
            defaults = "028"
    )
    String city6;
}
