package com.yujizi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi
 * @ClassName: MapperApp
 * @Author: ychw
 * @Description:
 * @Date: 2020/10/30 12:48
 * @Version: 1.0
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.yujizi.mapper")
public class MapperApp {
    public static void main(String[] args) {
        SpringApplication.run(MapperApp.class);
    }
}
