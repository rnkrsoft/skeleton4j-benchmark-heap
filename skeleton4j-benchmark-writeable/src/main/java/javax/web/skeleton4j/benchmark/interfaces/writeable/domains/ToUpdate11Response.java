package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.enums.WebLayout;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.interfaces.writeable.services.UpdateService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class ToUpdate11Response extends AbstractResponse {
    @ApidocElement(value = "流水号", hidden = true, unique = true,
            interfaces = {
                    @WebCascadeInterface(serviceClass = UpdateService.class, value = "update11", displayName = "修改保存", resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
            }
    )
    String serialNo;


    @ApidocElement(value = "图片类型1", valueDisplayType = ValueDisplayType.IMAGE, required = false, layout = WebLayout.LINEAR)
    String image1;

    @ApidocElement(value = "图片类型2", valueDisplayType = ValueDisplayType.IMAGE, required = true, layout = WebLayout.LINEAR)
    String image2;

    @ApidocElement(value = "图片类型3", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg", layout = WebLayout.LINEAR)
    String image3;

    @ApidocElement(value = "图片类型4", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg", layout = WebLayout.LINEAR)
    String image4;

    @ApidocElement(value = "相册1", valueDisplayType = ValueDisplayType.IMAGE, required = false, layout = WebLayout.LINEAR)
    final List<String> images1 = new ArrayList<String>();

    @ApidocElement(value = "相册2", valueDisplayType = ValueDisplayType.IMAGE, required = true, layout = WebLayout.LINEAR)
    final List<String> images2 = new ArrayList<String>();

    @ApidocElement(value = "相册3", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = "/images/demo1.jpg", layout = WebLayout.LINEAR)
    final List<String> images3 = new ArrayList<String>();

    @ApidocElement(value = "相册4", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = "/images/demo1.jpg", layout = WebLayout.LINEAR)
    final List<String> images4 = new ArrayList<String>();

    @ApidocElement(value = "相册5", valueDisplayType = ValueDisplayType.IMAGE, required = false, defaults = {"/images/demo1.jpg", "/images/demo2.jpg"}, layout = WebLayout.LINEAR)
    final List<String> images5 = new ArrayList<String>();

    @ApidocElement(value = "相册6", valueDisplayType = ValueDisplayType.IMAGE, required = true, defaults = {"/images/demo1.jpg", "/images/demo2.jpg"}, layout = WebLayout.LINEAR)
    final List<String> images6 = new ArrayList<String>();
}
