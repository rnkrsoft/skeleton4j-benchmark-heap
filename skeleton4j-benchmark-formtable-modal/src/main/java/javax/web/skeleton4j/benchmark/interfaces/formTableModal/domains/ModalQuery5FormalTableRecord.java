package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.services.ModalViewFormalTableService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Builder
@Data
public class ModalQuery5FormalTableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT,  unique = true, maxLen = 36, placeholder = "演示文本", interfaces = {
            @WebCascadeInterface(serviceClass = ModalViewFormalTableService.class, value = "view5")
    })
    String serialNo;

    @ApidocElement(value = "图片1", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示", defaults = "/images/demo1.jpg")
    String image1;


    @ApidocElement(value = "图片2", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示")
    String image2;

    @ApidocElement(value = "相册1", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示", defaults = {"/images/demo1.jpg", "/images/demo2.jpg"})
    List<String> images1 = new ArrayList<String>();


    @ApidocElement(value = "相册2", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示")
    List<String> images2 = new ArrayList<String>();
}
