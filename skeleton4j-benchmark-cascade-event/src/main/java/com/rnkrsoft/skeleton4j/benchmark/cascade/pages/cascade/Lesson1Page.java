package com.rnkrsoft.skeleton4j.benchmark.cascade.pages.cascade;

import javax.web.skeleton4j.annotation.WebImport;
import javax.web.skeleton4j.annotation.WebNamespace;
import javax.web.skeleton4j.annotation.WebPage;
import com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.services.CascadeService;
import javax.web.skeleton4j.enums.WebGui;
import javax.web.skeleton4j.enums.WebMode;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@WebPage(displayName = "级联文本框",
        priority = 1,
        author = "rnkrsoft.com",
        namespaces = {
                @WebNamespace(
                        imports = {
                                @WebImport(gui = WebGui.FORM, mode = WebMode.NORMAL, serviceClass = CascadeService.class, value = "cascadeText")

                        })
        }
)
public class Lesson1Page {
}
