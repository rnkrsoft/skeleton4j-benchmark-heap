package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2019/1/1.
 */
@ApidocService("编辑器服务")
public interface RichTextService {
    @ApidocInterface("增加Richedit1")
    Add12Richedit1Response addRichedit1(Add12Richedit1Request request);

    @ApidocInterface("增加Richedit2")
    Add12Richedit2Response addRichedit2(Add12Richedit2Request request);

    @ApidocInterface("增加Richedit3")
    Add12Richedit3Response addRichedit3(Add12Richedit3Request request);

    @ApidocInterface("增加addTextarea1")
    Add16Textarea1Response addTextarea1(Add16Textarea1Request request);
}
