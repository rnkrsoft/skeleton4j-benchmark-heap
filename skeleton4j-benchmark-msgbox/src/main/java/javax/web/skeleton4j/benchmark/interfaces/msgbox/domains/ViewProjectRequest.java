package javax.web.skeleton4j.benchmark.interfaces.msgbox.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@Data
public class ViewProjectRequest implements Serializable{
    @ApidocElement(value = "项目编号", unique = true)
    String projectId;
}
