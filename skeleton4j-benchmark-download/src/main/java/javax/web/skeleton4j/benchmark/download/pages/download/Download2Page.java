package javax.web.skeleton4j.benchmark.download.pages.download;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.benchmark.download.interfaces.services.DownloadService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/9/2.
 * 下载文件接口需要输入一些字段，输入的字段来自请求对象中定义的入参
 */
@WebPage(displayName = "下载2",
        priority = 2,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        hints = "下载2",
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.DOWNLOAD, serviceClass = DownloadService.class, value = "download1")

                        })
        }
)
public class Download2Page {
}
