package javax.web.skeleton4j.benchmark.interfaces.writeable.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.writeable.domains.*;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@ApidocService("编辑查看服务")
public interface ToUpdateService {
    @ApidocInterface("查看1")
    ToUpdate1Response toUpdate1(ToUpdateRequest request);

    @ApidocInterface("查看2")
    ToUpdate2Response toUpdate2(ToUpdateRequest request);

    @ApidocInterface("查看3")
    ToUpdate3Response toUpdate3(ToUpdateRequest request);

    @ApidocInterface("查看4")
    ToUpdate4Response toUpdate4(ToUpdateRequest request);

    @ApidocInterface("查看5")
    ToUpdate5Response toUpdate5(ToUpdateRequest request);

    @ApidocInterface("查看6")
    ToUpdate6Response toUpdate6(ToUpdateRequest request);

    @ApidocInterface("查看7")
    ToUpdate7Response toUpdate7(ToUpdateRequest request);

    @ApidocInterface("查看8")
    ToUpdate8Response toUpdate8(ToUpdateRequest request);

    @ApidocInterface("查看9")
    ToUpdate9Response toUpdate9(ToUpdateRequest request);

    @ApidocInterface("查看10")
    ToUpdate10Response toUpdate10(ToUpdateRequest request);

    @ApidocInterface("查看11")
    ToUpdate11Response toUpdate11(ToUpdateRequest request);

    @ApidocInterface("查看12")
    ToUpdate12Response toUpdate12(ToUpdateRequest request);

    @ApidocInterface("查看13")
    ToUpdate13Response toUpdate13(ToUpdateRequest request);

    @ApidocInterface("查看14")
    ToUpdate14Response toUpdate14(ToUpdateRequest request);

    @ApidocInterface("查看17")
    ToUpdate17Response toUpdate17(ToUpdateRequest request);

    @ApidocInterface("查看18")
    ToUpdate18Response toUpdate18(ToUpdateRequest request);

    @ApidocInterface("查看20")
    ToUpdate20Response toUpdate20(ToUpdateRequest request);

    @ApidocInterface("查看20_2")
    ToUpdate20_2Response toUpdate20_2(ToUpdateRequest request);

    @ApidocInterface("查看21")
    ToUpdate21Response toUpdate21(ToUpdateRequest request);
}
