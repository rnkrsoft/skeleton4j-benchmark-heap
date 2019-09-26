package javax.web.skeleton4j.benchmark.common.interfaces.domains;

import lombok.Data;

import javax.web.doc.AbstractRequestPage;
import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
public class FetchMobileNoFuzzyRequest extends AbstractRequestPage{
    @ApidocElement("电话号码模糊条件")
    String value1;
}
