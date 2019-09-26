package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.ComplexService;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class ComplexServiceImpl implements ComplexService{
    @Override
    public Add19Complex1Response add19Complex1(Add19Complex1Request request) {
        System.out.println(request);
        Add19Complex1Response response = new Add19Complex1Response();
        return response;
    }

    @Override
    public Add19Complex2Response add19Complex2(Add19Complex2Request request) {
        System.out.println(request);
        Add19Complex2Response response = new Add19Complex2Response();
        return response;
    }

    @Override
    public Add19Complex3Response add19Complex3(Add19Complex3Request request) {
        System.out.println(request);
        Add19Complex3Response response = new Add19Complex3Response();
        return response;
    }
}
