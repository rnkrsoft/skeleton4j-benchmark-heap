package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("文本框服务")
public interface TextService {
    @ApidocInterface("增加字符串1")
    Add1TextResponse add1Text(Add1TextRequest request);

    @ApidocInterface("增加字符串2")
    Add2TextResponse add2Text(Add2TextRequest request);

    @ApidocInterface("增加字符串3")
    Add3TextResponse add3Text(Add3TextRequest request);
}
