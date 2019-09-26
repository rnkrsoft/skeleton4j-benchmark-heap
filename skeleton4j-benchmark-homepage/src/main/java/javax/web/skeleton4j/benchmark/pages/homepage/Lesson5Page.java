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
@WebPage(displayName = "下拉列表多选（本地数据源）",
        author = "rnkrsoft.com",
        priority = 5,
        namespaces = {
                @WebNamespace(
                        hints = "主界面->下拉列表多选（本地数据源）",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = AddService.class, value = "add5")
                        })
        }
)
public class Lesson5Page {
}
