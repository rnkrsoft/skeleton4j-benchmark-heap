package javax.web.skeleton4j.benchmark;

import javax.web.skeleton4j.annotation.Skeleton4jModule;
import javax.web.skeleton4j.enums.InterfaceCall;

/**
 * Created by rnkrsoft.com on 2019/3/10.
 */
@Skeleton4jModule(
        name = "WriteableModule",
        desc = "可修改值的组件",
        pagePackages = "javax.web.skeleton4j.benchmark.pages.writeable",
        call = InterfaceCall.LOCAL
)
public interface WriteableModule {
}
