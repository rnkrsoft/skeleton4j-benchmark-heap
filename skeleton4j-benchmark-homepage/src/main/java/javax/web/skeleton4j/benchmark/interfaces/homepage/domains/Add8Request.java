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

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add8Request implements Serializable {
    @ApidocElement(value = "城市1", valueDisplayType = ValueDisplayType.TREE,
            extras = "selectParent:true",
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            placeholder = "演示可以进行选择父节点的情况"
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
