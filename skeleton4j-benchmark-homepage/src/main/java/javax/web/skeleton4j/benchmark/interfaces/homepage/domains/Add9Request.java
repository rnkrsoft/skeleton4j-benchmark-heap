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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add9Request implements Serializable {

    @ApidocElement(value = "城市1", valueDisplayType = ValueDisplayType.TREE,
            extras = "selectParent:true",
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            placeholder = "演示一个可重复选择，可以选择父节点和子节点的多选树图",
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
            placeholder = "演示城市2",
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
            placeholder = "演示城市3",
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
            placeholder = "演示城市4",
            defaults = {"028", "0831", "0828"}
    )
    final List<String> city4  = new ArrayList<String>();

    @ApidocElement(value = "城市5", valueDisplayType = ValueDisplayType.TREE,
            extras = "selectParent:true",
            interfaces = {
                    @WebCascadeInterface(serviceClass = CityService.class,
                            value = "fetchProvince",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },
            placeholder = "演示一个不可重复选择，可以选择父节点和子节点的多选树图",
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
            placeholder = "演示城市6",
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
            placeholder = "演示城市7",
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
            placeholder = "演示城市8",
            defaults = {"028", "0831", "0828"}
    )
    final Set<String> city8 = new HashSet<String>();
}
