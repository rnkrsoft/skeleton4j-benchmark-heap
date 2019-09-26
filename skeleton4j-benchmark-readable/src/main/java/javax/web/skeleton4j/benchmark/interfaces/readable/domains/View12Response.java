package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import javax.web.skeleton4j.enums.WebLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View12Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;

    @ApidocElement(value = "文件1", valueDisplayType = ValueDisplayType.FILE, required = false, layout = WebLayout.LINEAR)
    String file1;

    @ApidocElement(value = "文件2", valueDisplayType = ValueDisplayType.FILE, required = true, layout = WebLayout.LINEAR)
    String file2;

    @ApidocElement(value = "文件3", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = false, defaults = "/files/demo3.doc")
    String file3;

    @ApidocElement(value = "文件4", valueDisplayType = ValueDisplayType.FILE, required = true, readonly = false, defaults = "/files/demo4.doc")
    String file4;

    @ApidocElement(value = "文件5", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = true, defaults = "/files/demo1.doc")
    String file5;

    @ApidocElement(value = "文件6", valueDisplayType = ValueDisplayType.FILE, required = true, readonly = true, defaults = "/files/demo2.doc")
    String file6;

    @ApidocElement(value = "文件集1", valueDisplayType = ValueDisplayType.FILE, required = false, layout = WebLayout.LINEAR)
    final List<String> files1 = new ArrayList<String>();

    @ApidocElement(value = "文件集2", valueDisplayType = ValueDisplayType.FILE, required = true, layout = WebLayout.LINEAR)
    final List<String> files2 = new ArrayList<String>();

    @ApidocElement(value = "文件集3", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = false, defaults = "/files/demo3.doc", layout = WebLayout.LINEAR)
    final List<String> files3 = new ArrayList<String>();

    @ApidocElement(value = "文件集4", valueDisplayType = ValueDisplayType.FILE, required = true, readonly = false, defaults = "/files/demo4.doc", layout = WebLayout.LINEAR)
    final List<String> files4 = new ArrayList<String>();

    @ApidocElement(value = "文件集5", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = true, defaults = "/files/demo1.doc", layout = WebLayout.LINEAR)
    final List<String> files5 = new ArrayList<String>();

    @ApidocElement(value = "文件集6", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = true, defaults = "/files/demo2.doc")
    final List<String> files6 = new ArrayList<String>();

    @ApidocElement(value = "文件集7", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = true, defaults = {"/files/demo1.doc", "/files/demo2.doc"})
    final List<String> files7 = new ArrayList<String>();

    @ApidocElement(value = "文件集8", valueDisplayType = ValueDisplayType.FILE, required = false, readonly = true, defaults = {"/files/demo2.doc", "/files/demo4.doc"})
    final List<String> files8 = new ArrayList<String>();
}
