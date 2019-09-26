package javax.web.skeleton4j.benchmark.pages.homepage;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.homepage.services.AddService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(displayName = "组合框",
        author = "rnkrsoft.com",
        priority = 19,
        namespaces = {
                @WebNamespace(
                        hints = "主界面->组合框",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = AddService.class, value = "add18")
                        })
        }
)
public class Lesson18Page {
}
