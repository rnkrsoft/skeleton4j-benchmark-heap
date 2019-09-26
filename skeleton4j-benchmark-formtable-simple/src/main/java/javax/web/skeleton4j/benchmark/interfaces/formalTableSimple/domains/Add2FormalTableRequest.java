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
public class Add2FormalTableRequest implements Serializable{
    @ApidocElement(value = "表单记录", extras = "formStyle:form")
    final List<Add2FormalTableRecord> tableRecords = new ArrayList<Add2FormalTableRecord>();
}
