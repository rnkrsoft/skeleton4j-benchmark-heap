package javax.web.skeleton4j.benchmark.interfaces.exp.services;

import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.exp.domains.*;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
public class ExpServiceImpl implements ExpService{
    @Override
    public Exp1Response exp1(Exp1Request request) {
        Exp1Response response = new Exp1Response();
        return response;
    }

    @Override
    public Exp2Response exp2(Exp2Request request) {
        Exp2Response response = new Exp2Response();
        for (int i = 0; i < 10; i++) {
            response.getRecords1().add(Record1.builder().int1(i).int2(i+1).text1(UUID.randomUUID().toString()).text2(System.currentTimeMillis() + "").date1(DateUtils.getCurrFullTime()).build());
        }
        return response;
    }

    @Override
    public Exp3Response exp30(Exp3Request request) {
        System.out.println(request);
        Exp3Response response = new Exp3Response();
        return response;
    }

    @Override
    public Exp3Response exp31(Exp3Request request) {
        System.out.println(request);
        Exp3Response response = new Exp3Response();
        return response;
    }

    @Override
    public Exp3Response exp32(Exp3Request request) {
        System.out.println(request);
        Exp3Response response = new Exp3Response();
        return response;
    }

    @Override
    public Exp4Response exp40(Exp4Request request) {
        System.out.println(request);
        Exp4Response response = new Exp4Response();
        if (request.getProvence().equalsIgnoreCase("028")){
            response.setRspCode("0002");
            response.setRspDesc("到处超过1万条限制");
            return response;
        }
        for (int i = 0; i < 10; i++) {
            response.getRecords1().add(Record1.builder().int1(i).int2(i + 1).text1(UUID.randomUUID().toString()).text2(request.getType()).date1(DateUtils.getCurrFullTime()).build());
        }
        return response;
    }

    @Override
    public Exp4Response exp41(Exp4Request request) {
        System.out.println(request);
        Exp4Response response = new Exp4Response();
        if (request.getProvence().equalsIgnoreCase("028")){
            response.setRspCode("0002");
            response.setRspDesc("到处超过1万条限制");
            return response;
        }
        for (int i = 0; i < 10; i++) {
            response.getRecords1().add(Record1.builder().int1(i).int2(i + 1).text1(UUID.randomUUID().toString()).text2(request.getType()).date1(DateUtils.getCurrFullTime()).build());
        }
        return response;
    }

    @Override
    public Exp4Response exp42(Exp4Request request) {
        System.out.println(request);
        Exp4Response response = new Exp4Response();
        if (request.getProvence().equalsIgnoreCase("028")){
            response.setRspCode("0002");
            response.setRspDesc("到处超过1万条限制");
            return response;
        }
        for (int i = 0; i < 10; i++) {
            response.getRecords1().add(Record1.builder().int1(i).int2(i + 1).text1(UUID.randomUUID().toString()).text2(request.getType()).date1(DateUtils.getCurrFullTime()).build());
        }
        return response;
    }

    @Override
    public Exp5Response exp5(Exp5Request request) {
        System.out.println(request);
        Exp5Response response = new Exp5Response();
        if (request.getProvence().equalsIgnoreCase("028")){
            response.setRspCode("0002");
            response.setRspDesc("到处超过1万条限制");
            return response;
        }
        for (int i = 0; i < 10; i++) {
            response.getRecords1().add(Record1.builder().int1(i).int2(i + 1).text1(UUID.randomUUID().toString()).text2(request.getType()).date1(DateUtils.getCurrFullTime()).build());
        }
        return response;
    }

    @Override
    public Exp6Response exp6(Exp6Request request) {
        Exp6Response response = new Exp6Response();
        ExportType exportType = ExportType.valueOfCode(request.getType());
        if (exportType == ExportType.ALL || exportType == ExportType.ORDER){
            for (int i = 0; i < 100 ; i++) {
                response.getRecords1().add(Record1.builder().int1(i).int2(i + 1).text1("订单" + UUID.randomUUID().toString()).text2(request.getType()).date1(DateUtils.getCurrFullTime()).build());
            }
        }
        if (exportType == ExportType.ALL || exportType == ExportType.PAY){
            for (int i = 0; i < 200 ; i++) {
                response.getRecords2().add(Record2.builder().city(CityEnum.values()[i % 3].getCode()).province(ProvinceEnum.values()[i%3].getCode()).date1(DateUtils.getCurrFullTime()).build());
            }
        }
        return response;
    }
}
