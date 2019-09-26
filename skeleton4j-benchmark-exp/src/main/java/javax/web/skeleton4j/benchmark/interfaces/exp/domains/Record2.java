package javax.web.skeleton4j.benchmark.interfaces.exp.domains;

import lombok.Builder;
import lombok.Data;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import javax.web.skeleton4j.benchmark.common.interfaces.services.*;
import javax.web.skeleton4j.enums.ValueDisplayType;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
@Data
@Builder
public class Record2 implements Serializable{
    @ApidocElement(value = "省", enumClass = ProvinceEnum.class)
    String province;

    @ApidocElement(value = "城市", enumClass = CityEnum.class)
    String city;

    @ApidocElement(value = "日期1", valueDisplayType = ValueDisplayType.DATE)
    String date1;
}
