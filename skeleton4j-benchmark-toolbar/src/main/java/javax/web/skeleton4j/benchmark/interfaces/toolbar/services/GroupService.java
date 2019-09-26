package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add17GroupRequest;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add17GroupResponse;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@ApidocService("组合框服务")
public interface GroupService {
    @ApidocInterface("增加17组合框")
    Add17GroupResponse add17Group(Add17GroupRequest request);
}
