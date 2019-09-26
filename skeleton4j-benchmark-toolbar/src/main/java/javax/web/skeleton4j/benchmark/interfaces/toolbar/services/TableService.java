package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add18TableRequest;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add18TableResponse;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@ApidocService("表格服务")
public interface TableService {
    @ApidocInterface("增加18表格框")
    Add18TableResponse add18Table(Add18TableRequest request);
}
