package javax.web.skeleton4j.benchmark.interfaces.imp.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.imp.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@ApidocService("导出服务")
public interface ExpService {
    @ApidocInterface("导出文件1")
    Exp1Response exp1(Exp1Request request);

    @ApidocInterface("导出文件2")
    Exp2Response exp2(Exp2Request request);

    @ApidocInterface("导出文件30")
    Exp3Response exp3(Exp3Request request);
}
