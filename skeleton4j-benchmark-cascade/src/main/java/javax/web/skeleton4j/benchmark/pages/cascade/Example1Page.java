package javax.web.skeleton4j.benchmark.pages.cascade;

import javax.web.skeleton4j.benchmark.interfaces.cascade.services.QueryService;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/7/26.
 */
@WebPage(displayName = "测试1",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(imports = {
                        @WebImport(displayName = "查询", gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = QueryService.class, value = "query")
                })
        }
)
public class Example1Page {
}
