package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.CityEnum;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString(callSuper = true)
public class Add6AddressResponse extends AbstractResponse{
    @ApidocElement(value = "市1", enumClass = CityEnum.class)
    List<String> city1 = new ArrayList<String>();
    @ApidocElement(value = "市2", enumClass = CityEnum.class)
    List<String> city2 = new ArrayList<String>();
    @ApidocElement(value = "市3", enumClass = CityEnum.class)
    List<String> city3 = new ArrayList<String>();
    @ApidocElement(value = "市4", enumClass = CityEnum.class)
    Set<String> city4 = new HashSet<String>();
    @ApidocElement(value = "市5", enumClass = CityEnum.class)
    Set<String> city5 = new HashSet<String>();
    @ApidocElement(value = "市6", enumClass = CityEnum.class)
    Set<String> city6 = new HashSet<String>();
}
