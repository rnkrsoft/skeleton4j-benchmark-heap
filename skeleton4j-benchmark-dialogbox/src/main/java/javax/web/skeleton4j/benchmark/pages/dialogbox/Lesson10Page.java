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
@WebPage(displayName = "一个模糊搜索字段",
        priority = 10,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "一个模糊搜索字段",
                        imports = {

                        })
        }
)
public class Lesson10Page {
}
