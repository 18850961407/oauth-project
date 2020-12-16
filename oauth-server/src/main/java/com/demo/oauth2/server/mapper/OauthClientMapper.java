package com.demo.oauth2.server.mapper;

import java.util.List;


import com.demo.oauth2.entity.OauthClient;
import com.demo.oauth2.entity.OauthClientCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OauthClientMapper {
    int countByExample(OauthClientCriteria example);

    int deleteByExample(OauthClientCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(OauthClient record);

    int insertSelective(OauthClient record);

    List<OauthClient> selectByExample(OauthClientCriteria example);

    OauthClient selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OauthClient record, @Param("example") OauthClientCriteria example);

    int updateByExample(@Param("record") OauthClient record, @Param("example") OauthClientCriteria example);

    int updateByPrimaryKeySelective(OauthClient record);

    int updateByPrimaryKey(OauthClient record);
}