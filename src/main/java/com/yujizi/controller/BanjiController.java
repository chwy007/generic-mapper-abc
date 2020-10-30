package com.yujizi.controller;

import com.yujizi.pojo.Banji;
import com.yujizi.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("banji")
public class BanjiController {

    @Autowired
    private BanjiService banjiService;

    @RequestMapping("find/{id}")
    public Banji find(@PathVariable Integer id){
        Banji banji = banjiService.findById(id);
        System.out.println(banji);

        return  banji;
    }

    @RequestMapping("insert")
    public void insert(Integer id,String name){
        Banji banji=new Banji(id,name);
        banjiService.insertRecord(banji);
    }

    @RequestMapping("all")
    public List<Banji> findAll(){
        List<Banji> banjis = banjiService.selectAll();
        for (Banji banji : banjis) {
            System.out.println(banji);
        }
        int i=1/0;
        return banjis;

    }

}
