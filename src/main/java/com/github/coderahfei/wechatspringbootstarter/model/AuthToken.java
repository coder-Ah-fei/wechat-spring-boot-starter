package com.github.coderahfei.wechatspringbootstarter.model;


import java.io.Serializable;

/**
 * @author yang [yiixuan@163.com]
 */
public class AuthToken implements Serializable {
	
	/**
	 * 授权access_token
	 */
	private String access_token;
	/**
	 * 有效期
	 */
	private String expires_in;
	/**
	 * 刷新access_token
	 */
	private String refresh_token;
	/**
	 * 用户OPENID
	 */
	private String openid;
	/**
	 * 授权方式Scope
	 */
	private String scope;
	/**
	 * 错误码
	 */
	private String errcode;
	/**
	 * 错误消息
	 */
	private String errmsg;
	
	public String getAccess_token() {
		return access_token;
	}
	
	public AuthToken setAccess_token(String access_token) {
		this.access_token = access_token;
		return this;
	}
	
	public String getExpires_in() {
		return expires_in;
	}
	
	public AuthToken setExpires_in(String expires_in) {
		this.expires_in = expires_in;
		return this;
	}
	
	public String getRefresh_token() {
		return refresh_token;
	}
	
	public AuthToken setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
		return this;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public AuthToken setOpenid(String openid) {
		this.openid = openid;
		return this;
	}
	
	public String getScope() {
		return scope;
	}
	
	public AuthToken setScope(String scope) {
		this.scope = scope;
		return this;
	}
	
	public String getErrcode() {
		return errcode;
	}
	
	public AuthToken setErrcode(String errcode) {
		this.errcode = errcode;
		return this;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	
	public AuthToken setErrmsg(String errmsg) {
		this.errmsg = errmsg;
		return this;
	}
}
