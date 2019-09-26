package javax.web.skeleton4j.benchmark.interfaces.query.domains;

import lombok.Data;
import lombok.ToString;

import javax.web.doc.annotation.ApidocElement;
import javax.web.skeleton4j.benchmark.common.interfaces.enums.*;
import java.io.Serializable;

/**
 * Created by rnkrsoft.com on 2018/11/3.
 */
@Data
@ToString
public class Record1 implements Serializable {
    @ApidocElement(value = "序列号", unique = true, maxLen = 36)
    String serialNo;

    @ApidocElement(value = "年龄1", maxLen = 10)
    int age1;
    @ApidocElement(value = "年龄2", maxLen = 10)
    Integer age2;

    @ApidocElement(value = "省", enumClass = ProvinceEnum.class, maxLen = 12)
    String province;

    @ApidocElement(value = "市", enumClass = CityEnum.class, maxLen = 12)
    String city;

    @ApidocElement(value = "省2", enumClass = ProvinceEnum.class, maxLen = 12)
    String province2;
}
