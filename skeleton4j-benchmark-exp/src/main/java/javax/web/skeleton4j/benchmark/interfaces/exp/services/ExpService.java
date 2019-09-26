package javax.web.skeleton4j.benchmark.interfaces.exp.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.exp.domains.*;

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
    Exp3Response exp30(Exp3Request request);

    @ApidocInterface("导出文件31")
    Exp3Response exp31(Exp3Request request);

    @ApidocInterface("导出文件32")
    Exp3Response exp32(Exp3Request request);

    @ApidocInterface("导出文件40")
    Exp4Response exp40(Exp4Request request);

    @ApidocInterface("导出文件41")
    Exp4Response exp41(Exp4Request request);

    @ApidocInterface("导出文件42")
    Exp4Response exp42(Exp4Request request);

    @ApidocInterface("导出文件5")
    Exp5Response exp5(Exp5Request request);

    @ApidocInterface("导出文件6")
    Exp6Response exp6(Exp6Request request);
}
