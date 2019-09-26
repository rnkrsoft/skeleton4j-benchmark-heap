package javax.web.skeleton4j.benchmark.download.interfaces.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
@Data
public class Download1Request implements Serializable{
    @ApidocElement(value = "流水号", unique = true)
    String serialNo;
}
