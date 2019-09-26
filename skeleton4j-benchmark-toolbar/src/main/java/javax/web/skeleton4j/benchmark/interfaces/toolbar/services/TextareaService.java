package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2019/1/1.
 */
@ApidocService("多行文本服务")
public interface TextareaService {
    @ApidocInterface("增加addTextarea1")
    Add16Textarea1Response addTextarea1(Add16Textarea1Request request);

    @ApidocInterface("增加addTextarea2")
    Add16Textarea2Response addTextarea2(Add16Textarea2Request request);

    @ApidocInterface("增加addTextarea3")
    Add16Textarea3Response addTextarea3(Add16Textarea3Request request);
}
