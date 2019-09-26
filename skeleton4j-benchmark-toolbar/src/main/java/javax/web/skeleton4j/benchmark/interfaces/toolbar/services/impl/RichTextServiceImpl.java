package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.RichTextService;

/**
 * Created by rnkrsoft.com on 2019/1/1.
 */
public class RichTextServiceImpl implements RichTextService {
    @Override
    public Add12Richedit1Response addRichedit1(Add12Richedit1Request request) {
        System.out.println(request);
        Add12Richedit1Response response = new Add12Richedit1Response();
        response.setRichtext1("这是测试1");
        response.setRichtext2("这是测试2");
        return response;
    }

    @Override
    public Add12Richedit2Response addRichedit2(Add12Richedit2Request request) {
        System.out.println(request);
        Add12Richedit2Response response = new Add12Richedit2Response();
        return response;
    }

    @Override
    public Add12Richedit3Response addRichedit3(Add12Richedit3Request request) {
        System.out.println(request);
        Add12Richedit3Response response = new Add12Richedit3Response();
        return response;
    }

    @Override
    public Add16Textarea1Response addTextarea1(Add16Textarea1Request request) {
        System.out.println(request);
        Add16Textarea1Response response = new Add16Textarea1Response();
        return response;
    }
}
