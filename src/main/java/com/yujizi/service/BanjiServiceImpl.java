package com.yujizi.service;

import com.yujizi.mapper.BanjiMapper;
import com.yujizi.pojo.Banji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.service
 * @ClassName: BanjiServiceImpl
 * @Author: ychw
 * @Description:
 * @Date: 2020/10/30 12:38
 * @Version: 1.0
 */
@Service
public class BanjiServiceImpl implements BanjiService {

    @Autowired
    private BanjiMapper banjiMapper;

    @Override
    public Banji findById(Integer id) {
        Banji banji = banjiMapper.selectByPrimaryKey(id);
        return banji;
    }

    @Override
    @Transactional
    public void insertRecord(Banji banji) {
        banjiMapper.insert(banji);
//        int i=1/0;
    }

    @Override
    public List<Banji> selectAll() {
        List<Banji> banjis = banjiMapper.selectAll();
        return banjis;
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        banjiMapper.deleteByPrimaryKey(id);
    }



    @Override
    @Transactional
    public void modifyById(Integer id,String name) {
        Banji banji=banjiMapper.selectByPrimaryKey(id);
        banji.setName(name);
        banjiMapper.updateByPrimaryKey(banji);
    }


}
