package javax.web.skeleton4j.benchmark.interfaces.toolbar.domains;

import lombok.Data;

import javax.web.doc.AbstractResponse;
import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.CityEnum;
import javax.web.skeleton4j.enums.WebLayout;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
@Data
public class Add1AddressResponse extends AbstractResponse{
    @ApidocElement(value = "市1", enumClass = CityEnum.class, readonly = true)
    String city1;
    @ApidocElement(value = "市2", enumClass = CityEnum.class,layout = WebLayout.LINEAR, defaults = "023", readonly = true)
    String city2;
    @ApidocElement(value = "市3", enumClass = CityEnum.class, defaults = "028", readonly = true)
    String city3;
}
