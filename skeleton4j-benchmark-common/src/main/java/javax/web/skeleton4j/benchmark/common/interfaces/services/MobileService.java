package javax.web.skeleton4j.benchmark.common.interfaces.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileNoFuzzyRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileNoFuzzyResponse;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchMobileResponse;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("电话服务")
public interface MobileService {
    @ApidocInterface("拉取电话号码")
    FetchMobileNoFuzzyResponse fetchMobileNoFuzzy(FetchMobileNoFuzzyRequest request);
    @ApidocInterface("反解电话号码为名字")
    FetchMobileResponse fetchMobile(FetchMobileRequest request);
}
