package com.wy.procurement.entity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wy.procurement.mapper.ProcurementMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author lanwei
 * @email 335747949@qq.com
 */
@SpringBootTest
class ProcurementEntityTest {

    @Autowired
    private ProcurementMapper mapper;

    @Test
    void select(){
//        mapper.selectById(28);
//        mapper.selectList(null);
        QueryWrapper wrapper = new QueryWrapper<ProcurementEntity>()
//                .eq("username","兰伟");
//                .likeLeft("username","伟");     // **以伟结尾的模糊查询    %伟
//                .likeRight("username","兰");    // **以兰开始的模糊查询    兰%
//                .like("username","兰");    // **  %兰%
                .inSql("username","select username from procurement_particulars where id<=6");
        System.out.println(mapper.selectList(wrapper));
    }

    @Test
    void save(){
        ProcurementEntity procurementEntity = new ProcurementEntity();
        procurementEntity.setDrugstoreName("仁和大药房");
        procurementEntity.setUsername("lanwei");
        mapper.insert(procurementEntity);

    }


    @Test
    void update(){
        ProcurementEntity procurementEntity = new ProcurementEntity();
        procurementEntity = mapper.selectById(6);
        procurementEntity.setUsername("兰伟886");

        ProcurementEntity procurementEntity1 = new ProcurementEntity();
        procurementEntity1 = mapper.selectById(6);
        procurementEntity1.setUsername("王飞2221");

        mapper.updateById(procurementEntity1);
        mapper.updateById(procurementEntity);


    }

    @Test
    void delete(){
        mapper.deleteById(28);
    }

    @Test
    void listVO(){
        mapper.procuremenList(1);
    }
}