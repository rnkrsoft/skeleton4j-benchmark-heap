package javax.web.skeleton4j.benchmark.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class Test2Request implements Serializable{
    @ApidocElement("类型")
    String type;
    @ApidocElement("性别")
    String sex;
}
