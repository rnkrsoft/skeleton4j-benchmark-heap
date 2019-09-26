package javax.web.skeleton4j.benchmark.interfaces.event.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.event.domains.EventTestNameRequest;
import javax.web.skeleton4j.benchmark.interfaces.event.domains.EventTestNameResponse;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@ApidocService("事件测试服务")
public interface EventTestService {
    @ApidocInterface("事件测试姓名")
    EventTestNameResponse eventTestName(EventTestNameRequest request);
}
