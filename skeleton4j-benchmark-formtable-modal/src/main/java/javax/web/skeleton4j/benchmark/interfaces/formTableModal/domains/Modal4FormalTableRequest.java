package javax.web.skeleton4j.benchmark.interfaces.formTableModal.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@Data
public class Modal4FormalTableRequest implements Serializable{
    @ApidocElement(value = "表单记录", extras = "formStyle:modal")
    final List<Add4FormalTableRecord> tableRecords = new ArrayList<Add4FormalTableRecord>();
}
