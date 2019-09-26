package javax.web.skeleton4j.benchmark.interfaces.group.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@Data
public class Add3GroupRequest implements Serializable{
    @ApidocElement(value = "组合框", valueDisplayType = ValueDisplayType.GROUP)
    Add3GroupRecord record;
}
