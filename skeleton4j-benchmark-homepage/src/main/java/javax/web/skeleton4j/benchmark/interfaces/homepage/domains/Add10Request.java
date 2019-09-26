package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.services.MobileService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add10Request implements Serializable {
    @ApidocElement(value = "电话号码1",
            maxLen = 11,
            valueDisplayType = ValueDisplayType.SEARCH_VIEW,
            interfaces = {
                    @WebCascadeInterface(serviceClass = MobileService.class, value = "fetchMobileNoFuzzy", cascadeEvent = WebTriggerEvent.SEARCH,
                            resultDisplay = @WebResultDisplay(
                                    displayType = WebDisplayType.DATA_SOURCE
                            )
                    ),
                    @WebCascadeInterface(serviceClass = MobileService.class,
                            value = "fetchMobile",
                            params = @WebParam(name = "value1", value = "${mobileNo}"),
                            cascadeEvent = WebTriggerEvent.INIT,
                            resultDisplay = @WebResultDisplay(
                                    displayType = WebDisplayType.DATA_SOURCE
                            )
                    )
            },
            placeholder = "演示模糊查询"
    )
    String mobileNo;
}
