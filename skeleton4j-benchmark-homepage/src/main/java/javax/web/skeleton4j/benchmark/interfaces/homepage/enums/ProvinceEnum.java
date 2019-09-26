package javax.web.skeleton4j.benchmark.interfaces.homepage.enums;

import com.rnkrsoft.interfaces.EnumStringCode;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public enum ProvinceEnum implements EnumStringCode{
    SI_CHUAN("001", "四川省"),
    HE_BEI("002", "河北省"),
    HE_NAN("003", "河南省"),
    NULL("000","未知");
    String code;
    String desc;

    ProvinceEnum(String code, String desc) {
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

    public static ProvinceEnum valueOfCode(String code){
        for (ProvinceEnum value : values()){
            if (value.getCode().equals(code)){
                return value;
            }
        }
        return NULL;
    }
}
