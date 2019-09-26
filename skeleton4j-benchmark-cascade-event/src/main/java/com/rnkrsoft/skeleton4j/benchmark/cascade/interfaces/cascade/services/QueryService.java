package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services;

import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Query1Request;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains.Query1Response;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;

@ApidocService("查询服务")
public interface QueryService {
    @ApidocInterface("查询1")
    Query1Response query1(Query1Request request);
}
