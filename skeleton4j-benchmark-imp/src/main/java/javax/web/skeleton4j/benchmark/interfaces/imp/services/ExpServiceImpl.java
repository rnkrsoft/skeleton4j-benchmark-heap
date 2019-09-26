package javax.web.skeleton4j.benchmark.interfaces.imp.services;

import javax.web.skeleton4j.benchmark.interfaces.imp.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
public class ExpServiceImpl implements ExpService{
    @Override
    public Exp1Response exp1(Exp1Request request) {
        Exp1Response response = new Exp1Response();
        return response;
    }

    @Override
    public Exp2Response exp2(Exp2Request request) {
        Exp2Response response = new Exp2Response();
        return response;
    }

    @Override
    public Exp3Response exp3(Exp3Request request) {
        Exp3Response response = new Exp3Response();
        return response;
    }
}
