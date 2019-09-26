package javax.web.skeleton4j.benchmark.common.interfaces.services;

import javax.web.data.Node;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileNoFuzzyRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileNoFuzzyResponse;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileResponse;
import javax.web.skeleton4j.utils.QueryUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public class MobileServiceImpl implements MobileService {
    @Override
    public FetchMobileNoFuzzyResponse fetchMobileNoFuzzy(FetchMobileNoFuzzyRequest request) {
        FetchMobileNoFuzzyResponse response = new FetchMobileNoFuzzyResponse();
        if (request.getValue1().equals("185")) {
            QueryUtils.parameter(request, 10 * request.getPageSize(), 10, response);
            for (int i = 0; i < request.getPageSize(); i++) {
                response.addNode(Node.builder().text("测试" + (request.getPageNo() - 1) + "-" +  (i + 1)).value("18502360" + (request.getPageNo() - 1) + "6" + i).build());
            }
        }
        if (request.getValue1().equals("199")) {
            QueryUtils.parameter(request, 4, 1, response);
            response.addNode(Node.builder().text("测试5").value("19923352631").build());
            response.addNode(Node.builder().text("测试6").value("19923352632").build());
            response.addNode(Node.builder().text("测试7").value("19923352633").build());
            response.addNode(Node.builder().text("测试8").value("19923352634").build());
        }
        return response;
    }

    @Override
    public FetchMobileResponse fetchMobile(FetchMobileRequest request) {
        Map<String, String> map = new HashMap();
        map.put("18502360561", "测试1");
        map.put("18502360562", "测试2");
        map.put("18502360563", "测试3");
        map.put("18502360564", "测试4");
        map.put("19923352631", "测试5");
        map.put("19923352632", "测试6");
        map.put("19923352633", "测试7");
        map.put("19923352634", "测试8");
        String text = map.get(request.getValue1());
        FetchMobileResponse response = new FetchMobileResponse();
        response.setText(text);
        return response;
    }
}
