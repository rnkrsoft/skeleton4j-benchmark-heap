package javax.web.skeleton4j.benchmark.pages.toolbar;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.AreaService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 8,
        displayName = "对话框（下拉列表单选 远程数据源）",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "工具栏->对话框（下拉列表单选 远程数据源）",
                        imports = {
                                @WebImport(displayName = "只读查看", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = AreaService.class, value = "add1Area"),
                                @WebImport(displayName = "新增（默认值）",gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = AreaService.class, value = "add2Area"),
                                @WebImport(displayName = "新增（无默认值）",gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = AreaService.class, value = "add3Area")
                        })
        }
)
public class Lesson8Page {
}
