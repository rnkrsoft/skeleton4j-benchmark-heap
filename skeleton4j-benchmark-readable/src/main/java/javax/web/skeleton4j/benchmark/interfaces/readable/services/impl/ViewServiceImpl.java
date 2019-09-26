package javax.web.skeleton4j.benchmark.interfaces.readable.services.impl;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.readable.domains.*;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.benchmark.interfaces.readable.services.ViewService;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
public class ViewServiceImpl implements ViewService {
    @Override
    public View1Response view1(ViewRequest request) {
        System.out.println(request);
        View1Response response = new View1Response();
        response.setSerialNo(request.getSerialNo());
        response.setText2("这是一个测试2");
        response.setText4("这是一个测试4");
        return response;
    }

    @Override
    public View2Response view2(ViewRequest request) {
        System.out.println(request);
        View2Response response = new View2Response();
        response.setSerialNo(request.getSerialNo());
        response.setAge1(1);
        response.setAge2(2);
        response.setAge3(3);
        response.setAge4(4);
        response.setAge5(5);
        response.setAge6(6);
        response.setAge7(7);
        response.setAge8(8);
        response.setAge9(9);
        response.setAge10(10);
        response.setAge11(11);
        response.setAge12(12);
        response.setAge13(13);
        response.setAge14(14);
        response.setAge15(15);
        response.setAge16(16);
        return response;
    }

    @Override
    public View3Response view3(ViewRequest request) {
        System.out.println(request);
        View3Response response = new View3Response();
        response.setSerialNo(request.getSerialNo());
        response.setDate5(DateUtils.formatJavaDate2String(new Date(), DateStyle.DAY_FORMAT2));
        response.setDate6(DateUtils.formatJavaDate2String(new Date(), DateStyle.SECOND_FORMAT2));
        response.setDate7(DateUtils.formatJavaDate2String(new Date(), DateStyle.DAY_FORMAT2));
        response.setDate8(DateUtils.formatJavaDate2String(new Date(), DateStyle.SECOND_FORMAT2));
        response.setDate9(DateUtils.formatJavaDate2String(new Date(), DateStyle.DAY_FORMAT2));
        response.setDate10(DateUtils.formatJavaDate2String(new Date(), DateStyle.SECOND_FORMAT2));
        response.setDate11(DateUtils.formatJavaDate2String(new Date(), DateStyle.DAY_FORMAT2));
        response.setDate12(DateUtils.formatJavaDate2String(new Date(), DateStyle.SECOND_FORMAT2));
        return response;
    }

    @Override
    public View4Response view4(ViewRequest request) {
        System.out.println(request);
        View4Response response = new View4Response();
        response.setSerialNo(request.getSerialNo());

        response.setSerialNo(request.getSerialNo());
        response.setSelect1(ProvinceEnum.NULL.getCode());
        response.setSelect2(ProvinceEnum.HE_BEI.getCode());
        response.setSelect3(ProvinceEnum.HE_NAN.getCode());
        return response;
    }

    @Override
    public View5Response view5(ViewRequest request) {
        System.out.println(request);
        View5Response response = new View5Response();
        response.setSerialNo(request.getSerialNo());
        response.getSelect2().add(ProvinceEnum.SI_CHUAN.getCode());
        response.getSelect3().add(ProvinceEnum.HE_BEI.getCode());
        response.getSelect3().add(ProvinceEnum.HE_NAN.getCode());

        response.getSelect5().add(ProvinceEnum.SI_CHUAN.getCode());
        response.getSelect6().add(ProvinceEnum.HE_BEI.getCode());
        response.getSelect6().add(ProvinceEnum.HE_NAN.getCode());
        return response;
    }

    @Override
    public View6Response view6(ViewRequest request) {
        System.out.println(request);
        View6Response response = new View6Response();
        response.setSerialNo(request.getSerialNo());
        response.setSelect2("010");
        response.setSelect3("023");

        response.setSelect5("010");
        response.setSelect6("023");
        return response;
    }

    @Override
    public View7Response view7(ViewRequest request) {
        System.out.println(request);
        View7Response response = new View7Response();
        response.setSerialNo(request.getSerialNo());
        response.getSelect2().add("010");
        response.getSelect3().add("023");
        response.getSelect3().add("028");

        response.getSelect5().add("010");
        response.getSelect6().add("023");
        response.getSelect6().add("028");
        return response;
    }

    @Override
    public View8Response view8(ViewRequest request) {
        System.out.println(request);
        View8Response response = new View8Response();
        response.setSerialNo(request.getSerialNo());
        response.setCity2("028");
        response.setCity3("0828");

        response.setCity5("028");
        response.setCity6("0828");
        return response;
    }

    @Override
    public View9Response view9(ViewRequest request) {
        System.out.println(request);
        View9Response response = new View9Response();
        response.setSerialNo(request.getSerialNo());
        response.getCity2().add("010");
        response.getCity3().add("023");
        response.getCity3().add("028");

        response.getCity5().add("010");
        response.getCity6().add("023");
        response.getCity6().add("028");
        return response;
    }

