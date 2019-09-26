package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View4Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;


    @ApidocElement(value = "单选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false)
    String select1;

    @ApidocElement(value = "单选2", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = false)
    String select2;

    @ApidocElement(value = "单选3", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = false)
    String select3;

    @ApidocElement(value = "单选4", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true)
    String select4;

    @ApidocElement(value = "单选5", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    String select5;

    @ApidocElement(value = "单选6", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, defaults = "002", required = true)
    String select6;

}
