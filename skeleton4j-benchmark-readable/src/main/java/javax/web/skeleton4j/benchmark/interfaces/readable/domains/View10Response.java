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
public class View10Response extends AbstractResponse {
    @ApidocElement(value = "流水号", hidden = true, unique = true, interfaces = {
    })
    String serialNo;

    @ApidocElement(value = "电话号码1", valueDisplayType = ValueDisplayType.SEARCH_VIEW,
            interfaces = {
                    @WebCascadeInterface(serviceClass = MobileService.class, value = "fetchMobileNoFuzzy", cascadeEvent = WebTriggerEvent.SEARCH,
                            resultDisplay = @WebResultDisplay(
                                    displayType = WebDisplayType.DATA_SOURCE
                            )
                    ),
                    @WebCascadeInterface(serviceClass = MobileService.class, value = "fetchMobile", cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(
                                    displayType = WebDisplayType.DATA_SOURCE
                            )
                    )
            },
            required = false
    )
    String mobileNo1;

    @ApidocElement(value = "电话号码2", valueDisplayType = ValueDisplayType.SEARCH_VIEW,
            interfaces = {
                    @WebCascadeInterface(serviceClass = MobileService.class, value = "fetchMobileNoFuzzy", cascadeEvent = WebTriggerEvent.SEARCH, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE))
            },
            required = false
    )
    String mobileNo2;

    @ApidocElement(value = "电话号码3", valueDisplayType = ValueDisplayType.SEARCH_VIEW,
            interfaces = {
                    @WebCascadeInterface(serviceClass = MobileService.class, value = "fetchMobileNoFuzzy", cascadeEvent = WebTriggerEvent.SEARCH, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE))
            },
            required = true
    )
    String mobileNo3;

    @ApidocElement(value = "电话号码4", valueDisplayType = ValueDisplayType.SEARCH_VIEW,
            interfaces = {
                    @WebCascadeInterface(serviceClass = MobileService.class, value = "fetchMobileNoFuzzy", cascadeEvent = WebTriggerEvent.SEARCH, resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DATA_SOURCE))
            },
            required = true
    )
    String mobileNo4;
}
