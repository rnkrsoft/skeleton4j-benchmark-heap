package javax.web.skeleton4j.benchmark.pages.resources;

import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.annotation.WebResource;

/**
 * Created by rnkrsoft.com on 2017/10/12.
 * 演示HTML静态页面
 */
@WebPage(
        //插件展示在系统的菜单名称
        displayName = "类路径加载静态资源1",
        //版本号，相同进入地址的只加载最高的版本
        version = "1.0.0",
        //开发人员
        author = "rnkrsoft.com",
        //导入一个静态资源
        resources = {
                @WebResource("classpath:javax.web.benchmark.demo.xxx.html")
        }
)
public class Lesson1Page {
}
