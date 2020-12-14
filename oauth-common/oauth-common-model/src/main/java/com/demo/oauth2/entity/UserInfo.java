package com.demo.oauth2.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* @author liyz
* @Description TODO
*/
@Data
public class UserInfo implements Serializable {
    private String id;

    private String username;

    private String password;

    private String salt;

    private Date createTime;

    private Date updateTime;
}