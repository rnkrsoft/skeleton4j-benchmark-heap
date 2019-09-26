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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View9Response extends AbstractResponse{
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
            required = false
    )
    final List<String> city1 = new ArrayList<String>();

    @ApidocElement(value = "城市2", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            defaults = "0800"
    )
    final List<String> city2 = new ArrayList<String>();

    @ApidocElement(value = "城市3", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = false,
            defaults = {"0800", "028"}
    )
    final List<String> city3  = new ArrayList<String>();

    @ApidocElement(value = "城市4", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = {"028", "0831", "0828"}
    )
    final List<String> city4  = new ArrayList<String>();

    @ApidocElement(value = "城市5", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true
    )
    final Set<String> city5 = new HashSet<String>();

    @ApidocElement(value = "城市6", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = "028"
    )
    final Set<String> city6 = new HashSet<String>();

    @ApidocElement(value = "城市7", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = {"0800", "028"}
    )
    final Set<String> city7 = new HashSet<String>();

    @ApidocElement(value = "城市8", valueDisplayType = ValueDisplayType.TREE,
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            required = true,
            defaults = {"028", "0831", "0828"}
    )
    final Set<String> city8 = new HashSet<String>();
}
