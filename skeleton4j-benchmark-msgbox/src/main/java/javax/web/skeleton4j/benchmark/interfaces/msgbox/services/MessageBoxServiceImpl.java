package javax.web.skeleton4j.benchmark.interfaces.msgbox.services;

import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.msgbox.domains.*;
import java.util.UUID;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
public class MessageBoxServiceImpl implements MessageBoxService{
    @Override
    public EnabledProjectResponse enabledProject(EnabledProjectRequest request) {
        EnabledProjectResponse response = new EnabledProjectResponse();
        return response;
    }

    @Override
    public DisabledProjectResponse disabledProject(DisabledProjectRequest request) {
        DisabledProjectResponse response = new DisabledProjectResponse();
        response.setText("禁用项目成功");
        return response;
    }

    @Override
    public GetSysdateStringResponse getSysdateString(GetSysdateStringRequest request) {
        GetSysdateStringResponse response = new GetSysdateStringResponse();
        response.setText(DateUtils.getCurrDate());
        return response;
    }

    @Override
    public GetTxDateResponse getTxDate(GetTxDateRequest request) {
        GetTxDateResponse response = new GetTxDateResponse();
        response.setText(DateUtils.getCurrDate());
        return response;
    }

    @Override
    public ClearTaskResponse clearTask(ClearTaskRequest request) {
        ClearTaskResponse response = new ClearTaskResponse();
        return response;
    }

    @Override
    public QueryTaskResponse queryTask(QueryTaskRequest request) {
        QueryTaskResponse response = new QueryTaskResponse();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(TaskVO.builder().taskId(UUID.randomUUID().toString()).build());
        }
        return response;
    }

    @Override
    public QueryProjectResponse queryProject(QueryProjectRequest request) {
        QueryProjectResponse response = new QueryProjectResponse();
        response.setPageNo(request.getPageNo());
        response.setPageSize(request.getPageSize());
        response.setPageNum(5);
        response.setTotal(5 * request.getPageSize());
        for (int i = 0; i < request.getPageSize(); i++) {
            response.addRecord(ProjectVO.builder().projectId(UUID.randomUUID().toString()).build());
        }
        return response;
    }

    @Override
    public ViewProjectResponse viewProject(ViewProjectRequest request) {
        ViewProjectResponse response = new ViewProjectResponse();
        response.setProjectId(request.getProjectId());
        response.setBeginDate(DateUtils.getCurrDate());
        response.setEndDate("2020/12/23");
        return response;
    }
}
