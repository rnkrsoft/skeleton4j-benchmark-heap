package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/18.
 */
@Data
@Builder
public class ModalView5FormalTable implements Serializable{
    @ApidocElement(value = "图片1", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示", defaults = "/images/demo1.jpg")
    String image1;


    @ApidocElement(value = "图片2", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示")
    String image2;

    @ApidocElement(value = "相册1", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示", defaults = {"/images/demo1.jpg", "/images/demo2.jpg"})
    List<String> images1 = new ArrayList<String>();


    @ApidocElement(value = "相册2", valueDisplayType = ValueDisplayType.IMAGE, maxLen = 255, placeholder = "演示图片显示")
    List<String> images2 = new ArrayList<String>();
}
