package javax.web.skeleton4j.benchmark.common.interfaces.enums;

import com.rnkrsoft.interfaces.EnumStringCode;

/**
 * Created by rnkrsoft.com on 2018/11/18.
 */
public enum DistrictEnum implements EnumStringCode{
    JIU_LONG_PO("0001", "九龙坡"),
    YU_ZHONG("0002", "渝中"),
    SHA_PING_BA("0003", "沙坪坝");
    String code;
    String desc;

    DistrictEnum(String code, String desc) {
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

    public static DistrictEnum valueOfCode(String code){
        for (DistrictEnum value : values()){
            if (value.getCode().equals(code)){
                return value;
            }
        }
        throw new IllegalArgumentException("无效编码");
    }
}
