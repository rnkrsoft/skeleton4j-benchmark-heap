package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
public class Add1ImageResponse extends AbstractResponse{
    @ApidocElement(value = "图片类型1", placeholder = "演示图片类型1", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = true)
    String image1;

    @ApidocElement(value = "图片类型2", placeholder = "演示图片类型2", valueDisplayType = ValueDisplayType.IMAGE, required = true, readonly = true)
    String image2;

    @ApidocElement(value = "图片类型3", placeholder = "演示图片类型3", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg", readonly = true)
    String image3;

    @ApidocElement(value = "图片类型4", placeholder = "演示图片类型4", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg", readonly = true)
    String image4;

    @ApidocElement(value = "相册1", placeholder = "演示图片1", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = true)
    final List<String> images1 = new ArrayList<String>();

    @ApidocElement(value = "相册2", placeholder = "演示图片2", valueDisplayType = ValueDisplayType.IMAGE, required = true, readonly = true)
    final List<String> images2 = new ArrayList<String>();

    @ApidocElement(value = "相册3", placeholder = "演示图片3", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg", readonly = true)
    final List<String> images3 = new ArrayList<String>();

    @ApidocElement(value = "相册4", placeholder = "演示图片4", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg", readonly = true)
    final List<String> images4 = new ArrayList<String>();

    @ApidocElement(value = "相册5", placeholder = "演示图片5", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = {"/images/demo1.jpg","/images/demo2.jpg"}, readonly = true)
    final List<String> images5 = new ArrayList<String>();

    @ApidocElement(value = "相册6", placeholder = "演示图片6", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = {"/images/demo1.jpg","/images/demo2.jpg"}, readonly = true)
    final List<String> images6 = new ArrayList<String>();
}
