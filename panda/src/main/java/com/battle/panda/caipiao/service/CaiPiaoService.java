package com.battle.panda.caipiao.service;

import com.battle.panda.caipiao.model.CaiPiaoNumberDate;

import java.util.List;

public interface CaiPiaoService {

    public List<CaiPiaoNumberDate> findAll();

    public List<CaiPiaoNumberDate> getAll();

    public Integer getCount();
}
