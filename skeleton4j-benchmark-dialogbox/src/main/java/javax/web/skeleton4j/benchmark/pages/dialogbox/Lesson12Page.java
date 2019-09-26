package javax.web.skeleton4j.benchmark.pages.dialogbox;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.dialogbox.services.DialogBoxService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/3/30.
 */
@WebPage(displayName = "一个文件字段",
        priority = 12,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "一个相册字段",
                        imports = {
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = DialogBoxService.class, value = "getFile"),
                                @WebImport(gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = DialogBoxService.class, value = "getFiles")

                        })
        }
)
public class Lesson12Page {
}
