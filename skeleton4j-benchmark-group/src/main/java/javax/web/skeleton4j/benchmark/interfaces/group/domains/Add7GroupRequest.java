package javax.web.skeleton4j.benchmark.interfaces.group.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/5/17.
 */
@Data
public class Add7GroupRequest implements Serializable{
    @ApidocElement(value = "组合框1", valueDisplayType = ValueDisplayType.GROUP)
    Add1GroupRecord record1;

    @ApidocElement(value = "组合框2", valueDisplayType = ValueDisplayType.GROUP)
    Add2GroupRecord record2;

    @ApidocElement(value = "组合框3", valueDisplayType = ValueDisplayType.GROUP)
    Add3GroupRecord record3;

    @ApidocElement(value = "组合框4", valueDisplayType = ValueDisplayType.GROUP)
    Add4GroupRecord record4;

    @ApidocElement(value = "组合框5", valueDisplayType = ValueDisplayType.GROUP)
    Add5GroupRecord record5;

    @ApidocElement(value = "组合框6", valueDisplayType = ValueDisplayType.GROUP)
    Add6GroupRecord record6;
}
