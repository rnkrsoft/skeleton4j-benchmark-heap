package javax.web.skeleton4j.benchmark.pages.toolbar;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.TextareaService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 16,
        displayName = "对话框（多行文本）",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "工具栏->对话框（多行文本）",
                        imports = {
                                @WebImport(displayName = "只读查看", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = TextareaService.class, value = "addTextarea1"),
                                @WebImport(displayName = "新增（默认值）",gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = TextareaService.class, value = "addTextarea2"),
                                @WebImport(displayName = "新增（无默认值）",gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = TextareaService.class, value = "addTextarea3")
                        })
        }
)
public class Lesson16Page {
}
