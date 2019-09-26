package javax.web.skeleton4j.benchmark.pages.menu;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.menu.service.StudentService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(displayName = "6.菜单（三级菜单）",
        author = "rnkrsoft.com",
        priority = 6,
        namespaces = {
                @WebNamespace(
                        hints = "主界面->菜单（三级菜单）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = StudentService.class, value = "query6")
                        })
        }
)
public class Lesson6Page {
}
