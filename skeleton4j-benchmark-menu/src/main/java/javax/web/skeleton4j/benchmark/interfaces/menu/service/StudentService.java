package javax.web.skeleton4j.benchmark.interfaces.menu.service;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.menu.domains.*;

/**
 * Created by rnkrsoft.com on 2018/12/29.
 */
@ApidocService("学生服务")
public interface StudentService {
    @ApidocInterface("查询1")
    Query1Response query1(QueryRequest request);
    @ApidocInterface("查询2")
    Query2Response query2(QueryRequest request);
    @ApidocInterface("查询3")
    Query3Response query3(QueryRequest request);
    @ApidocInterface("查询4")
    Query4Response query4(QueryRequest request);
    @ApidocInterface("查询5")
    Query5Response query5(QueryRequest request);
    @ApidocInterface("查询6")
    Query6Response query6(QueryRequest request);
}