    @Override
    public View10Response view10(ViewRequest request) {
        System.out.println(request);
        View10Response response = new View10Response();
        response.setSerialNo(request.getSerialNo());
        response.setMobileNo1("18502360561");
        return response;
    }

    @Override
    public View11Response view11(ViewRequest request) {
        System.out.println(request);
        View11Response response = new View11Response();
        response.setSerialNo(request.getSerialNo());
        response.setImage2("/images/demo1.jpg");
        response.setImage4("/images/demo2.jpg");
        response.getImages2().add("/images/demo1.jpg");

        response.getImages3().add("/images/demo1.jpg");
        response.getImages3().add("/images/demo2.jpg");

        response.getImages5().add("/images/demo1.jpg");

        response.getImages6().add("/images/demo1.jpg");
        response.getImages6().add("/images/demo2.jpg");
        return response;
    }

    @Override
    public View12Response view12(ViewRequest request) {
        System.out.println(request);
        View12Response response = new View12Response();
        response.setSerialNo(request.getSerialNo());
        response.setFile3("/files/demo1.doc");
        response.getFiles2().add("/files/demo1.doc");
        response.getFiles3().add("/files/demo2.doc");
        response.getFiles3().add("/files/demo3.doc");
        return response;
    }

    @Override
    public View13Response view13(ViewRequest request) {
        System.out.println(request);
        View13Response response = new View13Response();
        response.setSerialNo(request.getSerialNo());
        response.setTextarea1("123\n456");
        response.setTextarea2("23\n456");
        response.setTextarea3("323\n456");
        return response;
    }

    @Override
    public View14Response view14(ViewRequest request) {
        System.out.println(request);
        View14Response response = new View14Response();
        response.setSerialNo(request.getSerialNo());
        response.setRichtext2("<image src=\"/demo1.jpg\">");
        response.setRichtext4("<image src=\"/demo2.jpg\">");
        return response;
    }




    @Override
    public View17Response view17(ViewRequest request) {
        System.out.println(request);
        View17Response response = new View17Response();
        response.setSerialNo(request.getSerialNo());
        //TODO
        return response;
    }

    @Override
    public View18Response view18(ViewRequest request) {
        System.out.println(request);
        View18Response response = new View18Response();
        response.setSerialNo(request.getSerialNo());
        GroupRecord groupRecord1 = GroupRecord.builder()
                .text2("123")
                .text4("456")
                .age1(1)
                .age2(2)
                .age3(3)
                .age4(4)
                .age5(5)
                .age6(6)
                .amt("123.54")
                .date1(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                .date2(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT3))
                .date3(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                .date4(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                .date5(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT3))
                .date6(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                .city1(CityEnum.BEI_JING.getCode())
                .city2(CityEnum.CHENG_DU.getCode())
                .city3(CityEnum.CHONG_QING.getCode())
                .type1("001")
                .type2("002")
                .type3("003")
                .types2(Arrays.asList("001"))
                .types3(Arrays.asList("001", "002"))
                .types5(new HashSet<String>(Arrays.asList("001")))
                .types6(new HashSet<String>(Arrays.asList("001", "002")))
                .image1("/images/demo1.jpg")
                .image2("/images/demo2.jpg")
                .build();
        response.setRecord1(groupRecord1);
        GroupRecord groupRecord2 = new GroupRecord();
        response.setRecord2(groupRecord2);
        return response;
    }



    @Override
    public View20Response view20(ViewRequest request) {
        View20Response response = new View20Response();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 20; i++) {
            response.getTable2().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).image1("/images/demo1.jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        return response;
    }

    @Override
    public View21Response view21(ViewRequest request) {
        View21Response response = new View21Response();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 20; i++) {
            response.getTable2().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").image1("/images/demo1.jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }

        GroupRecord groupRecord1 = GroupRecord.builder()
                .text2("123")
                .text4("456")
                .age1(1)
                .age2(2)
                .age3(3)
                .age4(4)
                .age5(5)
                .age6(6)
                .amt("123.54")
                .date1(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                .date2(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT3))
                .date3(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                .date4(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2))
                .date5(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT3))
                .date6(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2))
                .city1(CityEnum.BEI_JING.getCode())
                .city2(CityEnum.CHENG_DU.getCode())
                .city3(CityEnum.CHONG_QING.getCode())
                .type1("001")
                .type2("002")
                .type3("003")
                .types2(Arrays.asList("001"))
                .types3(Arrays.asList("001", "002"))
                .types5(new HashSet<String>(Arrays.asList("001")))
                .types6(new HashSet<String>(Arrays.asList("001", "002")))
                .image1("/images/demo1.jpg")
                .image2("/images/demo2.jpg")
                .build();
        response.setRecord1(groupRecord1);
        return response;
    }

}
