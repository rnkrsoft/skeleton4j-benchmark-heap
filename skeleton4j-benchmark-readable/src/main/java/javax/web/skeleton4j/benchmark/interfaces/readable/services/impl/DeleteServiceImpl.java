package javax.web.skeleton4j.benchmark.interfaces.readable.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.readable.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.readable.services.DeleteService;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class DeleteServiceImpl implements DeleteService {
    @Override
    public Delete1Response delete1(Delete1Request request) {
        Delete1Response response = new Delete1Response();
        return response;
    }
}
