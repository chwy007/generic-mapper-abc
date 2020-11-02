package com.yujizi.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.pojo
 * @ClassName: Account
 * @Author: ychw
 * @Description:
 * @Date: 2020/11/2 10:14
 * @Version: 1.0
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private Integer id;

    private String accountName;
    private String name;
    private String password;
    private String tips;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastmodifiedTime;



}
