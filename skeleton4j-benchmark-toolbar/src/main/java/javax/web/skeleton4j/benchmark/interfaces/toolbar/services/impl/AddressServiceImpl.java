package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.common.interfaces.enums.CityEnum;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.AddressService;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class AddressServiceImpl implements AddressService {
    @Override
    public Add1AddressResponse add1Address(Add1AddressRequest request) {
        Add1AddressResponse response = new Add1AddressResponse();
        response.setCity1(CityEnum.values()[0].getCode());
        response.setCity2(CityEnum.values()[1].getCode());
        response.setCity3(CityEnum.values()[2].getCode());
        return response;
    }

    @Override
    public Add2AddressResponse add2Address(Add2AddressRequest request) {
        System.out.println(request);
        Add2AddressResponse response = new Add2AddressResponse();
        return response;
    }

    @Override
    public Add3AddressResponse add3Address(Add3AddressRequest request) {
        Add3AddressResponse response = new Add3AddressResponse();
        response.setCity1(CityEnum.values()[0].getCode());
        response.setCity2(CityEnum.values()[1].getCode());
        response.setCity3(CityEnum.values()[2].getCode());
        return response;
    }

    @Override
    public Add4AddressResponse add4Address(Add4AddressRequest request) {
        Add4AddressResponse response = new Add4AddressResponse();
        response.getCity1().add(CityEnum.values()[0].getCode());
        response.getCity2().add(CityEnum.values()[0].getCode());
        response.getCity2().add(CityEnum.values()[1].getCode());
        response.getCity3().add(CityEnum.values()[0].getCode());
        response.getCity3().add(CityEnum.values()[1].getCode());
        response.getCity3().add(CityEnum.values()[2].getCode());
        return response;
    }

    @Override
    public Add5AddressResponse add5Address(Add5AddressRequest request) {
        Add5AddressResponse response = new Add5AddressResponse();
        return response;
    }

    @Override
    public Add6AddressResponse add6Address(Add6AddressRequest request) {
        Add6AddressResponse response = new Add6AddressResponse();
        response.getCity1().add(CityEnum.values()[0].getCode());
        response.getCity2().add(CityEnum.values()[0].getCode());
        response.getCity2().add(CityEnum.values()[1].getCode());
        response.getCity3().add(CityEnum.values()[0].getCode());
        response.getCity3().add(CityEnum.values()[1].getCode());
        response.getCity3().add(CityEnum.values()[2].getCode());
        return response;
    }
}
