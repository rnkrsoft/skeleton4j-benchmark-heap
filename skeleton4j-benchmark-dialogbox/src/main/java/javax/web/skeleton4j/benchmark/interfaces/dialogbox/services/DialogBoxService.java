package javax.web.skeleton4j.benchmark.interfaces.dialogbox.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.dialogbox.domains.*;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("系统时间服务")
public interface DialogBoxService {
    @ApidocInterface("获取文本")
    GetStringResponse getString(GetRequest request);

    @ApidocInterface("获取整数")
    GetIntegerResponse getInteger(GetRequest request);

    @ApidocInterface("获取十进制数")
    GetDecimalResponse getDecimal(GetRequest request);


    @ApidocInterface("获取单选（本地）")
    GetSelectResponse getSelect(GetRequest request);

    @ApidocInterface("获取多选（本地）")
    GetSelectsResponse getSelects(GetRequest request);

    @ApidocInterface("获取单选（远程）")
    GetSelectRemoteResponse getSelectRemote(GetRequest request);

    @ApidocInterface("获取多选（远程）")
    GetSelectsRemoteResponse getSelectsRemote(GetRequest request);

    @ApidocInterface("获取树图单选（远程）")
    GetTreeResponse getTree(GetRequest request);

    @ApidocInterface("获取树图多选（远程）")
    GetTreesResponse getTrees(GetRequest request);

    @ApidocInterface("获取多行文本")
    GetTextareaResponse getTextarea(GetRequest request);

    @ApidocInterface("获取日期")
    GetDateResponse getDate(GetRequest request);

    @ApidocInterface("获取图片")
    GetImageResponse getImage(GetRequest request);

    @ApidocInterface("获取相册")
    GetImagesResponse getImages(GetRequest request);

    @ApidocInterface("获取文件")
    GetFileResponse getFile(GetRequest request);

    @ApidocInterface("获取文件集")
    GetFilesResponse getFiles(GetRequest request);

    @ApidocInterface("获取富文本")
    GetRichtextResponse getRichtext(GetRequest request);


    @ApidocInterface("获取组合框")
    GetGroupResponse getGroup(GetRequest request);

    @ApidocInterface("获取表格框")
    GetTableResponse getTable(GetRequest request);

}
