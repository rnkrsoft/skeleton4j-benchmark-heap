package javax.web.skeleton4j.benchmark.interfaces.readable.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.readable.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.readable.services.QueryService;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class QueryServiceImpl implements QueryService {
    @Override
    public Query1Response query1(QueryRequest request) {
        Query1Response response = new Query1Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record1 record = new Record1();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query2Response query2(QueryRequest request) {
        Query2Response response = new Query2Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record2 record = new Record2();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query3Response query3(QueryRequest request) {
        Query3Response response = new Query3Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record3 record = new Record3();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query4Response query4(QueryRequest request) {
        Query4Response response = new Query4Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record4 record = new Record4();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query5Response query5(QueryRequest request) {
        Query5Response response = new Query5Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record5 record = new Record5();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query6Response query6(QueryRequest request) {
        Query6Response response = new Query6Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record6 record = new Record6();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query7Response query7(QueryRequest request) {
        Query7Response response = new Query7Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record7 record = new Record7();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query8Response query8(QueryRequest request) {
        Query8Response response = new Query8Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record8 record = new Record8();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query9Response query9(QueryRequest request) {
        Query9Response response = new Query9Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record9 record = new Record9();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query10Response query10(QueryRequest request) {
        Query10Response response = new Query10Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record10 record = new Record10();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query11Response query11(QueryRequest request) {
        Query11Response response = new Query11Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record11 record = new Record11();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query12Response query12(QueryRequest request) {
        Query12Response response = new Query12Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record12 record = new Record12();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query13Response query13(QueryRequest request) {
        Query13Response response = new Query13Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record13 record = new Record13();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query14Response query14(QueryRequest request) {
        Query14Response response = new Query14Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record14 record = new Record14();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query15Response query15(QueryRequest request) {
        Query15Response response = new Query15Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record15 record = new Record15();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query16Response query16(QueryRequest request) {
        Query16Response response = new Query16Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record16 record = new Record16();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query17Response query17(QueryRequest request) {
        Query17Response response = new Query17Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record17 record = new Record17();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query18Response query18(QueryRequest request) {
        Query18Response response = new Query18Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record18 record = new Record18();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query19Response query19(QueryRequest request) {
        Query19Response response = new Query19Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record19 record = new Record19();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query20Response query20(QueryRequest request) {
        Query20Response response = new Query20Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record20 record = new Record20();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

    @Override
    public Query21Response query21(QueryRequest request) {
        Query21Response response = new Query21Response();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            Record21 record = new Record21();
            record.setSerialNo(UUID.randomUUID().toString());
            response.getRecords().add(record);
        }
        return response;
    }

}
