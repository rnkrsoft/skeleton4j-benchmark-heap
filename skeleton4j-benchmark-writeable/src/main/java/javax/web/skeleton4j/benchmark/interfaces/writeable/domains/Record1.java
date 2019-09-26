package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.interfaces.writeable.services.ToUpdateService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@Data
public class Record1 implements Serializable{
    @ApidocElement(value = "序列号", unique = true, maxLen = 36,
            interfaces = {
                    @WebCascadeInterface(serviceClass = ToUpdateService.class,
                            value = "toUpdate1",
                            displayName = "修改",
                            cascadeEvent = WebTriggerEvent.CLICK,
                            resultDisplay = @WebResultDisplay(
                                    displayType = WebDisplayType.TARGET
                            )
                    )
            }
    )
    String serialNo;
}
