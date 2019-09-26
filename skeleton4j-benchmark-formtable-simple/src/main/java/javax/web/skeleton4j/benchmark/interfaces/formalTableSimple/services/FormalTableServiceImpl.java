package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains.*;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
public class FormalTableServiceImpl implements FormalTableService{
    @Override
    public AddFormalTableResponse add1(Add1FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public AddFormalTableResponse add2(Add2FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public AddFormalTableResponse add3(Add3FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public AddFormalTableResponse add4(Add4FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public AddFormalTableResponse add5(Add5FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public AddFormalTableResponse add6(Add6FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public AddFormalTableResponse add13(Add13FormalTableRequest request) {
        AddFormalTableResponse response = new AddFormalTableResponse();
        return response;
    }

    @Override
    public Query1FormalTableResponse query1(QueryFormalTableRequest request) {
        Query1FormalTableResponse response = new Query1FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(Query1FormalTableRecord.builder()
                    .serialNo(Integer.toString(i))
                    .age1(i)
                    .age2(i * 2)
                    .amt1(Integer.toString(i))
                    .build());
        }
        response.setTotal(request.getPageSize() * 20);
        response.setPageNum(20);
        return response;
    }

    @Override
    public Query2FormalTableResponse query2(QueryFormalTableRequest request) {
        Query2FormalTableResponse response = new Query2FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(Query2FormalTableRecord.builder()
                    .serialNo(Integer.toString(i))
                    .date1(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                    .date2(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                    .build());
        }
        response.setTotal(request.getPageSize() * 20);
        response.setPageNum(20);
        return response;
    }

    @Override
    public Query3FormalTableResponse query3(QueryFormalTableRequest request) {
        Query3FormalTableResponse response = new Query3FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(Query3FormalTableRecord.builder()
                    .serialNo(Integer.toString(i))
                    .select1(ProvinceEnum.SI_CHUAN.getCode())
                    .selects1(Arrays.asList(ProvinceEnum.SI_CHUAN.getCode(), ProvinceEnum.HE_BEI.getCode()))
                    .build());
        }
        response.setTotal(request.getPageSize() * 20);
        response.setPageNum(20);
        return response;
    }

    @Override
    public Query4FormalTableResponse query4(QueryFormalTableRequest request) {
        Query4FormalTableResponse response = new Query4FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(Query4FormalTableRecord.builder()
                    .serialNo(Integer.toString(i))
                    .age1(i)
                    .age2(i * 2)
                    .amt1(Integer.toString(i))
                    .build());
        }
        response.setTotal(request.getPageSize() * 20);
        response.setPageNum(20);
        return response;
    }

    @Override
    public Query5FormalTableResponse query5(QueryFormalTableRequest request) {
        Query5FormalTableResponse response = new Query5FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(Query5FormalTableRecord.builder()
                    .serialNo(Integer.toString(i))
                    .image1("/images/demo1.jpg")
                    .image2("/images/demo2.jpg")
                    .build());
        }
        response.setTotal(request.getPageSize() * 20);
        response.setPageNum(20);
        return response;
    }

    @Override
    public Query6FormalTableResponse query6(QueryFormalTableRequest request) {
        Query6FormalTableResponse response = new Query6FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(Query6FormalTableRecord.builder()
                    .serialNo(Integer.toString(i))
                    .file1("/images/demo1.jpg")
                    .file2("/images/demo2.jpg")
                    .build());
        }
        response.setTotal(request.getPageSize() * 20);
        response.setPageNum(20);
        return response;
    }


}
