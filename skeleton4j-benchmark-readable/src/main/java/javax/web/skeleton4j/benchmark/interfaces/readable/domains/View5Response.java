package javax.web.skeleton4j.benchmark.interfaces.readable.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnkrsoft.com on 2018/12/15.
 */
@Data
public class View5Response extends AbstractResponse{
    @ApidocElement(value = "流水号", hidden = true)
    String serialNo;


    @ApidocElement(value = "多选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false)
    final List<String> select1 = new ArrayList<String>();

    @ApidocElement(value = "多选2", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false, defaults = "001")
    final List<String> select2 = new ArrayList<String>();

    @ApidocElement(value = "多选3", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false, defaults = {"001", "002"})
    final List<String> select3 = new ArrayList<String>();

    @ApidocElement(value = "多选4", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true)
    final List<String> select4 = new ArrayList<String>();

    @ApidocElement(value = "多选5", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true, defaults = "001")
    final List<String> select5 = new ArrayList<String>();

    @ApidocElement(value = "多选6", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true, defaults = {"001", "002"})
    final List<String> select6 = new ArrayList<String>();
}
