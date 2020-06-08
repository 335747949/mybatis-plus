package com.wy.procurement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wy.procurement.entity.ProcurementEntity;
import com.wy.procurement.entity.ProcurementVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
@Mapper
public interface ProcurementMapper extends BaseMapper<ProcurementEntity>{

    List<ProcurementVO> procuremenList(@Param("userId") Integer userId);
}
