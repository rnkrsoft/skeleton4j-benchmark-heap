package javax.web.skeleton4j.benchmark.interfaces.formTableModal.services;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.common.interfaces.enums.ProvinceEnum;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
public class ModalFormalTableServiceImpl implements ModalFormalTableService{
    @Override
    public ModalFormalTableResponse add1(Modal1FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalFormalTableResponse add2(Modal2FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalFormalTableResponse add3(Modal3FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalFormalTableResponse add4(Modal4FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalFormalTableResponse add5(Modal5FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalFormalTableResponse add6(Modal6FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalFormalTableResponse add7(Modal7FormalTableRequest request) {
        ModalFormalTableResponse response = new ModalFormalTableResponse();
        return response;
    }

    @Override
    public ModalQuery1FormalTableResponse query1(QueryFormalTableRequest request) {
        ModalQuery1FormalTableResponse response = new ModalQuery1FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ModalQuery1FormalTableRecord.builder()
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
    public ModalQuery2FormalTableResponse query2(QueryFormalTableRequest request) {
        ModalQuery2FormalTableResponse response = new ModalQuery2FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ModalQuery2FormalTableRecord.builder()
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
    public ModalQuery3FormalTableResponse query3(QueryFormalTableRequest request) {
        ModalQuery3FormalTableResponse response = new ModalQuery3FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ModalQuery3FormalTableRecord.builder()
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
    public ModalQuery4FormalTableResponse query4(QueryFormalTableRequest request) {
        ModalQuery4FormalTableResponse response = new ModalQuery4FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ModalQuery4FormalTableRecord.builder()
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
    public ModalQuery5FormalTableResponse query5(QueryFormalTableRequest request) {
        ModalQuery5FormalTableResponse response = new ModalQuery5FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ModalQuery5FormalTableRecord.builder()
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
    public ModalQuery6FormalTableResponse query6(QueryFormalTableRequest request) {
        ModalQuery6FormalTableResponse response = new ModalQuery6FormalTableResponse();
        response.setPageSize(request.getPageSize());
        response.setPageNo(request.getPageNo());

        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ModalQuery6FormalTableRecord.builder()
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
