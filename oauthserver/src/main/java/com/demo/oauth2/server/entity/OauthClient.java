package com.demo.oauth2.server.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* @author liyz
* @Description TODO
*/
@Data
public class OauthClient implements Serializable {
    private Integer id;

    private String clientId;

    private String clientName;

    private String clientSecret;

    private String clientUrl;

    private Date createTime;

    private Date updateTime;
}