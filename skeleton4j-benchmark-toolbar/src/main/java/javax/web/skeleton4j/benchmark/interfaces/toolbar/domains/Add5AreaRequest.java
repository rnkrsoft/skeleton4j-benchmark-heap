package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.services.AreaTypeService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebLayout;
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
public class Add5AreaRequest implements Serializable {
    @ApidocElement(value = "区域类型1", valueDisplayType = ValueDisplayType.SELECTION, layout = WebLayout.LINEAR,
            interfaces = {
                    @WebCascadeInterface(
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            }
    )
    List<String> type1 = new ArrayList<String>();

    @ApidocElement(value = "区域类型2", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },defaults = {"001","002"}
    )
    List<String> type2 = new ArrayList<String>();

    @ApidocElement(value = "区域类型3", valueDisplayType = ValueDisplayType.SELECTION, layout = WebLayout.LINEAR,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },defaults = {"001","002","003"}
    )
    List<String> type3 = new ArrayList<String>();
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
    Set<String> type4 = new HashSet<String>();

    @ApidocElement(value = "区域类型5", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },defaults = {"001","002"}
    )
    Set<String> type5 = new HashSet<String>();

    @ApidocElement(value = "区域类型6", valueDisplayType = ValueDisplayType.SELECTION,
            interfaces = {
                    @WebCascadeInterface(
                            cascadeEvent = WebTriggerEvent.INIT,
                            serviceClass = AreaTypeService.class,
                            value = "fetchAreaType",
                            resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
                    )
            },defaults = {"001","002","003"}
    )
    Set<String> type6 = new HashSet<String>();
}
