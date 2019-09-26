package javax.web.skeleton4j.benchmark.interfaces.imp.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.imp.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@ApidocService("导入服务")
public interface ImpService {
    @ApidocInterface("导入1")
    Imp1Response imp1(Imp1Request request);

    @ApidocInterface("导入2")
    Imp2Response imp2(Imp2Request request);

    @ApidocInterface("导入3")
    Imp3Response imp3(Imp3Request request);
}
