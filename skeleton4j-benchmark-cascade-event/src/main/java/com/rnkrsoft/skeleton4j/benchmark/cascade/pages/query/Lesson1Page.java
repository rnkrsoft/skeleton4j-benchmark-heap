package com.rnkrsoft.skeleton4j.benchmark.cascade.pages.query;

import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services.QueryService;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@WebPage(displayName = "查询",
        priority = 1,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = QueryService.class, value = "query1")

                        })
        }
)
public class Lesson1Page {
}
