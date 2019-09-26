package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public class Add2ImageRequest implements Serializable {

    @ApidocElement(value = "图片类型3", placeholder = "演示图片类型3", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg")
    String image3;

    @ApidocElement(value = "图片类型4", placeholder = "演示图片类型4", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg")
    String image4;

    @ApidocElement(value = "相册1", placeholder = "演示图片1", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg")
    final List<String> images1 = new ArrayList<String>();

    @ApidocElement(value = "相册2", placeholder = "演示图片2", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg")
    final List<String> images2 = new ArrayList<String>();

    @ApidocElement(value = "相册3", placeholder = "演示图片3", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = {"/images/demo1.jpg","/images/demo2.jpg"})
    final List<String> images3 = new ArrayList<String>();

    @ApidocElement(value = "相册4", placeholder = "演示图片4", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = {"/images/demo1.jpg","/images/demo2.jpg"})
    final List<String> images4 = new ArrayList<String>();

    @ApidocElement(value = "相册5", placeholder = "演示图片5", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg")
    final Set<String> images5 = new HashSet<String>();

    @ApidocElement(value = "相册6", placeholder = "演示图片6", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg")
    final Set<String> images6 = new HashSet<String>();

    @ApidocElement(value = "相册7", placeholder = "演示图片7", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = {"/images/demo1.jpg","/images/demo2.jpg"})
    final Set<String> images7 = new HashSet<String>();

    @ApidocElement(value = "相册8", placeholder = "演示图片8", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = {"/images/demo1.jpg","/images/demo2.jpg"})
    final Set<String> images8 = new HashSet<String>();
}
