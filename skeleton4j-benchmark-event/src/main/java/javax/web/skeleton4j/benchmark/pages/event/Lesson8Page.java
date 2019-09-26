package javax.web.skeleton4j.benchmark.pages.event;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.event.services.EventService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/5/11.
 */
@WebPage(displayName = "键盘按键被按下并松开事件",
        priority = 8,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = EventService.class, value = "eventKeyPress")

                        })
        }
)
public class Lesson8Page {
}
