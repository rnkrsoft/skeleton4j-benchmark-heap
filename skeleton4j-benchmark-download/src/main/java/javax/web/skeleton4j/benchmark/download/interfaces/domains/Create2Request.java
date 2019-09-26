package javax.web.skeleton4j.benchmark.download.interfaces.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.download.interfaces.services.DownloadService;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebCallType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebTriggerEvent;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
@Data
public class Create2Request implements Serializable{
    @ApidocElement(value = "文件路径", valueDisplayType = ValueDisplayType.TEXT, interfaces = {
            @WebCascadeInterface(
                    serviceClass = DownloadService.class,
                    value = "download1",
                    cascadeEvent = WebTriggerEvent.FOCUS,
                    callType = WebCallType.DOWNLOAD,
                    params = {
                      @WebParam(name = "name", value = "${fileName}")
                    },
                    resultDisplay = @WebResultDisplay(displayType = WebDisplayType.DEFAULT)
            )
    })
    String fileName;
}
