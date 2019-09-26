package javax.web.skeleton4j.benchmark.interfaces.homepage.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.interfaces.homepage.enums.ProvinceEnum;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com n 2018/11/18.
 */
@Data
@ToString
public class Add5Request implements Serializable{

    @ApidocElement(value = "多选1", placeholder = "请输入多选1", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false)
    final List<String> select1 = new ArrayList<String>();

    @ApidocElement(value = "多选2", placeholder = "请输入多选2", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false, defaults = "001")
    final List<String> select2 = new ArrayList<String>();

    @ApidocElement(value = "多选3", placeholder = "请输入多选3", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false, defaults = {"001", "002"})
    final List<String> select3 = new ArrayList<String>();

    @ApidocElement(value = "多选4", placeholder = "请输入多选4", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true)
    final List<String> select4 = new ArrayList<String>();

    @ApidocElement(value = "多选5", placeholder = "请输入多选5", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true, defaults = "001")
    final List<String> select5 = new ArrayList<String>();

    @ApidocElement(value = "多选6", placeholder = "请输入多选6", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true, defaults = {"001", "002"})
    final List<String> select6 = new ArrayList<String>();

    @ApidocElement(value = "多选7", placeholder = "请输入多选7", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false)
    final Set<String> select7 = new HashSet<String>();

    @ApidocElement(value = "多选8", placeholder = "请输入多选8", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false, defaults = "001")
    final Set<String> select8 = new HashSet<String>();

    @ApidocElement(value = "多选9", placeholder = "请输入多选9", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = false, defaults = {"001", "002"})
    final Set<String> select9 = new HashSet<String>();

    @ApidocElement(value = "多选10", placeholder = "请输入多选10", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true)
    final Set<String> select10 = new HashSet<String>();

    @ApidocElement(value = "多选11", placeholder = "请输入多选11", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true, defaults = "001")
    final Set<String> select11= new HashSet<String>();

    @ApidocElement(value = "多选12", placeholder = "请输入多选12", valueDisplayType = ValueDisplayType.SELECTION, enumClass = ProvinceEnum.class, required = true, defaults = {"001", "002"})
    final Set<String> select12= new HashSet<String>();
}
