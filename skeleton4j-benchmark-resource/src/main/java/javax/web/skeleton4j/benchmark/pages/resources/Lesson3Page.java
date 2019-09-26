package javax.web.skeleton4j.benchmark.pages.resources;

import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.annotation.WebResource;

/**
 * Created by rnkrsoft.com on 2017/10/12.
 * 演示JSP页面
 */
@WebPage(
        displayName = "地址路径访问静态资源",
        //版本号，相同进入地址的只加载最高的版本
        version = "1.0.0",
        //开发人员
        author = "rnkrsoft.com",
        //导入一个静态资源
        resources = {
                @WebResource("/javax/web/skeleton4j/benchmark/demo/xxx.htm")
        }
)
public class Lesson3Page {
}
