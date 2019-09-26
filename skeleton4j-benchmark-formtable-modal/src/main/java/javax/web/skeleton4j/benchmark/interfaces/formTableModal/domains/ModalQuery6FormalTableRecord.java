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
public class ModalQuery6FormalTableRecord implements Serializable{
    @ApidocElement(value = "流水号", valueDisplayType = ValueDisplayType.TEXT, unique = true,maxLen = 36, placeholder = "演示文本", interfaces = {
            @WebCascadeInterface(serviceClass = ModalViewFormalTableService.class, value = "view6")
    })
    String serialNo;

    @ApidocElement(value = "文件1", valueDisplayType = ValueDisplayType.FILE, maxLen = 255, placeholder = "演示文件显示", defaults = "/images/demo1.jpg")
    String file1;


    @ApidocElement(value = "文件2", valueDisplayType = ValueDisplayType.FILE, maxLen = 255, placeholder = "演示文件显示")
    String file2;

    @ApidocElement(value = "文件集1", valueDisplayType = ValueDisplayType.FILE, maxLen = 255, placeholder = "演示文件显示", defaults = {"/images/demo1.jpg", "/images/demo2.jpg"})
    List<String> files1 = new ArrayList<String>();


    @ApidocElement(value = "文件集2", valueDisplayType = ValueDisplayType.FILE, maxLen = 255, placeholder = "演示文件显示")
    List<String> files2 = new ArrayList<String>();
}
