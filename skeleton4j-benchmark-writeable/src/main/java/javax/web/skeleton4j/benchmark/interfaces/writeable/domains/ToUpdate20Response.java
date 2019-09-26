package javax.web.skeleton4j.benchmark.interfaces.writeable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.WebDisplayType;
import javax.web.skeleton4j.annotation.WebCascadeInterface;
import javax.web.skeleton4j.annotation.WebResultDisplay;
import javax.web.skeleton4j.benchmark.interfaces.writeable.services.UpdateService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class ToUpdate20Response extends AbstractResponse{
    @ApidocElement(value = "流水号", unique = true, hidden = true, interfaces = {
            @WebCascadeInterface(serviceClass = UpdateService.class, value = "update20", displayName = "修改保存", resultDisplay = @WebResultDisplay(displayType = WebDisplayType.TARGET))
    })
    String serialNo;
    @ApidocElement(value = "表格1 可新增，可更新，可删除", required = false, extras = {"creatable:true","updatable:true","deletable:true"})
    final List<TableRecord> table1 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格2 不可新增，可更新，可删除", required = false, extras = {"creatable:false","updatable:true","deletable:true"})
    final List<TableRecord> table2 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格3 可新增，可更新，不可删除", required = false, extras = {"creatable:true","updatable:true","deletable:false"})
    final List<TableRecord> table3 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格4 可新增，不可更新，不可删除", required = false, extras = {"creatable:true","updatable:false","deletable:false"})
    final List<TableRecord> table4 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格5 不可新增，不可更新，可删除", required = false, extras = {"creatable:false","updatable:false","deletable:true"})
    final List<TableRecord> table5 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格6 不可新增，可更新，不可删除", required = false, extras = {"creatable:false","updatable:true","deletable:false"})
    final List<TableRecord> table6 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格7 可新增，不可更新，可删除", required = false, extras = {"creatable:true","updatable:false","deletable:true"})
    final List<TableRecord> table7 = new ArrayList<TableRecord>();

    @ApidocElement(value = "表格8 不可新增，不可更新，不可删除", required = false, extras = {"creatable:false","updatable:false","deletable:false"})
    final List<TableRecord> table8 = new ArrayList<TableRecord>();

}
