package javax.web.skeleton4j.benchmark.interfaces.menu.service;

import javax.web.skeleton4j.benchmark.interfaces.menu.domains.ViewStudent1Request;
import javax.web.skeleton4j.benchmark.interfaces.menu.domains.ViewStudent1Response;

/**
 * Created by rnkrsoft.com on 2018/12/30.
 */
public class DetailServiceImpl implements DetailService{
    @Override
    public ViewStudent1Response viewStudent1(ViewStudent1Request request) {
        ViewStudent1Response response = ViewStudent1Response.builder().build();
        return response;
    }
}
