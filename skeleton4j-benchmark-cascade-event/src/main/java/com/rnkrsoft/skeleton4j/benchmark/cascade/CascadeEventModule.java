package com.rnkrsoft.skeleton4j.benchmark.cascade;

import javax.web.skeleton4j.annotation.Skeleton4jModule;
import javax.web.skeleton4j.enums.InterfaceCall;

/**
 * Created by rnkrsoft.com on 2019/3/10.
 */
@Skeleton4jModule(
        name = "benchmarkModule",
        desc = "级联测试模块",
        pagePackages = "com.rnkrsoft.skeleton4j.demo.cascade.pages",
        call = InterfaceCall.LOCAL
)
public interface CascadeEventModule {
}
