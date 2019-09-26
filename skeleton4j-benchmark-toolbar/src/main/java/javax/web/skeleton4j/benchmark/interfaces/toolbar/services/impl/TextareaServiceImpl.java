package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.TextareaService;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class TextareaServiceImpl implements TextareaService {
    @Override
    public Add16Textarea1Response addTextarea1(Add16Textarea1Request request) {
        Add16Textarea1Response response = new Add16Textarea1Response();
        response.setText1("123\n456\n");
        response.setText2("456\n789\n");
        return response;
    }

    @Override
    public Add16Textarea2Response addTextarea2(Add16Textarea2Request request) {
        System.out.println(request);
        Add16Textarea2Response response = new Add16Textarea2Response();
        return response;
    }

    @Override
    public Add16Textarea3Response addTextarea3(Add16Textarea3Request request) {
        System.out.println(request);
        Add16Textarea3Response response = new Add16Textarea3Response();
        return response;
    }
}
