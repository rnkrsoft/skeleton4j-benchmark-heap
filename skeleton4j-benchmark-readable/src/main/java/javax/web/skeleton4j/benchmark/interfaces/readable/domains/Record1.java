package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.interfaces.readable.services.ViewService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@Data
@ToString
public class Record1 implements Serializable {
    @ApidocElement(value = "序列号", unique = true, maxLen = 36,
            interfaces = {
                    @WebCascadeInterface(serviceClass = ViewService.class,
                            value = "view1",
                            displayName = "查看",
                            cascadeEvent = WebTriggerEvent.CLICK,
                            resultDisplay = @WebResultDisplay(
                                    displayType = WebDisplayType.TARGET
                            )
                    )
            }
    )
    String serialNo;

    @ApidocElement(value = "年龄1", maxLen = 20)
    int age1;
    @ApidocElement(value = "年龄2", maxLen = 20)
    Integer age2;

    @ApidocElement(value = "省", enumClass = ProvinceEnum.class, maxLen = 20)
    String province;

    @ApidocElement(value = "市", enumClass = CityEnum.class, maxLen = 20)
    String city;

    @ApidocElement(value = "省2", enumClass = ProvinceEnum.class, maxLen = 20)
    String province2;
}
