package com.battle.panda.caipiao.service.impl;

import com.battle.panda.caipiao.dao.CaiPiaoNumberDateMapper;
import com.battle.panda.caipiao.model.CaiPiaoNumberDate;
import com.battle.panda.caipiao.service.CaiPiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CaipiaoServiceImpl implements CaiPiaoService {


    @Autowired
    private CaiPiaoNumberDateMapper caiPiaoNumberDateMapper;

//
//    @Override
//    public List<CaiPiaoNumberDate> findAll(){
//        CaiPiaoNumberDateExample exmaple  = new CaiPiaoNumberDateExample();
//        CaiPiaoNumberDateExample.Criteria criteria = exmaple.createCriteria();
//
//        List<CaiPiaoNumberDate> goodsList = caiPiaoNumberDateMapper.selectByExample(exmaple);
//
//        return goodsList;
//
//    }
    @Override
    public List<CaiPiaoNumberDate> findAll(){
        List<CaiPiaoNumberDate> goodsList=caiPiaoNumberDateMapper.selectall();
        return goodsList;
    }

    @Override
    public List<CaiPiaoNumberDate> getAll(){
        List<CaiPiaoNumberDate> goodsList=caiPiaoNumberDateMapper.getAll();
        return goodsList;
    }

    @Override
    public Integer getCount(){
        Integer t=caiPiaoNumberDateMapper.getCount();
        return t;
    }
}

