package javax.web.skeleton4j.benchmark.common.interfaces.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchAreaTypeRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchAreaTypeResponse;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("区域类型服务")
public interface AreaTypeService {
    @ApidocInterface("获取区域类型")
    FetchAreaTypeResponse fetchAreaType(FetchAreaTypeRequest request);
}
