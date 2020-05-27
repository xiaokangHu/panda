package com.battle.panda.caipiao.controller;

import com.alibaba.fastjson.JSONObject;
import com.battle.panda.utils.MyResponse;
import com.battle.panda.caipiao.model.CaiPiaoNumberDate;
import com.battle.panda.caipiao.service.CaiPiaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/visualize/analyze")
public class CaiPiaoController {

    @Autowired
    private CaiPiaoService caiPiaoService;


    @RequestMapping("/findAll")
    public JSONObject findAll() {
        JSONObject js = new JSONObject();
        List<CaiPiaoNumberDate> list = caiPiaoService.findAll();
        return MyResponse.SUCCESS.setData(list).toJsonObject();
    }

    @RequestMapping("/getAll")
    public JSONObject getAll() {
        JSONObject js = new JSONObject();
        List<CaiPiaoNumberDate> list = caiPiaoService.getAll();
        return MyResponse.SUCCESS.setData(list).toJsonObject();
    }

    @RequestMapping("/getCount")
    public JSONObject getCount() {
        JSONObject js = new JSONObject();
        Integer t = caiPiaoService.getCount();
        return MyResponse.SUCCESS.setData(t).toJsonObject();
    }
}
