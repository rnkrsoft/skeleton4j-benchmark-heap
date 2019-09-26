package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Data
@Builder
public class View4FormalTable implements Serializable{
    @ApidocElement(value = "树图单选1", placeholder = "请输入树图1", valueDisplayType = ValueDisplayType.TREE, interfaces = {
            @WebCascadeInterface(serviceClass = CityService.class,
                    value = "fetchProvince",
                    cascadeEvent = WebTriggerEvent.INIT,
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
            )
    }, maxLen = 20, defaults = "028")
    String tree1;

    @ApidocElement(value = "树图多选1", placeholder = "请输入树图多选1", valueDisplayType = ValueDisplayType.TREE, interfaces = {
            @WebCascadeInterface(serviceClass = CityService.class,
                    value = "fetchProvince",
                    cascadeEvent = WebTriggerEvent.INIT,
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE)
            )
    },maxLen = 25, defaults = "023")
    List<String> trees1 = new ArrayList<String>();
}
