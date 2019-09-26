package javax.web.skeleton4j.benchmark.pages.formTableModal;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.formTableModal.services.ModalFormalTableService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@WebPage(displayName = "查询表单表格（字符串）",
        author = "rnkrsoft.com",
        priority = 8,
        namespaces = {
                @WebNamespace(
                        hints = "查询表单表格（字符串）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = ModalFormalTableService.class, value = "query1")
                        })
        }
)
public class Lesson8Page {
}
