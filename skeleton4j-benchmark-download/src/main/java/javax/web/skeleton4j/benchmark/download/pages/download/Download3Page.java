package javax.web.skeleton4j.benchmark.download.pages.download;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.download.interfaces.services.DownloadService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
@WebPage(displayName = "下载3",
        priority = 3,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "下载3",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = DownloadService.class, value = "create2")

                        })
        }
)
public class Download3Page {
}
