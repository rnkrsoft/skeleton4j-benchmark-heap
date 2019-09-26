package javax.web.skeleton4j.benchmark.interfaces.readable.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.readable.domains.*;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("删除服务")
public interface DeleteService {
    @ApidocInterface("删除1")
    Delete1Response delete1(Delete1Request request);
}
