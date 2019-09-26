package javax.web.skeleton4j.benchmark.interfaces.formTableModal.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@ApidocService("表单化表格服务")
public interface ModalFormalTableService {
    @ApidocInterface("新增1")
    ModalFormalTableResponse add1(Modal1FormalTableRequest request);

    @ApidocInterface("新增2")
    ModalFormalTableResponse add2(Modal2FormalTableRequest request);

    @ApidocInterface("新增3")
    ModalFormalTableResponse add3(Modal3FormalTableRequest request);

    @ApidocInterface("新增4")
    ModalFormalTableResponse add4(Modal4FormalTableRequest request);

    @ApidocInterface("新增5")
    ModalFormalTableResponse add5(Modal5FormalTableRequest request);

    @ApidocInterface("新增6")
    ModalFormalTableResponse add6(Modal6FormalTableRequest request);

    @ApidocInterface("新增7")
    ModalFormalTableResponse add7(Modal7FormalTableRequest request);

    @ApidocInterface("查询1")
    ModalQuery1FormalTableResponse query1(QueryFormalTableRequest request);

    @ApidocInterface("查询2")
    ModalQuery2FormalTableResponse query2(QueryFormalTableRequest request);

    @ApidocInterface("查询3")
    ModalQuery3FormalTableResponse query3(QueryFormalTableRequest request);

    @ApidocInterface("查询4")
    ModalQuery4FormalTableResponse query4(QueryFormalTableRequest request);

    @ApidocInterface("查询5")
    ModalQuery5FormalTableResponse query5(QueryFormalTableRequest request);

    @ApidocInterface("查询6")
    ModalQuery6FormalTableResponse query6(QueryFormalTableRequest request);
}
