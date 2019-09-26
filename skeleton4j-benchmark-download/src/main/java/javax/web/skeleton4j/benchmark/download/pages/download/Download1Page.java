package javax.web.skeleton4j.benchmark.download.pages.download;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.annotation.WebParam;
import javax.web.skeleton4j.benchmark.download.interfaces.services.DownloadService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 */
@WebPage(displayName = "下载1",
        priority = 1,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "下载1",
                        imports = {
                                @WebImport(gui = WebGui.MODEL,
                                        mode = WebMode.DOWNLOAD,
                                        serviceClass = DownloadService.class,
                                        value = "download1",
                                        params = {
                                                @WebParam(name = "serialNo", value = "123456")
                                        },
                                        confirm = true,
                                        confirmMessage = "请确认是否要下载文件"
                                )
                        })
        }
)
public class Download1Page {
}
