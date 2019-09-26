package javax.web.skeleton4j.benchmark.pages.toolbar;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.ComplexService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 19,
        displayName = "对话框（复杂）",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "工具栏->对话框（复杂）",
                        imports = {
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL,  serviceClass = ComplexService.class, value = "add19Complex1"),
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL,  serviceClass = ComplexService.class, value = "add19Complex2"),
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL,  serviceClass = ComplexService.class, value = "add19Complex3")
                        })
        }
)
public class Lesson19Page {
}
