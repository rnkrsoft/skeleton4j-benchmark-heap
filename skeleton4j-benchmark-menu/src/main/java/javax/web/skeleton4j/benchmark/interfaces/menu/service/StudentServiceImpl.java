package javax.web.skeleton4j.benchmark.interfaces.menu.service;

import javax.web.skeleton4j.benchmark.interfaces.menu.domains.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2018/12/30.
 */
public class StudentServiceImpl implements StudentService {
    String[] names = {"张三", "李四", "王五"};
    String[] address = {"重庆市九龙坡区", "重庆市渝北区", "重庆市渝中区", "重庆市北碚区"};

    @Override
    public Query1Response query1(QueryRequest request) {
        Query1Response response = new Query1Response();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setTotal(10 * request.getPageSize());
        response.setPageNum(10);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.getRecords().add(Student1.builder().serialNo(i)
                    .name(names[(i) % 3])
                    .address(address[(i) % 4])
                    .age(i /4).build());
        }
        return response;
    }

    @Override
    public Query2Response query2(QueryRequest request) {
        Query2Response response = new Query2Response();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setTotal(10 * request.getPageSize());
        response.setPageNum(10);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.getRecords().add(Student2.builder().serialNo(i)
                    .name("test" + i)
                    .address("重庆市" + i)
                    .age(i / 4).build());
        }
        return response;
    }

    @Override
    public Query3Response query3(QueryRequest request) {
        Query3Response response = new Query3Response();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setTotal(10 * request.getPageSize());
        response.setPageNum(10);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.getRecords().add(Student3.builder().serialNo(i)
                    .name(names[(i) % 3])
                    .address(address[(i) % 4])
                    .age(i / 4).build());
        }
        return response;
    }

    @Override
    public Query4Response query4(QueryRequest request) {
        Query4Response response = new Query4Response();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setTotal(10 * request.getPageSize());
        response.setPageNum(10);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.getRecords().add(Student4.builder().serialNo(i)
                    .name(names[(i) % 3])
                    .address(address[(i) % 4])
                    .age(i / 4).build());
        }
        return response;
    }

    @Override
    public Query5Response query5(QueryRequest request) {
        Query5Response response = new Query5Response();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setTotal(10 * request.getPageSize());
        response.setPageNum(10);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.getRecords().add(Student5.builder().serialNo(i)
                    .name(names[(i) % 3])
                    .address(address[(i) % 4])
                    .age(i % 4).build());
        }
        return response;
    }

    @Override
    public Query6Response query6(QueryRequest request) {
        Query6Response response = new Query6Response();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setTotal(10 * request.getPageSize());
        response.setPageNum(10);
        for (int i = 0; i < request.getPageSize(); i++) {
            response.getRecords().add(Student6.builder().serialNo(i)
                    .name(names[(i) % 3])
                    .address(address[(i) % 4])
                    .age(i / 4).build());
        }
        return response;
    }
}
