package javax.web.skeleton4j.benchmark.interfaces.menu.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/12/29.
 */
@Data
public class ViewStudent1Request implements Serializable{
    @ApidocElement(value = "流水号", maxLen = 36, unique = true)
    int serialNo;
}
