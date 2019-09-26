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
@WebPage(priority = 1,
        displayName = "无交互导出(无数据)",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "导出->无交互导出(无数据)",
                        imports = {
                                @WebImport(displayName = "导出(无确认)", confirm = false, gui = WebGui.MODEL, mode = WebMode.EXPORT, serviceClass = ExpService.class, value = "exp1=exp1"),
                                @WebImport(displayName = "导出(确认)", confirm = true, gui = WebGui.MODEL, mode = WebMode.EXPORT, serviceClass = ExpService.class, value = "exp2=exp1"),
                                @WebImport(displayName = "导出(确认，自定义确认信息)", confirm = true, confirmMessage = "导出空模板！", gui = WebGui.MODEL, mode = WebMode.EXPORT, serviceClass = ExpService.class, value = "exp3=exp1")
                        }
                )
        }
)
public class Lesson1Page {
}
