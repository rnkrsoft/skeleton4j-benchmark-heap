package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add11Request implements Serializable {
    @ApidocElement(value = "图片类型1", placeholder = "演示图片类型1", valueDisplayType = ValueDisplayType.IMAGE, required = false, extras = "supportedType:png")
    String image1;

    @ApidocElement(value = "图片类型2", placeholder = "演示图片类型2", valueDisplayType = ValueDisplayType.IMAGE, required = true, extras = "supportedType:jpg")
    String image2;

    @ApidocElement(value = "图片类型3", placeholder = "演示图片类型3", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = true, defaults = "/images/demo1.jpg")
    String image3;

    @ApidocElement(value = "图片类型4", placeholder = "演示图片类型4", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = false, defaults = "/images/demo2.jpg")
    String image4;

    @ApidocElement(value = "图片类型5", placeholder = "演示图片类型5", valueDisplayType = ValueDisplayType.IMAGE, required = true, readonly = true, defaults = "/images/demo1.jpg")
    String image5;

    @ApidocElement(value = "图片类型6", placeholder = "演示图片类型6", valueDisplayType = ValueDisplayType.IMAGE, required = true, readonly = false, defaults = "/images/demo2.jpg")
    String image6;

    @ApidocElement(value = "相册1", placeholder = "演示图片1", valueDisplayType = ValueDisplayType.IMAGE, required = false)
    final List<String> images1 = new ArrayList<String>();

    @ApidocElement(value = "相册2", placeholder = "演示图片2", valueDisplayType = ValueDisplayType.IMAGE, required = true)
    final List<String> images2 = new ArrayList<String>();

    @ApidocElement(value = "相册3", placeholder = "演示图片3", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = false, defaults = "/images/demo1.jpg")
    final List<String> images3 = new ArrayList<String>();

    @ApidocElement(value = "相册4", placeholder = "演示图片4", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = false, defaults = "/images/demo2.jpg")
    final List<String> images4 = new ArrayList<String>();

    @ApidocElement(value = "相册5", placeholder = "演示图片5", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = true, defaults = "/images/demo2.jpg")
    final List<String> images5 = new ArrayList<String>();

    @ApidocElement(value = "相册6", placeholder = "演示图片6", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = true, defaults = "/images/demo1.jpg")
    final List<String> images6 = new ArrayList<String>();

    @ApidocElement(value = "相册7", placeholder = "演示图片7", valueDisplayType = ValueDisplayType.IMAGE, required = false, readonly = true, defaults = {"/images/demo1.jpg","/images/demo2.jpg"})
    final List<String> images7 = new ArrayList<String>();

    @ApidocElement(value = "相册8", placeholder = "演示图片8", valueDisplayType = ValueDisplayType.IMAGE, required = true, readonly = false, defaults = {"/images/demo1.jpg","/images/demo2.jpg"})
    final List<String> images8 = new ArrayList<String>();
}
