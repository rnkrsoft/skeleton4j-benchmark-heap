package javax.web.skeleton4j.benchmark.common.interfaces.enums;

import com.rnkrsoft.interfaces.EnumStringCode;

/**
 * Created by rnkrsoft.com on 2019/3/21.
 */
public enum ExportType implements EnumStringCode {
    ORDER("001", "订单数据"),
    PAY("002", "支付数据"),
    ALL("000", "全部数据");
    String code;
    String desc;

    ExportType(String code, String desc) {
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

    public static ExportType valueOfCode(String code) {
        for (ExportType value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return ALL;
    }
}
