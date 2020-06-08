package com.wy.procurement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wy.procurement.entity.ProcurementEntity;
import com.wy.procurement.mapper.ProcurementMapper;
import com.wy.procurement.service.ProcurementService;
import com.wy.procurement.util.PageUtil;
import com.wy.procurement.util.QueryUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
@Service("procurementService")
public class ProcurementServiceImpl extends ServiceImpl<ProcurementMapper,ProcurementEntity> implements ProcurementService{



    @Override
    public PageUtil queryPage(Map<String, Object> params) {

        IPage page = new QueryUtil<ProcurementEntity>().getQueryPage(params);

        QueryWrapper<ProcurementEntity> wrapper = new QueryWrapper<>();

        IPage<ProcurementEntity> resPage = page(page,wrapper);
        return new PageUtil(resPage);
    }
}
