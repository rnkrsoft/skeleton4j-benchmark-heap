package javax.web.skeleton4j.benchmark.interfaces.homepage.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.homepage.domains.*;

/**
 * Created by rnkrsoft.com on 2019/6/27.
 */
@ApidocService("树形视图服务")
public interface TreeViewService {
    @ApidocInterface("获取树节点数据")
    FetchTree1Response fetchTree1(FetchTree1Request request);
    @ApidocInterface("创建树节点数据")
    CreateTree1Response createTree1(CreateTree1Request request);
    @ApidocInterface("删除树节点数据")
    DeleteTree1Response deleteTree1(DeleteTree1Request request);
    @ApidocInterface("修改树节点数据")
    UpdateTree1Response updateTree1(UpdateTree1Request request);
}
