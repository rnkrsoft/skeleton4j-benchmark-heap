package javax.web.skeleton4j.benchmark.interfaces.msgbox.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@Data
public class GetTxDateRequest implements Serializable{
    @ApidocElement(value = "任务ID", unique = true)
    String taskId;
}
