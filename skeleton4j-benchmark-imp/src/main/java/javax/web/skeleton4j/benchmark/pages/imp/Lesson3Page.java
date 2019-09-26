package javax.web.skeleton4j.benchmark.pages.imp;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.imp.services.ExpService;
import javax.web.skeleton4j.benchmark.interfaces.imp.services.ImpService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 3,
        displayName = "无条件导入(复杂)",
        author = "rnkrsoft.com",
        icon = "fa-calculator",
        namespaces = {
                @WebNamespace(
                        hints = "导入->无条件导入(复杂)",
                        imports = {
                                @WebImport(displayName = "下载模板", confirm = true, confirmMessage = "下载生成的模板，用于导入功能", gui = WebGui.MODEL, mode = WebMode.EXPORT, serviceClass = ExpService.class, value = "exp3"),
                                @WebImport(displayName = "导入", confirm = false, gui = WebGui.MODEL, mode = WebMode.IMPORT, serviceClass = ImpService.class, value = "imp3")
                        }
                )
        }
)
public class Lesson3Page {
}
