package com.wy.procurement.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wy.procurement.entity.ProcurementEntity;
import com.wy.procurement.util.PageUtil;

import java.util.Map;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public interface ProcurementService extends IService<ProcurementEntity>{


    PageUtil queryPage(Map<String , Object> params);
}
