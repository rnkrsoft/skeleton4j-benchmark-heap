package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.services.CityService;
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
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
public class Add12AreaRequest implements Serializable {
    @ApidocElement(value = "区域类型1", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = CityService.class,
                            value = "fetchProvince",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> types1 = new ArrayList<String>();
    @ApidocElement(value = "区域类型2", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = CityService.class,
                            value = "fetchProvince",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> types2 = new ArrayList<String>();
    @ApidocElement(value = "区域类型3", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = CityService.class,
                            value = "fetchProvince",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> types3 = new ArrayList<String>();

    @ApidocElement(value = "区域类型4", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = CityService.class,
                            value = "fetchProvince",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    Set<String> types4 = new HashSet<String>();
    @ApidocElement(value = "区域类型5", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = CityService.class,
                            value = "fetchProvince",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    Set<String> types5 = new HashSet<String>();
    @ApidocElement(value = "区域类型6", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = CityService.class,
                            value = "fetchProvince",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    Set<String> types6 = new HashSet<String>();
}
