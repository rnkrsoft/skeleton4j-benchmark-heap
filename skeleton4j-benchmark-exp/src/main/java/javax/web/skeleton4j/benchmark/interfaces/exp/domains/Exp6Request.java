package javax.web.skeleton4j.benchmark.interfaces.exp.domains;

import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

@Data
public class Exp6Request implements Serializable {
    @ApidocElement(value = "数据类型", placeholder = "请输入在文本框输入数据类型", required = false, enumClass = ExportType.class, valueDisplayType = ValueDisplayType.SELECTION, defaults = "000")
    String type;
}
