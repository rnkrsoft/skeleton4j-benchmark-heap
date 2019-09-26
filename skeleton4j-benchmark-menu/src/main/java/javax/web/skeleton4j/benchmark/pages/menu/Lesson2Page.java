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
@WebPage(displayName = "2.菜单（二级菜单）",
        author = "rnkrsoft.com",
        priority = 2,
        namespaces = {
                @WebNamespace(
                        hints = "查询操作->菜单（二级菜单）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = StudentService.class, value = "query2")
                        })
        }
)
public class Lesson2Page {
}
