package com.wy.procurement.controller;

import com.wy.procurement.response.BaseResponse;
import com.wy.procurement.response.StatusCode;
import com.wy.procurement.service.ProcurementService;
import com.wy.procurement.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
@RestController
@RequestMapping("/procurement")
public class ProcurementController {

    @Autowired
    private ProcurementService procurementService;

    @RequestMapping("/index")
    public String index(){
        return "hello procurement!";
    }


    @RequestMapping("/list")
    public BaseResponse list(@RequestParam Map<String , Object> param){

        BaseResponse response = new BaseResponse(StatusCode.Success);
        Map<String ,Object> map = new HashMap<>();
        PageUtil resPage = procurementService.queryPage(param);
        map.put("resPage",resPage);
        response.setData(map);
        return response;
    }
}
