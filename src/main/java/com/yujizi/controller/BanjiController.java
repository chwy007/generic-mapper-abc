package com.yujizi.controller;

import com.yujizi.pojo.Banji;
import com.yujizi.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.controller
 * @ClassName: BanjiController
 * @Author: ychw
 * @Description:
 * @Date: 2020/10/30 12:44
 * @Version: 1.0
 */
@Controller
@RequestMapping("banji")
public class BanjiController {

    @Autowired
    private BanjiService banjiService;

    @GetMapping("/jsptest")
    public String jspTest(){
        return "banji";
    }

    @RequestMapping("find/{id}")
    @ResponseBody
    public Banji find(@PathVariable Integer id){
        Banji banji = banjiService.findById(id);
        System.out.println(banji);

        return  banji;
    }

    @RequestMapping("insert")
    @ResponseBody
    public String insert(Integer id,String name){
        Banji banji=new Banji(id,name);
        banjiService.insertRecord(banji);
        return "success";
    }

    @RequestMapping("all")
    @ResponseBody
    public List<Banji> findAll(){
        List<Banji> banjis = banjiService.selectAll();
        for (Banji banji : banjis) {
            System.out.println(banji);
        }
        int i=1/0;
        return banjis;

    }

}
