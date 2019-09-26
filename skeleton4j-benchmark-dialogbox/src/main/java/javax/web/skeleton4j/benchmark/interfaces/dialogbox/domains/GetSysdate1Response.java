package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString(callSuper = true)
public class GetSysdate1Response extends AbstractResponse{
    @ApidocElement("系统时间")
    String sysdate;
}
