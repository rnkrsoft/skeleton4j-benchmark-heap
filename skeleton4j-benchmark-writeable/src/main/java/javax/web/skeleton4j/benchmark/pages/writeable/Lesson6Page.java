package javax.web.skeleton4j.benchmark.pages.writeable;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.writeable.services.QueryService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/13.
 */
@WebPage(displayName = "编辑对话框（下拉列表单选 远程数据源）",
        priority = 6,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "分页查询->编辑对话框（下拉列表单选 远程数据源）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.QUERY, serviceClass = QueryService.class, value = "query6")
                        })
        }
)
public class Lesson6Page {
}
