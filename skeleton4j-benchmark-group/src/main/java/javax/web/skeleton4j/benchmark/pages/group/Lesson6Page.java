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
@WebPage(displayName = "文件",
        author = "rnkrsoft.com",
        priority = 6,
        namespaces = {
                @WebNamespace(
                        hints = "组合框->组合框6",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = AddGroupService.class, value = "add6"),
                        })
        }
)
public class Lesson6Page {
}
