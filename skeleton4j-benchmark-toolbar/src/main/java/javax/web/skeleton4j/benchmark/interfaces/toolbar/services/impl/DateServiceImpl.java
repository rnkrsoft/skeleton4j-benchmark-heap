package javax.web.skeleton4j.benchmark.interfaces.toolbar.services.impl;

import com.rnkrsoft.time.DateStyle;
import com.rnkrsoft.utils.DateUtils;

import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.DateService;
import java.util.Date;

/**
 * Created by rnkrsoft.com on 2019/3/19.
 */
public class DateServiceImpl implements DateService {
    @Override
    public Add1DateResponse add1Date(Add1DateRequest request) {
        Add1DateResponse response = new Add1DateResponse();
        response.setDate1(DateUtils.toString(new Date(), DateStyle.DAY_FORMAT2));
        response.setDate2(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT3));
        response.setDate3(DateUtils.toString(new Date(), DateStyle.SECOND_FORMAT2));
        return response;
    }

    @Override
    public Add2DateResponse add2Date(Add2DateRequest request) {
        Add2DateResponse response = new Add2DateResponse();
        return response;
    }

    @Override
    public Add3DateResponse add3Date(Add3DateRequest request) {
        Add3DateResponse response = new Add3DateResponse();
        return response;
    }
}
