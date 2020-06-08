package com.wy.procurement.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public enum StatusEnum {
    YITIJIAO(0,"已提交"),
    DAIQUEREN(1,"待确认"),
    DAICHUANSHU(2,"待传输")
    ;


    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @EnumValue
    private Integer code;
    private String msg;
}
