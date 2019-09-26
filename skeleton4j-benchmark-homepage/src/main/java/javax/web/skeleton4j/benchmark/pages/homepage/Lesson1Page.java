package javax.web.skeleton4j.benchmark.pages.homepage;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.benchmark.interfaces.homepage.services.AddService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;
import javax.web.skeleton4j.enums.WebParamType;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(displayName = "文本框",
        author = "rnkrsoft.com",
        priority = 1,
        namespaces = {
                @WebNamespace(
                        hints = "主界面->文本框",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = AddService.class, value = "add1")
                        })
        }
)
public class Lesson1Page {
}
