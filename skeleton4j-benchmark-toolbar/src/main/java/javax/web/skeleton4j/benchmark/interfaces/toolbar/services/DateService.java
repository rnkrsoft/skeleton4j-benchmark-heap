package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("日期框服务")
public interface DateService {
    @ApidocInterface("增加日期1")
    Add1DateResponse add1Date(Add1DateRequest request);

    @ApidocInterface("增加日期2")
    Add2DateResponse add2Date(Add2DateRequest request);

    @ApidocInterface("增加日期3")
    Add3DateResponse add3Date(Add3DateRequest request);
}
