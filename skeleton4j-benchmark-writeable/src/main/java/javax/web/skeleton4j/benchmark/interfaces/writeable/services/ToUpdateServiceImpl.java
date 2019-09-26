package javax.web.skeleton4j.benchmark.interfaces.writeable.services;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.writeable.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.writeable.domains.GroupRecord;
import javax.web.skeleton4j.benchmark.interfaces.writeable.domains.TableRecord;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
public class ToUpdateServiceImpl implements ToUpdateService {
    @Override
    public ToUpdate1Response toUpdate1(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate1Response response = new ToUpdate1Response();
        response.setSerialNo(request.getSerialNo());
        response.setText2("这是一个测试2");
        response.setText4("这是一个测试4");
        return response;
    }

    @Override
    public ToUpdate2Response toUpdate2(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate2Response response = new ToUpdate2Response();
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
    public ToUpdate3Response toUpdate3(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate3Response response = new ToUpdate3Response();
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
    public ToUpdate4Response toUpdate4(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate4Response response = new ToUpdate4Response();
        response.setSerialNo(request.getSerialNo());

        response.setSerialNo(request.getSerialNo());
        response.setSelect1(ProvinceEnum.NULL.getCode());
        response.setSelect2(ProvinceEnum.HE_BEI.getCode());
        response.setSelect3(ProvinceEnum.HE_NAN.getCode());
        return response;
    }

    @Override
    public ToUpdate5Response toUpdate5(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate5Response response = new ToUpdate5Response();
        response.setSerialNo(request.getSerialNo());
        response.getSelect2().add(ProvinceEnum.SI_CHUAN.getCode());
        response.getSelect3().add(ProvinceEnum.SI_CHUAN.getCode());
        response.getSelect3().add(ProvinceEnum.HE_BEI.getCode());

        response.getSelect5().add(ProvinceEnum.SI_CHUAN.getCode());
        response.getSelect6().add(ProvinceEnum.SI_CHUAN.getCode());
        response.getSelect6().add(ProvinceEnum.HE_BEI.getCode());
        return response;
    }

    @Override
    public ToUpdate6Response toUpdate6(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate6Response response = new ToUpdate6Response();
        response.setSerialNo(request.getSerialNo());
        response.setSelect1("023");
        response.setSelect2("028");
        response.setSelect3("010");
        return response;
    }

    @Override
    public ToUpdate7Response toUpdate7(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate7Response response = new ToUpdate7Response();
        response.setSerialNo(request.getSerialNo());

        response.getSelect2().add("023");
        response.getSelect3().add("028");
        response.getSelect3().add("010");

        response.getSelect5().add("023");
        response.getSelect6().add("028");
        response.getSelect6().add("010");
        return response;
    }

    @Override
    public ToUpdate8Response toUpdate8(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate8Response response = new ToUpdate8Response();
        response.setSerialNo(request.getSerialNo());
        response.setCity2("0831");
        response.setCity3("0828");

        response.setCity5("0831");
        response.setCity6("0828");
        return response;
    }

    @Override
    public ToUpdate9Response toUpdate9(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate9Response response = new ToUpdate9Response();
        response.setSerialNo(request.getSerialNo());

        response.getCity2().add("0831");

        response.getCity3().add("0831");
        response.getCity3().add("028");

        response.getCity4().add("028");
        response.getCity4().add("0831");
        response.getCity4().add("0828");

        response.getCity6().add("0831");

        response.getCity7().add("0831");
        response.getCity7().add("028");

        response.getCity8().add("028");
        response.getCity8().add("0831");
        response.getCity8().add("0828");
        return response;
    }

    @Override
    public ToUpdate10Response toUpdate10(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate10Response response = new ToUpdate10Response();
        response.setSerialNo(request.getSerialNo());
        response.setMobileNo2("18502360561");
        response.setMobileNo4("19923352631");
        return response;
    }

    @Override
    public ToUpdate11Response toUpdate11(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate11Response response = new ToUpdate11Response();
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
    public ToUpdate12Response toUpdate12(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate12Response response = new ToUpdate12Response();
        response.setSerialNo(request.getSerialNo());
        response.setFile1("/files/demo1.doc");
        return response;
    }

    @Override
    public ToUpdate13Response toUpdate13(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate13Response response = new ToUpdate13Response();
        response.setSerialNo(request.getSerialNo());
        response.setTextarea1("123\n456");
        response.setTextarea2("456\n789");
        response.setTextarea4("123\n456");
        return response;
    }

    @Override
    public ToUpdate14Response toUpdate14(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate14Response response = new ToUpdate14Response();
        response.setSerialNo(request.getSerialNo());
        response.setRichtext2("<img src=\"\\images\\demo1.jpg\">");
        response.setRichtext4("<img src=\"\\images\\demo2.jpg\">");
        return response;
    }


    @Override
    public ToUpdate17Response toUpdate17(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate17Response response = new ToUpdate17Response();
        response.setSerialNo(request.getSerialNo());
        //TODO 源代码
        return response;
    }

    @Override
    public ToUpdate18Response toUpdate18(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate18Response response = new ToUpdate18Response();
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
    public ToUpdate20Response toUpdate20(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate20Response response = new ToUpdate20Response();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 20; i++) {
            response.getTable1().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable2().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable3().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable4().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable5().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }

        for (int i = 0; i < 20; i++) {
            response.getTable6().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }


        for (int i = 0; i < 20; i++) {
            response.getTable7().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }


        for (int i = 0; i < 20; i++) {
            response.getTable8().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        return response;
    }

    @Override
    public ToUpdate20_2Response toUpdate20_2(ToUpdateRequest request) {
        System.out.println(request);
        ToUpdate20_2Response response = new ToUpdate20_2Response();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 20; i++) {
            response.getTable1().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable2().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable3().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable4().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }
        for (int i = 0; i < 20; i++) {
            response.getTable5().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }

        for (int i = 0; i < 20; i++) {
            response.getTable6().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }


        for (int i = 0; i < 20; i++) {
            response.getTable7().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }


        for (int i = 0; i < 20; i++) {
            response.getTable8().add(TableRecord2.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).tree1("0828").trees1(Arrays.asList("0828", "028")).image1("/images/demo" + ((i % 2) + 1) + ".jpg").image2(Arrays.asList("/images/demo2.jpg")).date1(DateUtils.getCurrDate()).build());
        }
        return response;
    }

    @Override
    public ToUpdate21Response toUpdate21(ToUpdateRequest request) {
        ToUpdate21Response response = new ToUpdate21Response();
        response.setSerialNo(request.getSerialNo());
        for (int i = 0; i < 20; i++) {
            response.getTable2().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).image1("/images/demo"+ ((i% 2) + 1)+".jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
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
