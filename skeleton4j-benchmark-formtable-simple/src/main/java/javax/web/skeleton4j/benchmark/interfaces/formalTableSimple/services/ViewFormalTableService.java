package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@ApidocService("查看表格服务")
public interface ViewFormalTableService {
    @ApidocInterface("查看详情1")
    View1FormalTableResponse view1(ViewFormalTableRequest request);

    @ApidocInterface("查看详情2")
    View2FormalTableResponse view2(ViewFormalTableRequest request);

    @ApidocInterface("查看详情3")
    View3FormalTableResponse view3(ViewFormalTableRequest request);

    @ApidocInterface("查看详情4")
    View4FormalTableResponse view4(ViewFormalTableRequest request);

    @ApidocInterface("查看详情5")
    View5FormalTableResponse view5(ViewFormalTableRequest request);

    @ApidocInterface("查看详情6")
    View6FormalTableResponse view6(ViewFormalTableRequest request);

}
