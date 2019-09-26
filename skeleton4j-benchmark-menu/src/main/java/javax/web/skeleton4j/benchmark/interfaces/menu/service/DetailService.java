package javax.web.skeleton4j.benchmark.interfaces.menu.service;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.menu.domains.ViewStudent1Request;
import javax.web.skeleton4j.benchmark.interfaces.menu.domains.ViewStudent1Response;

/**
 * Created by rnkrsoft.com on 2018/12/29.
 */
@ApidocService("详情服务")
public interface DetailService {
    @ApidocInterface("查看学生信息1")
    ViewStudent1Response viewStudent1(ViewStudent1Request request);
}
