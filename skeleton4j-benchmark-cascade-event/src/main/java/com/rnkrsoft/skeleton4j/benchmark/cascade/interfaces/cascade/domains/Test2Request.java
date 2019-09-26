package com.rnkrsoft.skeleton4j.benchmark.cascade.interfaces.cascade.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/8.
 */
@Data
public class Test2Request implements Serializable{
    @ApidocElement(value = "类型", unique = true)
    String type;

    @ApidocElement("性别")
    String sex;
}
