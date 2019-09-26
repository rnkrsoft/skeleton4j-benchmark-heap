package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.TextService;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class TextServiceImpl implements TextService{
    @Override
    public Add1TextResponse add1Text(Add1TextRequest request) {
        Add1TextResponse response = new Add1TextResponse();
        response.setText1("123");
        response.setText2("456");
        return response;
    }

    @Override
    public Add2TextResponse add2Text(Add2TextRequest request) {
        System.out.println(request);
        Add2TextResponse response = new Add2TextResponse();
        return response;
    }

    @Override
    public Add3TextResponse add3Text(Add3TextRequest request) {
        System.out.println(request);
        Add3TextResponse response = new Add3TextResponse();
        return response;
    }
}
