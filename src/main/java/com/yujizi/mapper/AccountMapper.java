package com.yujizi.mapper;

import com.yujizi.pojo.Account;
import org.apache.ibatis.annotations.Select;
import org.w3c.dom.stylesheets.LinkStyle;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.mapper
 * @ClassName: AccountMapper
 * @Author: ychw
 * @Description:
 * @Date: 2020/11/2 10:17
 * @Version: 1.0
 */
public interface AccountMapper extends Mapper<Account> {

    @Select("select id,account_name,name,password,tips,created_time,lastmodified_time from account where id=#{id}")
    Account selectById(Integer id);

    @Select("select id,account_name,name,password,tips,created_time,lastmodified_time from account")
    List<Account> queryAll();

}
