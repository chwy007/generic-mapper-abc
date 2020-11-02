package com.yujizi.service;

import com.github.pagehelper.PageInfo;
import com.yujizi.pojo.Account;
import com.yujizi.pojo.Banji;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.service
 * @ClassName: AccountService
 * @Author: ychw
 * @Description:
 * @Date: 2020/11/2 10:18
 * @Version: 1.0
 */
public interface AccountService {

    Account findById(Integer id);

    void insertEntry(Account account);

    PageInfo<Account> selectAll(Integer pageNum, Integer pageSize);

    void deleteById(Integer id);

    void modifyById(Integer id, String accountName, String name, String password, String tips);

}
