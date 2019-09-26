package javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString
public class UpdateSysdate1Request implements Serializable{
    @ApidocElement("当前系统时间")
    String currentSysdate;
}
