package javax.web.skeleton4j.benchmark;

import javax.web.skeleton4j.annotation.Skeleton4jModule;
import javax.web.skeleton4j.enums.InterfaceCall;

/**
 * Created by rnkrsoft.com on 2019/3/10.
 */
@Skeleton4jModule(
        name = "FormTableModalModule",
        desc = "表单化表格-模态框实现",
        pagePackages = "javax.web.skeleton4j.benchmark.pages.formTableModal",
        call = InterfaceCall.LOCAL
)
public interface FormTableModalModule {
}
