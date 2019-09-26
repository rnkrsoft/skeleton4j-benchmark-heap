package javax.web.skeleton4j.benchmark.interfaces.msgbox.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.msgbox.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@ApidocService("消息服务")
public interface MessageBoxService {
    @ApidocInterface("获取当前系统时间文本形式")
    GetSysdateStringResponse getSysdateString(GetSysdateStringRequest request);
    @ApidocInterface("获取系统时间")
    GetTxDateResponse getTxDate(GetTxDateRequest request);
    @ApidocInterface("清理任务")
    ClearTaskResponse clearTask(ClearTaskRequest request);
    @ApidocInterface("查询任务")
    QueryTaskResponse queryTask(QueryTaskRequest request);
    @ApidocInterface("查询项目")
    QueryProjectResponse queryProject(QueryProjectRequest request);
    @ApidocInterface("项目详情")
    ViewProjectResponse viewProject(ViewProjectRequest request);
    @ApidocInterface("启用")
    EnabledProjectResponse enabledProject(EnabledProjectRequest request);
    @ApidocInterface("禁用")
    DisabledProjectResponse disabledProject(DisabledProjectRequest request);
}
