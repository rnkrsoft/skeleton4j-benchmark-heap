package javax.web.skeleton4j.benchmark.interfaces.cascade.services;

import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.Test1Request;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.Test1Response;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.Test2Request;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.Test2Response;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
public class TestServiceImpl implements TestService{
    @Override
    public Test1Response test1(Test1Request request) {
        Test1Response response = new Test1Response();
        return response;
    }

    @Override
    public Test2Response test2(Test2Request request) {
        Test2Response response = new Test2Response();
        response.setName("world");
        return response;
    }
}
