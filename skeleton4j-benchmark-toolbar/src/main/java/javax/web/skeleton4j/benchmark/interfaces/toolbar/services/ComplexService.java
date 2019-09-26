package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
@ApidocService("复杂服务")
public interface ComplexService {
    @ApidocInterface("复杂1")
    Add19Complex1Response add19Complex1(Add19Complex1Request request);

    @ApidocInterface("复杂2")
    Add19Complex2Response add19Complex2(Add19Complex2Request request);

    @ApidocInterface("复杂3")
    Add19Complex3Response add19Complex3(Add19Complex3Request request);
}
