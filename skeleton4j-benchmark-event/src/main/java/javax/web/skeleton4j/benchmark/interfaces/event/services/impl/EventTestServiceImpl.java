package javax.web.skeleton4j.benchmark.interfaces.event.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.event.domains.EventTestNameRequest;
import javax.web.skeleton4j.benchmark.interfaces.event.domains.EventTestNameResponse;
import javax.web.skeleton4j.benchmark.interfaces.event.services.EventTestService;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
public class EventTestServiceImpl implements EventTestService {
    @Override
    public EventTestNameResponse eventTestName(EventTestNameRequest request) {
        EventTestNameResponse response = new EventTestNameResponse();
        response.setXxx(UUID.randomUUID().toString());
        return response;
    }
}
