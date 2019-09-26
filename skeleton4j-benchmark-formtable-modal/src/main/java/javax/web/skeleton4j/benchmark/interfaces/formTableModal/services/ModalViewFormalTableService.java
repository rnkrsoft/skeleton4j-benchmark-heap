package javax.web.skeleton4j.benchmark.interfaces.formTableModal.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@ApidocService("查看表格服务")
public interface ModalViewFormalTableService {
    @ApidocInterface("模态查看详情1")
    ModalView1FormalTableResponse view1(ModalViewFormalTableRequest request);

    @ApidocInterface("模态查看详情2")
    ModalView2FormalTableResponse view2(ModalViewFormalTableRequest request);

    @ApidocInterface("模态查看详情3")
    ModalView3FormalTableResponse view3(ModalViewFormalTableRequest request);

    @ApidocInterface("模态查看详情4")
    ModalView4FormalTableResponse view4(ModalViewFormalTableRequest request);

    @ApidocInterface("模态查看详情5")
    ModalView5FormalTableResponse view5(ModalViewFormalTableRequest request);

    @ApidocInterface("模态查看详情6")
    ModalView6FormalTableResponse view6(ModalViewFormalTableRequest request);

}
