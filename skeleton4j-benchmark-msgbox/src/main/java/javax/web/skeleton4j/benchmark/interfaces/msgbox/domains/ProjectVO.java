package javax.web.skeleton4j.benchmark.interfaces.msgbox.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.msgbox.services.MessageBoxService;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectVO implements Serializable{
    @ApidocElement(value = "任务编号", unique = true, maxLen = 36, interfaces = {
            @WebCascadeInterface(displayName = "详情",serviceClass = MessageBoxService.class, value = "viewProject")
    })
    String projectId;
}
