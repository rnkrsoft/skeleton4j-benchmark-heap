package javax.web.skeleton4j.benchmark.interfaces.homepage.services.impl;

import javax.web.data.Node;
import javax.web.skeleton4j.benchmark.interfaces.homepage.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.homepage.services.TreeViewService;

/**
 * Created by rnkrsoft.com on 2019/6/27.
 */
public class TreeViewServiceImpl implements TreeViewService{
    @Override
    public FetchTree1Response fetchTree1(FetchTree1Request request) {
        System.out.println(request);
        FetchTree1Response response = new FetchTree1Response();
        Node node1 = Node.builder().text("基础").value("1").build();
        {
            Node node11 = Node.builder().text("创建数据库1").value("11").build();
            node1.addNode(node11);
            Node node12 = Node.builder().text("创建数据库2").value("12").build();
            node1.addNode(node12);
        }
        response.addNode(node1);
        Node node2 = Node.builder().text("中级").value("2").build();
        response.addNode(node2);
        {
            Node node = Node.builder().text("查询").value("21").build();
            node2.addNode(node);
        }
        {
            Node node = Node.builder().text("修改").value("22").build();
            node2.addNode(node);
        }
        Node node3 = Node.builder().text("高级").value("3").build();
        response.addNode(node3);
        return response;
    }

    @Override
    public CreateTree1Response createTree1(CreateTree1Request request) {
        System.out.println(request);
        CreateTree1Response response = new CreateTree1Response();
        return response;
    }

    @Override
    public DeleteTree1Response deleteTree1(DeleteTree1Request request) {
        System.out.println(request);
        DeleteTree1Response response = new DeleteTree1Response();
        return response;
    }

    @Override
    public UpdateTree1Response updateTree1(UpdateTree1Request request) {
        System.out.println(request);
        UpdateTree1Response response = new UpdateTree1Response();
        return response;
    }
}
