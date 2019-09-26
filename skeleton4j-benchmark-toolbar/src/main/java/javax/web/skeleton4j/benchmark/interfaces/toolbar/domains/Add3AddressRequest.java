package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.CityEnum;
import javax.web.skeleton4j.enums.WebLayout;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
@ToString
public class Add3AddressRequest implements Serializable{
    @ApidocElement(value = "市1", required = true, enumClass = CityEnum.class)
    String city1;
    @ApidocElement(value = "市2", required = true,layout = WebLayout.LINEAR, enumClass = CityEnum.class)
    String city2;
    @ApidocElement(value = "市3", required = true, enumClass = CityEnum.class)
    String city3;
}
