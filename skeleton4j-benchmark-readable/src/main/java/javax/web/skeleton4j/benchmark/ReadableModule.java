package javax.web.skeleton4j.benchmark;

import javax.web.skeleton4j.annotation.Skeleton4jModule;
import javax.web.skeleton4j.enums.InterfaceCall;

/**
 * Created by rnkrsoft.com on 2019/3/10.
 */
@Skeleton4jModule(
        name = "ReadableModule",
        desc = "只读组件模块",
        pagePackages = "javax.web.skeleton4j.benchmark.pages.readable",
        call = InterfaceCall.LOCAL
)
public interface ReadableModule {
}
