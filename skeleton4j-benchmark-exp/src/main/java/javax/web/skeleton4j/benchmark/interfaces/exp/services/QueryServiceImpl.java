package javax.web.skeleton4j.benchmark.interfaces.exp.services;

import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.exp.domains.QueryRecord;
import javax.web.skeleton4j.benchmark.interfaces.exp.domains.QueryRequest;
import javax.web.skeleton4j.benchmark.interfaces.exp.domains.QueryResponse;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
public class QueryServiceImpl implements QueryService{
    @Override
    public QueryResponse query(QueryRequest request) {
        QueryResponse response = new QueryResponse();
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setPageSize(request.getPageSize());
        for (int i = 0; i < 5 * request.getPageSize() ; i++) {
            response.addRecord(QueryRecord.builder().int1(i).int2(i + 1).text1(UUID.randomUUID().toString()).text2(request.getType()).date1(DateUtils.getCurrFullTime()).build());
        }
        return response;
    }
}
