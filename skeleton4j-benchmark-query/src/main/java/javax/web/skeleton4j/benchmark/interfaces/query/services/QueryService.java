package javax.web.skeleton4j.benchmark.interfaces.query.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.query.domains.Query1Request;
import javax.web.skeleton4j.benchmark.interfaces.query.domains.Query1Response;

/**
 * Created by rnkrsoft.com on 2019/3/24.
 */
@ApidocService("查询服务")
public interface QueryService {
    @ApidocInterface("查询1")
    Query1Response query1(Query1Request request);
}
