package com.yujizi.service;

import com.yujizi.mapper.AccountMapper;
import com.yujizi.pojo.Account;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.service
 * @ClassName: AccountServiceImpl
 * @Author: ychw
 * @Description:
 * @Date: 2020/11/2 10:18
 * @Version: 1.0
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public Account findById(Integer id) {
//        Account account = accountMapper.selectById(id);
        Account account=accountMapper.selectByPrimaryKey(id);
        return account;
    }

    @Override
    @Transactional
    public void insertEntry(Account account) {
        if(StringUtils.isBlank(account.getAccountName())){
            throw  new RuntimeException("注册失败");
        }
        if(StringUtils.isBlank(account.getName())){
            throw  new RuntimeException("注册失败");
        }
        if(StringUtils.isBlank(account.getPassword())){
            throw  new RuntimeException("注册失败");
        }

        Date date=new Date();
        System.out.println(date);
        account.setCreatedTime(date);
        account.setLastmodifiedTime(date);
        accountMapper.insert(account);
    }

    @Override
    public List<Account> selectAll() {
//        return accountMapper.queryAll();
        return accountMapper.selectAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        accountMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void modifyById(Integer id, String accountName, String name, String password, String tips) {
        Account account = accountMapper.selectByPrimaryKey(id);
        if(!StringUtils.isBlank(accountName)){
            account.setAccountName(accountName);
        }

        if(!StringUtils.isBlank(name)){
            account.setName(name);
        }

        if(!StringUtils.isBlank(password)){
            account.setPassword(password);
        }

        if(!StringUtils.isBlank(tips)){
            account.setTips(tips);
        }


        account.setLastmodifiedTime(new Date());

        accountMapper.updateByPrimaryKey(account);
    }
}
