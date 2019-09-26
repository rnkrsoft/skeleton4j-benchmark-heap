package javax.web.skeleton4j.benchmark.pages.group;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.group.services.AddGroupService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@WebPage(displayName = "文本框",
        author = "rnkrsoft.com",
        priority = 1,
        namespaces = {
                @WebNamespace(
                        hints = "组合框->组合框1",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = AddGroupService.class, value = "add1"),
                        })
        }
)
public class Lesson1Page {
}
