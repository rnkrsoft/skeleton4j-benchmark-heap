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
@WebPage(displayName = "工具栏操作1",
        priority = 1,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "应答无字段",
                        imports = {
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = MessageBoxService.class, value = "enabledProject"),
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = MessageBoxService.class, value = "disabledProject")
                        })
        }
)
public class Lesson1Page {
}
