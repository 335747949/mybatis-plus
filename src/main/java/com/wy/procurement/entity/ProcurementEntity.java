package com.wy.procurement.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wy.procurement.enums.StatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
@Data
@TableName(value = "procurement_particulars")
public class ProcurementEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)   // **默认为雪花算法
    private Integer id;

    //采购计划流水号
    private String procurementSerialNumber;

    //采购品种数量
    private Integer procurementVarietyNumber;

    //药店名称
    private String drugstoreName;

    //采购人
    private String username;

    //采购时间
    private Date date;

    //状态
    private Integer status;

    @TableField(exist = false)    //是否为数据库字段，默认为true
    private Integer age;

    //创建时间
    @TableField(fill = FieldFill.INSERT)      //自动填充  insert：向数据库插入数据时，自动填充   **需要创建自动填充处理器MetaObjectHandler并实现MetaObjectHandler
    private Date createTime;

    //更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)    //自动填充    insert_update:向数据库插入数据和更新数据时，自动填充   **需要创建自动填充处理器
    private Date updateTime;

    //标记乐观锁~修改操作
    @Version
    private Integer version;       // 数据库添加version字段来控制乐观锁  **需要注册配置类~将乐观锁拦截器注入IOC容器中

    @TableField(value = "status")
    private StatusEnum StatusEnum;      // **枚举映射成员变量必须与数据库字段相同，写枚举，yml配置枚举报扫描

    @TableLogic
    private Integer deleted;         //逻辑删除   **需要在yml中配置

}
