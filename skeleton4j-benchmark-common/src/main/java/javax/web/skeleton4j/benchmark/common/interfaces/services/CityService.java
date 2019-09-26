package javax.web.skeleton4j.benchmark.common.interfaces.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchCityRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchCityResponse;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchProvinceRequest;
import javax.web.skeleton4j.benchmark.common.interfaces.domains.FetchProvinceResponse;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("城市服务")
public interface CityService {
    @ApidocInterface("拉取城市")
    FetchCityResponse fetchCity(FetchCityRequest request);
    @ApidocInterface("拉取省")
    FetchProvinceResponse fetchProvince(FetchProvinceRequest request);
}
