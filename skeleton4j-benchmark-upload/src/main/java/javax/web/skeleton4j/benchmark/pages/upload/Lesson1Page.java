package javax.web.skeleton4j.benchmark.pages.upload;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.annotation.WebResource;
import javax.web.skeleton4j.benchmark.interfaces.upload.services.UploadFileService;
import javax.web.skeleton4j.enums.WebGui;

/**
 * Created by rnkrsoft.com on 2019/7/11.
 */
@WebPage(
        //插件展示在系统的菜单名称
        displayName = "上传文件1",
        //版本号，相同进入地址的只加载最高的版本
        version = "1.0.0",
        //开发人员
        author = "rnkrsoft.com",
        //导入一个静态资源
        resources = {
                @WebResource("classpath:javax.web.benchmark.upload.upload1.html")
        },
        namespaces = {
                @WebNamespace(imports = {
                        @WebImport(gui = WebGui.NONE, serviceClass = UploadFileService.class, value = "upload1")
                })
        }
)
public class Lesson1Page {
}
