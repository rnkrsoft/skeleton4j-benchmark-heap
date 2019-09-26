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
@WebPage(displayName = "工具栏操作应答仅一个文本字段",
        priority = 2,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "一个文本字段",
                        imports = {
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = MessageBoxService.class, value = "getSysdateString")
                        })
        }
)
public class Lesson2Page {
}
