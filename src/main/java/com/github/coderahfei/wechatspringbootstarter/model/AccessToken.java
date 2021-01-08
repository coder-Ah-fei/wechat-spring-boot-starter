package com.github.coderahfei.wechatspringbootstarter.model;

import java.io.Serializable;

/**
 * 获取access_token的接收模板
 *
 * @author yang [yiixuan@163.com]
 */
public class AccessToken implements Serializable {
	
	private String access_token;
	private Long expires_in;
	
	private String errcode;
	private String errmsg;
	
	public String getAccess_token() {
		return access_token;
	}
	
	public AccessToken setAccess_token(String access_token) {
		this.access_token = access_token;
		return this;
	}
	
	public Long getExpires_in() {
		return expires_in;
	}
	
	public AccessToken setExpires_in(Long expires_in) {
		this.expires_in = expires_in;
		return this;
	}
	
	public String getErrcode() {
		return errcode;
	}
	
	public AccessToken setErrcode(String errcode) {
		this.errcode = errcode;
		return this;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	
	public AccessToken setErrmsg(String errmsg) {
		this.errmsg = errmsg;
		return this;
	}
}
