package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("地址服务")
public interface AddressService {
    /**
     * 演示无交互请求，执行后对话框展示结果
     * @param request
     * @return
     */
    @ApidocInterface("单项选择1")
    Add1AddressResponse add1Address(Add1AddressRequest request);

    /**
     * 演示对话框接受请求数据，执行后消息框提示结果
     * @param request
     * @return
     */
    @ApidocInterface("单项选择2")
    Add2AddressResponse add2Address(Add2AddressRequest request);

    /**
     * 演示对话框接受请求数据，执行后对话框展示结果
     * @param request
     * @return
     */
    @ApidocInterface("单项选择3")
    Add3AddressResponse add3Address(Add3AddressRequest request);


    /**
     * 演示无交互请求，执行后对话框展示结果
     * @param request
     * @return
     */
    @ApidocInterface("多项选择1")
    Add4AddressResponse add4Address(Add4AddressRequest request);

    /**
     * 演示对话框接受请求数据，执行后消息框提示结果
     * @param request
     * @return
     */
    @ApidocInterface("多项选择2")
    Add5AddressResponse add5Address(Add5AddressRequest request);

    /**
     * 演示对话框接受请求数据，执行后对话框展示结果
     * @param request
     * @return
     */
    @ApidocInterface("多项选择3")
    Add6AddressResponse add6Address(Add6AddressRequest request);
}
