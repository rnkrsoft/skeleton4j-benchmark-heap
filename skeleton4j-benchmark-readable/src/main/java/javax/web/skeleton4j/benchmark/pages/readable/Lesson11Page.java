package javax.web.skeleton4j.benchmark.pages.readable;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.readable.services.QueryService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/13.
 */
@WebPage(displayName = "只读对话框（图片框）",
        priority = 11,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "分页查询->只读对话框（图片框）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = QueryService.class, value = "query11")
                        })
        }
)
public class Lesson11Page {
}
