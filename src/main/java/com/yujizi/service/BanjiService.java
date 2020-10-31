package com.yujizi.service;

import com.yujizi.pojo.Banji;

import java.util.List;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.service
 * @ClassName: BanjiService
 * @Author: ychw
 * @Description:
 * @Date: 2020/10/30 12:38
 * @Version: 1.0
 */
public interface BanjiService {
    Banji findById(Integer id);
    void insertRecord(Banji banji);
    List<Banji> selectAll();
    void deleteById(Integer id);
}
