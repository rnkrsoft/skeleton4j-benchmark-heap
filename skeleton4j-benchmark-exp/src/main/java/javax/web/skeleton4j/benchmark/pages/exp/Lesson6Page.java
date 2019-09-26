package javax.web.skeleton4j.benchmark.pages.exp;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.exp.services.ExpService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 6,
        displayName = "导出枚举类型的文件",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "导出->导出枚举类型的文件",
                        imports = {
                                @WebImport(displayName = "导出", confirm = false, gui = WebGui.MODEL, mode = WebMode.EXPORT, serviceClass = ExpService.class, value = "exp6")
                        }
                )
        }
)
public class Lesson6Page {
}
