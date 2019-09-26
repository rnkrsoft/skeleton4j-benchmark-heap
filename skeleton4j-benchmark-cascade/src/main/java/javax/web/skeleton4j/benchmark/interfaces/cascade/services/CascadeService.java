package javax.web.skeleton4j.benchmark.interfaces.cascade.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@ApidocService("级联服务")
public interface CascadeService {
    @ApidocInterface("级联字符串")
    CascadeResponse cascadeText(CascadeTextRequest request);
    @ApidocInterface("级联整数值")
    CascadeResponse cascadeInteger(CascadeIntegerRequest request);
    @ApidocInterface("级联十进制数")
    CascadeResponse cascadeDecimal(CascadeDecimalRequest request);
    @ApidocInterface("级联日期框")
    CascadeResponse cascadeDate(CascadeDateRequest request);

    @ApidocInterface("查看")
    ViewResponse view(ViewRequest request);
}
