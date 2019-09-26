package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.interfaces.homepage.enums.ProvinceEnum;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add4Request implements Serializable{

    @ApidocElement(value = "单选1", placeholder = "请输入单选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false)
    String select1;

    @ApidocElement(value = "单选2", placeholder = "请输入单选2", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = false)
    String select2;

    @ApidocElement(value = "单选3", placeholder = "请输入单选3", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = false)
    String select3;

    @ApidocElement(value = "单选4", placeholder = "请输入单选4", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true)
    String select4;

    @ApidocElement(value = "单选5", placeholder = "请输入单选5", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    String select5;

    @ApidocElement(value = "单选6", placeholder = "请输入单选6", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    String select6;
}
