package javax.web.skeleton4j.benchmark.interfaces.exp.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.exp.domains.QueryRequest;
import javax.web.skeleton4j.benchmark.interfaces.exp.domains.QueryResponse;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@ApidocService("查询服务")
public interface QueryService {
    @ApidocInterface("查询")
    QueryResponse query(QueryRequest request);
}
