package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.CityEnum;
import javax.web.skeleton4j.enums.WebLayout;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString
public class Add5AddressRequest implements Serializable {
    @ApidocElement(value = "市1", enumClass = CityEnum.class)
    List<String> city1;
    @ApidocElement(value = "市2", enumClass = CityEnum.class, defaults = "023")
    List<String> city2;
    @ApidocElement(value = "市3", enumClass = CityEnum.class, defaults = {"023", "010"}, layout = WebLayout.LINEAR)
    List<String> city3;
    @ApidocElement(value = "市4", enumClass = CityEnum.class)
    Set<String> city4;
    @ApidocElement(value = "市5", enumClass = CityEnum.class, defaults = "023", layout = WebLayout.LINEAR)
    Set<String> city5;
    @ApidocElement(value = "市6", enumClass = CityEnum.class, defaults = {"023", "010"})
    Set<String> city6;
}
