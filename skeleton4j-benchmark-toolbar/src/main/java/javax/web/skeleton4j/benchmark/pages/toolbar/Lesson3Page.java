package javax.web.skeleton4j.benchmark.pages.toolbar;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.TextService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 3,
        displayName = "对话框（文本框）",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "工具栏->对话框（文本框）",
                        imports = {
                                @WebImport(displayName = "只读查看", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = TextService.class, value = "add1Text"),
                                @WebImport(displayName = "新增（默认值）", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = TextService.class, value = "add2Text"),
                                @WebImport(displayName = "新增（无默认值）", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = TextService.class, value = "add3Text")
                        })
        }
)
public class Lesson3Page {
}
