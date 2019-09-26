package javax.web.skeleton4j.benchmark.interfaces.cascade.services;

import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.QueryRecord;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.QueryRequest;
import javax.web.skeleton4j.benchmark.interfaces.cascade.domains.QueryResponse;

import javax.web.skeleton4j.benchmark.interfaces.cascade.services.QueryService;
import javax.web.skeleton4j.utils.QueryUtils;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/7/26.
 */
public class QueryServiceImpl implements QueryService {
    @Override
    public QueryResponse query(QueryRequest request) {
        QueryResponse response = new QueryResponse();
        QueryUtils.parameter(request, request.getPageSize(), 1, response);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(QueryRecord.builder()
                    .serialNo(UUID.randomUUID().toString())
                    .name("name" + i)
                    .age(i)
                    .build()
            );
        }
        return response;
    }
}
