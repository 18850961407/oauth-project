package com.demo.oauth2.server.service.impl;

import com.demo.oauth2.entity.OauthClient;
import com.demo.oauth2.entity.OauthClientCriteria;
import com.demo.oauth2.server.mapper.OauthClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.oauth2.server.service.OauthClientService;
import com.demo.oauth2.server.service.RedisProxyService;

import javax.annotation.Resource;

/**
* @author liyz
* @Description TODO
*/
@Service
public class OauthClientServiceImpl implements OauthClientService{

	@Resource
	private OauthClientMapper oauthClientMapper;
	
	@Autowired
	private RedisProxyService redisService;
	
	@Override
	public boolean checkClient(String clientId) {
		boolean res=false;
		
		OauthClient client=oauthClientMapper.selectByPrimaryKey(clientId);
		if(client!=null&&client.getClientId().equals(clientId))
		{
			res= true;
		}
		return res;
	}

	@Override
	public boolean checkClient(String clientId, String clientKey) {
		boolean res=false;
		OauthClientCriteria example=new OauthClientCriteria();
		example.or().andClientIdEqualTo(clientId).andClientSecretEqualTo(clientKey);
		OauthClient client= oauthClientMapper.selectByExample(example).get(0);
		if(client!=null&&clientId.equals(client.getClientId()))
		{
			res=true;
		}
		return res;
	}

	@Override
	public void saveCode(String clientId,String code) {		
		redisService.set(clientId, code);
	}

	@Override
	public String getCode(String clientId) {
	
		return redisService.get(clientId);
	}

	@Override
	public void saveAccessToken(String token, String userInfo) {
		redisService.set(token, userInfo);
		
	}

}
