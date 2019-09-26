package javax.web.skeleton4j.benchmark.pages.msgbox;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.msgbox.services.MessageBoxService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@WebPage(displayName = "分页表格操作",
        priority = 3,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "一个整数字段",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = MessageBoxService.class, value = "queryTask")

                        })
        }
)
public class Lesson3Page {
}
