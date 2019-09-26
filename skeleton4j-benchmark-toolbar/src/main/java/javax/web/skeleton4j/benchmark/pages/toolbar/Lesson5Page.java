package javax.web.skeleton4j.benchmark.pages.toolbar;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.interfaces.toolbar.services.ImageService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@WebPage(priority = 5,
        displayName = "对话框（图片框）",
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "工具栏->对话框（图片框）",
                        imports = {
                                @WebImport(displayName = "只读查看", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = ImageService.class, value = "add1Image"),
                                @WebImport(displayName = "新增（默认值）",gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = ImageService.class, value = "add2Image"),
                                @WebImport(displayName = "新增（无默认值）", gui = WebGui.MODEL, mode = WebMode.NORMAL, serviceClass = ImageService.class, value = "add3Image")
                        })
        }
)
public class Lesson5Page {
}
