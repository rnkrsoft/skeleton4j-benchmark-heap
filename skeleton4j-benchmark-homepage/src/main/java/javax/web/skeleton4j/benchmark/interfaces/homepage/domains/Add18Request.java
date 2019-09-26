package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add18Request implements Serializable {
    @ApidocElement(value = "记录1", valueDisplayType = ValueDisplayType.GROUP)
    Group1Record record1;

    @ApidocElement(value = "记录2", valueDisplayType = ValueDisplayType.GROUP)
    Group2Record record2;
}
