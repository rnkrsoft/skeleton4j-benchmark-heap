package javax.web.skeleton4j.benchmark.interfaces.cascade.services;

import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
public class CascadeServiceImpl implements CascadeService{
    @Override
    public CascadeResponse cascadeText(CascadeTextRequest request) {
        CascadeResponse response = new CascadeResponse();
        return response;
    }

    @Override
    public CascadeResponse cascadeInteger(CascadeIntegerRequest request) {
        CascadeResponse response = new CascadeResponse();
        return response;
    }

    @Override
    public CascadeResponse cascadeDecimal(CascadeDecimalRequest request) {
        CascadeResponse response = new CascadeResponse();
        return response;
    }

    @Override
    public CascadeResponse cascadeDate(CascadeDateRequest request) {
        CascadeResponse response = new CascadeResponse();
        return response;
    }

    @Override
    public ViewResponse view(ViewRequest request) {
        return null;
    }

}
