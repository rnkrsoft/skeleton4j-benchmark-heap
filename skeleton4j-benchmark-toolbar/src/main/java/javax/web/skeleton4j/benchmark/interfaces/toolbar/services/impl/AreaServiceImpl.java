package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.AreaService;

/**
 * Created by rnkrsoft.com on 2018/12/14.
 */
public class AreaServiceImpl implements AreaService {
    @Override
    public Add1AreaResponse add1Area(Add1AreaRequest request) {
        Add1AreaResponse response = new Add1AreaResponse();
        response.setType1("001");
        response.setType2("002");
        response.setType3("003");
        return response;
    }

    @Override
    public Add2AreaResponse add2Area(Add2AreaRequest request) {
        System.out.println(request);
        Add2AreaResponse response = new Add2AreaResponse();
        return response;
    }

    @Override
    public Add3AreaResponse add3Area(Add3AreaRequest request) {
        Add3AreaResponse response = new Add3AreaResponse();
        return response;
    }

    @Override
    public Add4AreaResponse add4Area(Add4AreaRequest request) {
        Add4AreaResponse response = new Add4AreaResponse();
        response.getType1().add("001");
        response.getType1().add("001");
        response.getType2().add("002");
        response.getType3().add("001");
        response.getType3().add("002");
        response.getType3().add("003");
        return response;
    }

    @Override
    public Add5AreaResponse add5Area(Add5AreaRequest request) {
        Add5AreaResponse response = new Add5AreaResponse();
        return response;
    }

    @Override
    public Add6AreaResponse add6Area(Add6AreaRequest request) {
        Add6AreaResponse response = new Add6AreaResponse();
        return response;
    }

    @Override
    public Add7AreaResponse add7Area(Add7AreaRequest request) {
        Add7AreaResponse response = new Add7AreaResponse();
        response.setType2("028");
        response.setType3("0828");
        return response;
    }

    @Override
    public Add8AreaResponse add8Area(Add8AreaRequest request) {
        System.out.println(request);
        Add8AreaResponse response = new Add8AreaResponse();
        return response;
    }

    @Override
    public Add9AreaResponse add9Area(Add9AreaRequest request) {
        System.out.println(request);
        Add9AreaResponse response = new Add9AreaResponse();
        return response;
    }

    @Override
    public Add10AreaResponse add10Area(Add10AreaRequest request) {
        Add10AreaResponse response = new Add10AreaResponse();
        response.getTypes2().add("028");
        response.getTypes3().add("028");
        response.getTypes3().add("0828");
        response.getTypes5().add("028");
        response.getTypes6().add("028");
        response.getTypes6().add("0828");
        return response;
    }

    @Override
    public Add11AreaResponse add11Area(Add11AreaRequest request) {
        System.out.println(request);
        Add11AreaResponse response = new Add11AreaResponse();
        return response;
    }

    @Override
    public Add12AreaResponse add12Area(Add12AreaRequest request) {
        System.out.println(request);
        Add12AreaResponse response = new Add12AreaResponse();
        return response;
    }
}
