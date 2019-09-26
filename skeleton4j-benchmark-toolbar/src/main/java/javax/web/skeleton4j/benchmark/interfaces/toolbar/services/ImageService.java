package javax.web.skeleton4j.benchmark.interfaces.toolbar.services;

import javax.web.doc.annotation.ApidocInterface;
import javax.web.doc.annotation.ApidocService;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.domains.*;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@ApidocService("图片服务")
public interface ImageService {
    @ApidocInterface("增加图片1")
    Add1ImageResponse add1Image(Add1ImageRequest request);
    @ApidocInterface("增加图片2")
    Add2ImageResponse add2Image(Add2ImageRequest request);
    @ApidocInterface("增加图片3")
    Add3ImageResponse add3Image(Add3ImageRequest request);
}
