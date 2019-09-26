package javax.web.skeleton4j.benchmark.common.interfaces.services;

import javax.web.data.Node;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchCityRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchCityResponse;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchProvinceRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchProvinceResponse;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public class CityServiceImpl implements CityService{
    @Override
    public FetchCityResponse fetchCity(FetchCityRequest request) {
        FetchCityResponse response = new FetchCityResponse();
        response.addNode(Node.builder().text("1重庆").value("023").build());
        response.addNode(Node.builder().text("1成都").value("028").build());
        response.addNode(Node.builder().text("1北京").value("010").build());
        return response;
    }

    @Override
    public FetchProvinceResponse fetchProvince(FetchProvinceRequest request) {
        FetchProvinceResponse response = new FetchProvinceResponse();
        {
            Node node = Node.builder().text("1四川").value("0800").build();
            node.addNode(Node.builder().text("1成都").value("028").build());
            node.addNode(Node.builder().text("1宜宾").value("0831").build());
            node.addNode(Node.builder().text("1遂宁").value("0828").build());
            response.addNode(node);
        }
        {
            Node node = Node.builder().text("1河北").value("0310").build();
            node.addNode(Node.builder().text("1石家庄").value("0311").build());
            node.addNode(Node.builder().text("1秦皇岛").value("0335").build());
            node.addNode(Node.builder().text("1邢台").value("0319").build());
            response.addNode(node);
        }
        return response;
    }
}
