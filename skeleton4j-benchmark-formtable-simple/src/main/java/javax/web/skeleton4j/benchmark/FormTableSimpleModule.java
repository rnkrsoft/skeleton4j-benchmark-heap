package javax.web.skeleton4j.benchmark;

import javax.web.skeleton4j.annotation.Skeleton4jModule;
import javax.web.skeleton4j.enums.InterfaceCall;

/**
 * Created by rnkrsoft.com on 2019/3/10.
 */
@Skeleton4jModule(
        name = "FormTableSimpleModule",
        desc = "表单化表格简单实现模块",
        pagePackages = "javax.web.skeleton4j.benchmark.pages",
        call = InterfaceCall.LOCAL
)
public interface FormTableSimpleModule {
}
