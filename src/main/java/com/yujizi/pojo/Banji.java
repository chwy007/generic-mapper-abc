package com.yujizi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.pojo
 * @ClassName: Banji
 * @Author: ychw
 * @Description:
 * @Date: 2020/10/30 11:40
 * @Version: 1.0
 */
@Data
@Entity
@AllArgsConstructor
public class Banji {

    @Id
    private Integer id;
    private String name;

}
