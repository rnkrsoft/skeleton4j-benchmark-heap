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
@WebPage(displayName = "表单模式（复杂）",
        author = "rnkrsoft.com",
        priority = 7,
        namespaces = {
                @WebNamespace(
                        hints = "表单模式->复杂",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = FormalTableService.class, value = "add13")
                        })
        }
)
public class Lesson7Page {
}
