package com.yujizi.controller;

import com.yujizi.pojo.Banji;
import com.yujizi.service.BanjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

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


    @RequestMapping("find/{id}")
    @ResponseBody
    public Banji find(@PathVariable Integer id){
        Banji banji = banjiService.findById(id);
        System.out.println(banji);

        return  banji;
    }

    @RequestMapping("insert")
    public String insert(Integer id,String name){
        Banji banji=new Banji(id,name);
        banjiService.insertRecord(banji);
        return "redirect:/templates/globalException.html";
//        return "forward:/sys/hello"; 重定向页面网址发生变化，而转发不会
    }

    @RequestMapping("all")
    @ResponseBody
    public List<Banji> findAll(){
        List<Banji> banjis = banjiService.selectAll();
        for (Banji banji : banjis) {
            System.out.println(banji);
        }
        return banjis;

    }

    @RequestMapping("delete/{id}")
    @ResponseBody
    public String deleteById(@PathVariable Integer id){
        banjiService.deleteById(id);
        return "success";
    }

    @RequestMapping("modify")
    @ResponseBody
    public String modifyById(Integer id,String name){
        banjiService.modifyById(id,name);
        return "success";
    }

}
