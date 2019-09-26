package javax.web.skeleton4j.benchmark.pages.formTableSimple;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.services.FormalTableService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@WebPage(displayName = "查询表单表格（图片）",
        author = "rnkrsoft.com",
        priority = 12,
        namespaces = {
                @WebNamespace(
                        hints = "查询表单表格（图片）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = FormalTableService.class, value = "query5")
                        })
        }
)
public class Lesson12Page {
}
