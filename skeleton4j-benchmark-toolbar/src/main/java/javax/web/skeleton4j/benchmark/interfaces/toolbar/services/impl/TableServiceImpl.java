package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add18TableRequest;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.Add18TableResponse;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.TableService;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class TableServiceImpl implements TableService {
    @Override
    public Add18TableResponse add18Table(Add18TableRequest request) {
        System.out.println(request);
        Add18TableResponse response = new Add18TableResponse();
        return response;
    }
}
