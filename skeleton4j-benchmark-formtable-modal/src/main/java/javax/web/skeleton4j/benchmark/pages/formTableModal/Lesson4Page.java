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
@WebPage(displayName = "表单模式（树图选择框）",
        author = "rnkrsoft.com",
        priority = 4,
        namespaces = {
                @WebNamespace(
                        hints = "表单化表格->树图选择框",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = ModalFormalTableService.class, value = "add4")
                        })
        }
)
public class Lesson4Page {
}
