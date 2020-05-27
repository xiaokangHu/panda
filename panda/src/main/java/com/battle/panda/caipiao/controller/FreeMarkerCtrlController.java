package com.battle.panda.caipiao.controller;

import com.battle.panda.utils.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/ftl")
public class FreeMarkerCtrlController {

    @Autowired
    private Resource resource;

    @RequestMapping(value = "/index")
    public ModelAndView index(ModelMap map){
        ModelAndView mv=new ModelAndView();
        mv.addObject("resource", resource);
        mv.setViewName("freemarker/index");
        return mv;
    }

    @RequestMapping(value ="/center")
    public ModelAndView  center(ModelMap map){
//        map.put("users",parseUsers());
//        map.put("title","用户列表");
        ModelAndView mv=new ModelAndView();
        mv.addObject("users", parseUsers());
        map.put("title","用户列表");
        mv.setViewName("freemarker/picture");
        return mv;
    }

    private List<Map> parseUsers(){
        List<Map> list= new ArrayList<>();
        for(int i=0;i<10;i++){
            Map map= new HashMap();
            map.put("name","kevin_"+i);
            map.put("age",10+i);
            map.put("phone","1860291105"+i);
            list.add(map);
        }
        return list;
    }


}
