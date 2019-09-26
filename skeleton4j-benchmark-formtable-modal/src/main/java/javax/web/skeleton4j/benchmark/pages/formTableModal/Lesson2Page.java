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
@WebPage(displayName = "表单模式（日期）",
        author = "rnkrsoft.com",
        priority = 2,
        namespaces = {
                @WebNamespace(
                        hints = "表单化表格->日期",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = ModalFormalTableService.class, value = "add2")
                        })
        }
)
public class Lesson2Page {
}
