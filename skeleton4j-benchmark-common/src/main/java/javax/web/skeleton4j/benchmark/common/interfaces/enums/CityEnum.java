package javax.web.skeleton4j.benchmark.common.interfaces.enums;

import com.rnkrsoft.interfaces.EnumStringCode;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public enum  CityEnum implements EnumStringCode{
    BEI_JING("010", "北京"),
    CHONG_QING("023", "重庆"),
    CHENG_DU("028", "成都"),
    NULL("NULL","未知");
    String code;
    String desc;

    CityEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getCode() {
        return code;
    }

    public static CityEnum valueOfCode(String code){
        for (CityEnum value : values()){
            if (value.getCode().equals(code)){
                return value;
            }
        }
        return NULL;
    }
}
