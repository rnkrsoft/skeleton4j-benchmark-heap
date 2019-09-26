package javax.web.skeleton4j.benchmark.interfaces.dialogbox.services;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.data.Node;
import javax.web.data.RootNode;
import javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains.GroupRecord;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.benchmark.interfaces.dialogbox.services.DialogBoxService;
import java.util.*;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class DialogBoxServiceImpl implements DialogBoxService {
    @Override
    public GetStringResponse getString(GetRequest request) {
        GetStringResponse response = new GetStringResponse();
        response.setValue1("这是一个测试文本");
        return response;
    }

    @Override
    public GetIntegerResponse getInteger(GetRequest request) {
        GetIntegerResponse response = new GetIntegerResponse();
        response.setValue1(new Random().nextInt());
        return response;
    }

    @Override
    public GetDecimalResponse getDecimal(GetRequest request) {
        GetDecimalResponse response = new GetDecimalResponse();
        response.setValue(new Random().nextInt() + ".12");
        return response;
    }

    @Override
    public GetDateResponse getDate(GetRequest request) {
        GetDateResponse response = new GetDateResponse();
        response.setValue1(DateUtils.getCurrDate());
        return response;
    }

    @Override
    public GetImageResponse getImage(GetRequest request) {
        GetImageResponse response = new GetImageResponse();
        response.setValue1("/images/demo1.jpg");
        return response;
    }

    @Override
    public GetImagesResponse getImages(GetRequest request) {
        GetImagesResponse response = new GetImagesResponse();
        response.getValue1().add("/images/demo2.jpg");
        response.getValue1().add("/images/demo1.jpg");
        return response;
    }

    @Override
    public GetFileResponse getFile(GetRequest request) {
        GetFileResponse response = new GetFileResponse();
        response.setValue1("/files/demo1.doc");
        return response;
    }

    @Override
    public GetFilesResponse getFiles(GetRequest request) {
        GetFilesResponse response = new GetFilesResponse();
        response.getValue1().add("/files/demo2.doc");
        response.getValue1().add("/files/demo1.doc");
        return response;
    }

    @Override
    public GetSelectResponse getSelect(GetRequest request) {
        GetSelectResponse response = new GetSelectResponse();
        response.setValue1(CityEnum.CHONG_QING.getCode());
        return response;
    }

    @Override
    public GetSelectsResponse getSelects(GetRequest request) {
        GetSelectsResponse response = new GetSelectsResponse();
        response.getValue1().add(ProvinceEnum.HE_NAN.getCode());
        response.getValue1().add(ProvinceEnum.HE_BEI.getCode());
        return response;
    }

    @Override
    public GetSelectRemoteResponse getSelectRemote(GetRequest request) {
        GetSelectRemoteResponse response = new GetSelectRemoteResponse();
        response.setValue1("028");
        return response;
    }

    @Override
    public GetSelectsRemoteResponse getSelectsRemote(GetRequest request) {
        GetSelectsRemoteResponse response = new GetSelectsRemoteResponse();
        response.getValue1().add("028");
        response.getValue1().add("023");
        return response;
    }

    @Override
    public GetTreeResponse getTree(GetRequest request) {
        GetTreeResponse response = new GetTreeResponse();
        response.setValue1("0828");
        return response;
    }

    @Override
    public GetTreesResponse getTrees(GetRequest request) {
        GetTreesResponse response = new GetTreesResponse();
        response.getValue1().add("0828");
        response.getValue1().add("0311");
        return response;
    }


    @Override
    public GetTextareaResponse getTextarea(GetRequest request) {
        GetTextareaResponse response = new GetTextareaResponse();
        response.setValue1("在图形用户界面中，对话框（又称对话方块[1]）是一种特殊的视窗, 用来在用户界面中向用户显示信息，或者在需要的时候获得用户的输入响应。" +
                "之所以称之为“对话框”是因为它们使计算机和用户之间构成了一个对话——或者是通知用户一些信息，或者是请求用户的输入，或者两者皆有。\n" +
                "不同的用户交互使用不同的对话框。最简单的对话框是警告，它显示一个信息并且仅仅需要一个信息已读的响应（通常是单击'确定'按钮或“关闭”命令的对话框）。" +
                "用来为一个操作提供警告和简单的确认，也可能包括程序终止或崩溃的提示，以及用户有意或无意的关闭动作。" +
                "虽然对于有模式对话框来说，这是个经常性的交互模式，但是由于它被认为在防止非预期的破坏性操作上不够有效以及存在更好的替换方案[2]而遭到可用性专家的批评。" +
                "显示一般提示信息的对话框，可以设计为提示气泡等形式来避免打断用户操作。\n");
        return response;
    }



    @Override
    public GetRichtextResponse getRichtext(GetRequest request) {
        GetRichtextResponse response = new GetRichtextResponse();
        response.setValue1("<div class=\"main-content-zj\">\n" +
                "本词条由<a href=\"https://baike.baidu.com/science\" target=\"_blank\" class=\"nslog:7175\">“科普中国”科学百科词条编写与应用工作项目</a>\n" +
                "审核\n" +
                "。</div>");
        return response;
    }


    @Override
    public GetGroupResponse getGroup(GetRequest request) {
        GetGroupResponse response = new GetGroupResponse();
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
//        response.setValue1(groupRecord1);
        return response;
    }

    @Override
    public GetTableResponse getTable(GetRequest request) {
        GetTableResponse response = new GetTableResponse();
        for (int i = 0; i < 20; i++) {
            response.getValue1().add(TableRecord.builder().serialNo(UUID.randomUUID().toString()).age1(i).age2(i).amt1("123.456").select1("001").selects1(Arrays.asList("001", "002")).image1("/images/demo1.jpg").image2("/images/demo2.jpg").date1(DateUtils.getCurrDate()).build());
        }
        return response;
    }

}
