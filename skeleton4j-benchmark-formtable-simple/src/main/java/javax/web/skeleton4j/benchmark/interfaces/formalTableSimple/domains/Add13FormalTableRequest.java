package javax.web.skeleton4j.benchmark.interfaces.formalTableSimple.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@Data
public class Add13FormalTableRequest implements Serializable{
    @ApidocElement(value = "表单记录1", extras = "formStyle:form")
    final List<Add1FormalTableRecord> tableRecords1 = new ArrayList<Add1FormalTableRecord>();
    @ApidocElement(value = "表单记录2", extras = "formStyle:form")
    final List<Add2FormalTableRecord> tableRecords2 = new ArrayList<Add2FormalTableRecord>();
    @ApidocElement(value = "表单记录3", extras = "formStyle:form")
    final List<Add3FormalTableRecord> tableRecords3 = new ArrayList<Add3FormalTableRecord>();
    @ApidocElement(value = "表单记录4", extras = "formStyle:form")
    final List<Add4FormalTableRecord> tableRecords4 = new ArrayList<Add4FormalTableRecord>();
    @ApidocElement(value = "表单记录5", extras = "formStyle:form")
    final List<Add5FormalTableRecord> tableRecords5 = new ArrayList<Add5FormalTableRecord>();
    @ApidocElement(value = "表单记录6", extras = "formStyle:form")
    final List<Add6FormalTableRecord> tableRecords6 = new ArrayList<Add6FormalTableRecord>();
}
