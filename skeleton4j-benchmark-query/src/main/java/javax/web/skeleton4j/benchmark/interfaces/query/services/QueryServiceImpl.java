package javax.web.skeleton4j.benchmark.interfaces.query.services;

import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.interfaces.query.domains.Query1Request;
import javax.web.skeleton4j.benchmark.interfaces.query.domains.Query1Response;
import javax.web.skeleton4j.benchmark.interfaces.query.domains.Record1;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/3/24.
 */
public class QueryServiceImpl implements QueryService{
    @Override
    public Query1Response query1(Query1Request request) {
        Query1Response response = new Query1Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record1 record = new Record1();
            record.setSerialNo(UUID.randomUUID().toString());
            record.setAge1(i);
            record.setAge2(i * 2);
            record.setProvince(ProvinceEnum.values()[i % 3].getCode());
            record.setCity(CityEnum.values()[i % 3].getCode());
            record.setProvince2(ProvinceEnum.values()[i % 2].getCode());
            response.getRecords().add(record);
        }
        return response;
    }
}
