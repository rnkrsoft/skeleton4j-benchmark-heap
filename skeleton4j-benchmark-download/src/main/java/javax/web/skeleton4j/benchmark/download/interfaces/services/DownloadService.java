package javax.web.skeleton4j.benchmark.download.interfaces.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Create2Request;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Create2Response;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Download1Request;
import javax.web.skeleton4j.benchmark.download.interfaces.domains.Download1Response;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
@ApidocService("下载服务")
public interface DownloadService {
    @ApidocInterface("下载1")
    Download1Response download1(Download1Request request);
    @ApidocInterface("创建表单2")
    Create2Response create2(Create2Request request);
}
