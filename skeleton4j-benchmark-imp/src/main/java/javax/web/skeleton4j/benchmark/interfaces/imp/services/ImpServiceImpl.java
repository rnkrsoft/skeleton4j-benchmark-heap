package javax.web.skeleton4j.benchmark.interfaces.imp.services;

import javax.web.skeleton4j.benchmark.interfaces.imp.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
public class ImpServiceImpl implements ImpService {
    @Override
    public Imp1Response imp1(Imp1Request request) {
        System.out.println(request);
        Imp1Response response = new Imp1Response();
        return response;
    }

    @Override
    public Imp2Response imp2(Imp2Request request) {
        System.out.println(request);
        Imp2Response response = new Imp2Response();
        return response;
    }

    @Override
    public Imp3Response imp3(Imp3Request request) {
        System.out.println(request);
        Imp3Response response = new Imp3Response();
        return response;
    }
}
