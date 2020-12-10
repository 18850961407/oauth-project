package com.demo.oauth2.server.constant;

/**
* @author liyz
* @Description TODO
*/
public class ErrorConstants {
	public static final String RESOURCE_SERVER_NAME = "oauth-server";
    public static final String ERROR_CLIENT_MSG = "客户端验证失败，如错误的client_id/client_secret。";
    public static final String ERROR_CLIENT_LOGIN="用户未在目标服务器登陆或登陆已失效";
    public static final String INVALID_ACCESS_TOKEN = "accessToken无效或已过期。";
    public static final String INVALID_REDIRECT_URI = "缺少授权成功后的回调地址。";
    public static final String ERROR_AUTH_CODE = "错误的授权码。";
    public static final String ERROR_UNKNOW="未知的错误";
    // 验证accessToken
    public static final String CHECK_ACCESS_CODE_URL = "http://localhost:8080/oauth2-server/checkAccessToken?accessToken=";
}
