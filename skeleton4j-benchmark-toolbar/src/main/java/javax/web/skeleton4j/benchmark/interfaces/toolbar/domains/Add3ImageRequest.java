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
public class Add3ImageRequest implements Serializable {
    @ApidocElement(value = "图片类型1", placeholder = "演示无默认值", valueDisplayType = ValueDisplayType.IMAGE, required = false)
    String image1;

    @ApidocElement(value = "图片类型2", placeholder = "演示无默认值", valueDisplayType = ValueDisplayType.IMAGE, required = true)
    String image2;

    @ApidocElement(value = "相册1", placeholder = "演示无默认值", valueDisplayType = ValueDisplayType.IMAGE, required = false)
    final List<String> images1 = new ArrayList<String>();

    @ApidocElement(value = "相册2", placeholder = "演示无默认值", valueDisplayType = ValueDisplayType.IMAGE, required = true)
    final List<String> images2 = new ArrayList<String>();

    @ApidocElement(value = "相册3", placeholder = "演示无默认值", valueDisplayType = ValueDisplayType.IMAGE, required = false)
    final Set<String> images3 = new HashSet<String>();

    @ApidocElement(value = "相册4", placeholder = "演示无默认值", valueDisplayType = ValueDisplayType.IMAGE, required = true)
    final Set<String> images4 = new HashSet<String>();
}
