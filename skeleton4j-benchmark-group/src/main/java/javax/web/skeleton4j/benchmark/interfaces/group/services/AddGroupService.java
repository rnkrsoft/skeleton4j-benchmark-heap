package javax.web.skeleton4j.benchmark.interfaces.group.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.group.domains.*;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@ApidocService("组合框服务")
public interface AddGroupService {
    @ApidocInterface("组合框1")
    AddGroupResponse add1(Add1GroupRequest request);
    @ApidocInterface("组合框2")
    AddGroupResponse add2(Add2GroupRequest request);
    @ApidocInterface("组合框3")
    AddGroupResponse add3(Add3GroupRequest request);
    @ApidocInterface("组合框4")
    AddGroupResponse add4(Add4GroupRequest request);
    @ApidocInterface("组合框5")
    AddGroupResponse add5(Add5GroupRequest request);
    @ApidocInterface("组合框6")
    AddGroupResponse add6(Add6GroupRequest request);
    @ApidocInterface("组合框7")
    AddGroupResponse add7(Add7GroupRequest request);

}
