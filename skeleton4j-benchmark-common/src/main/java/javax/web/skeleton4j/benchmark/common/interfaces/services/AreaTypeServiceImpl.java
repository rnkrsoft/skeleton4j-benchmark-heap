package javax.web.skeleton4j.benchmark.common.interfaces.services;

import javax.web.data.Node;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchAreaTypeRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchAreaTypeResponse;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class AreaTypeServiceImpl implements AreaTypeService {
    @Override
    public FetchAreaTypeResponse fetchAreaType(FetchAreaTypeRequest request) {
        FetchAreaTypeResponse response = new FetchAreaTypeResponse();
        response.addNode(Node.builder().text("旅游景区").value("001").build());
        response.addNode(Node.builder().text("公交枢纽").value("002").build());
        response.addNode(Node.builder().text("娱乐设施").value("003").build());
        response.addNode(Node.builder().text("地标建筑").value("004").build());
        return response;
    }
}
