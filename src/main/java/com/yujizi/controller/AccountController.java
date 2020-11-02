package com.yujizi.controller;

import com.yujizi.pojo.Account;
import com.yujizi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.controller
 * @ClassName: AccountController
 * @Author: ychw
 * @Description:
 * @Date: 2020/11/2 10:19
 * @Version: 1.0
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("find/{id}")
    @ResponseBody
    public Account findById(@PathVariable Integer id){
        return accountService.findById(id);
    }

    @RequestMapping("all")
    @ResponseBody
    public List<Account> findAll(){
        return accountService.selectAll();
    }

    @RequestMapping("delete/{id}")
    @ResponseBody
    public String deleteById(@PathVariable Integer id){
        accountService.deleteById(id);
        return "delete success";
    }

    @RequestMapping("insert")
    @ResponseBody
    public String insert(Account account){
        accountService.insertEntry(account);
        return "success";
    }

    @RequestMapping("modify")
    @ResponseBody
    public String modifyById(Integer id,String accountName,String name,String password,String tips){
        accountService.modifyById(id,accountName,name,password,tips);
        return "modify success";
    }

}
