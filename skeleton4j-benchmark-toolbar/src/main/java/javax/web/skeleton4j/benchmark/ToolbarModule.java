package javax.web.skeleton4j.benchmark;

import javax.web.skeleton4j.annotation.Skeleton4jModule;
import javax.web.skeleton4j.enums.InterfaceCall;

/**
 * Created by rnkrsoft.com on 2019/3/10.
 */
@Skeleton4jModule(
        name = "ToolbarModule",
        desc = "工具栏按钮模块",
        pagePackages = "javax.web.skeleton4j.benchmark.pages.toolbar",
        call = InterfaceCall.LOCAL
)
public interface ToolbarModule {
}
