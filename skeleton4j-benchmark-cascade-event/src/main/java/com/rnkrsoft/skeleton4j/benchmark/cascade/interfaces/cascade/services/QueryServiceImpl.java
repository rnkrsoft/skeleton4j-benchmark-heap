package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services;

import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Query1Record;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Query1Request;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Query1Response;

import java.util.UUID;

public class QueryServiceImpl implements QueryService{
    @Override
    public Query1Response query1(Query1Request request) {
        Query1Response response = new Query1Response();
        response.addRecord(Query1Record.builder().serialNo(UUID.randomUUID().toString()).name("测试").build());
        return response;
    }
}
