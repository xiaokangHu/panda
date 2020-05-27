package com.battle.panda.caipiao.dao;

import com.battle.panda.caipiao.model.CaiPiaoNumberDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface CaiPiaoNumberDateMapper {
//    int countByExample(CaiPiaoNumberDateExample example);
//
//    int deleteByExample(CaiPiaoNumberDateExample example);
//
//    int insert(CaiPiaoNumberDate record);
//
//    int insertSelective(CaiPiaoNumberDate record);
//
//    List<CaiPiaoNumberDate> selectByExample(CaiPiaoNumberDateExample example);
//
//    int updateByExampleSelective(@Param("record") CaiPiaoNumberDate record, @Param("example") CaiPiaoNumberDateExample example);
//
//    int updateByExample(@Param("record") CaiPiaoNumberDate record, @Param("example") CaiPiaoNumberDateExample example);
    @Select("select date,first,sec,third,forth,fiveth,sumNumber,kuadu,describes from tbl_caipiao_number_date")
    List<CaiPiaoNumberDate>  selectall();


    List<CaiPiaoNumberDate>  getAll();

    Integer getCount();
 }