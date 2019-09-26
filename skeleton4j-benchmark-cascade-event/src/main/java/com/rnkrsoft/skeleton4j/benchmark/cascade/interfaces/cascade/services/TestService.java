package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Test1Request;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Test1Response;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Test2Request;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Test2Response;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@ApidocService("测试服务")
public interface TestService {
    @ApidocInterface("测试1")
    Test1Response test1(Test1Request request);

    @ApidocInterface("测试2")
    Test2Response test2(Test2Request request);
}
