package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add17GroupRequest;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add17GroupResponse;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.GroupService;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class GroupServiceImpl implements GroupService{
    @Override
    public Add17GroupResponse add17Group(Add17GroupRequest request) {
        System.out.println(request);
        Add17GroupResponse response = new Add17GroupResponse();
        return response;
    }
}
