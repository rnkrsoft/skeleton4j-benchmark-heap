package javax.web.skeleton4j.benchmark.pages.exp;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.exp.services.ExpService;
import javax.web.skeleton4j.benchmark.interfaces.exp.services.QueryService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 5,
        displayName = "从条件传递导出",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "导出->从条件传递导出",
                        imports = {
                                @WebImport(displayName = "查询", confirm = false, gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = QueryService.class, value = "query"),
                                @WebImport(displayName = "导出", confirm = false, gui = WebGui.MODEL, mode = WebMode.EXPORT, serviceClass = ExpService.class, value = "exp5")
                        })
        }
)
public class Lesson5Page {
}
