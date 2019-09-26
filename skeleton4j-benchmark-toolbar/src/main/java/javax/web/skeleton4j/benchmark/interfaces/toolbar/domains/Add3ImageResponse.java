package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public class Add3ImageResponse extends AbstractResponse{
    @ApidocElement(value = "图片1", valueDisplayType = ValueDisplayType.IMAGE)
    String image1;

    @ApidocElement(value = "图片2", valueDisplayType = ValueDisplayType.IMAGE)
    String image2;
}
