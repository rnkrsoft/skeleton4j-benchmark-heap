package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@ApidocService("表单化表格服务")
public interface FormalTableService {
    @ApidocInterface("新增1")
    AddFormalTableResponse add1(Add1FormalTableRequest request);

    @ApidocInterface("新增2")
    AddFormalTableResponse add2(Add2FormalTableRequest request);

    @ApidocInterface("新增3")
    AddFormalTableResponse add3(Add3FormalTableRequest request);

    @ApidocInterface("新增4")
    AddFormalTableResponse add4(Add4FormalTableRequest request);

    @ApidocInterface("新增5")
    AddFormalTableResponse add5(Add5FormalTableRequest request);

    @ApidocInterface("新增6")
    AddFormalTableResponse add6(Add6FormalTableRequest request);

    @ApidocInterface("新增13")
    AddFormalTableResponse add13(Add13FormalTableRequest request);

    @ApidocInterface("查询1")
    Query1FormalTableResponse query1(QueryFormalTableRequest request);

    @ApidocInterface("查询2")
    Query2FormalTableResponse query2(QueryFormalTableRequest request);

    @ApidocInterface("查询3")
    Query3FormalTableResponse query3(QueryFormalTableRequest request);

    @ApidocInterface("查询4")
    Query4FormalTableResponse query4(QueryFormalTableRequest request);

    @ApidocInterface("查询5")
    Query5FormalTableResponse query5(QueryFormalTableRequest request);

    @ApidocInterface("查询6")
    Query6FormalTableResponse query6(QueryFormalTableRequest request);
}
