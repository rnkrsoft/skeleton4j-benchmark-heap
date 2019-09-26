package javax.web.skeleton4j.benchmark.pages.query;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.query.services.QueryService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/13.
 */
@WebPage(displayName = "简单分页查询",
        priority = 1,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "分页查询->简单分页查询",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = QueryService.class, value = "query1")
                        })
        }
)
public class Lesson1Page {
}
