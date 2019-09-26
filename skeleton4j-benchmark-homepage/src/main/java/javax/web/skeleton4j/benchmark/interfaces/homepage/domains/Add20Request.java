package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add20Request implements Serializable {
    @ApidocElement(value = "表格1 可新增，可更新，可删除", required = false, extras = {"creatable:true","updatable:true","deletable:true"})
    final List<Table1Record> table1 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格2 不可新增，可更新，可删除", required = false, extras = {"creatable:false","updatable:true","deletable:true"})
    final List<Table1Record> table2 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格3 可新增，可更新，不可删除", required = false, extras = {"creatable:true","updatable:true","deletable:false"})
    final List<Table1Record> table3 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格4 可新增，不可更新，不可删除", required = false, extras = {"creatable:true","updatable:false","deletable:false"})
    final List<Table1Record> table4 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格5 不可新增，不可更新，可删除", required = false, extras = {"creatable:false","updatable:false","deletable:true"})
    final List<Table1Record> table5 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格6 不可新增，可更新，不可删除", required = false, extras = {"creatable:false","updatable:true","deletable:false"})
    final List<Table1Record> table6 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格7 可新增，不可更新，可删除", required = false, extras = {"creatable:true","updatable:false","deletable:true"})
    final List<Table1Record> table7 = new ArrayList<Table1Record>();

    @ApidocElement(value = "表格8 不可新增，不可更新，不可删除", required = false, extras = {"creatable:false","updatable:false","deletable:false"})
    final List<Table1Record> table8 = new ArrayList<Table1Record>();

}
