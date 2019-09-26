package javax.web.skeleton4j.benchmark.interfaces.cascade.services;

import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.QueryRequest;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.QueryResponse;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;

/**
 * Created by rnkrsoft.com on 2019/7/26.
 */
@ApidocService("查询服务")
public interface QueryService {
    @ApidocInterface("查询服务")
    QueryResponse query(QueryRequest request);
}
