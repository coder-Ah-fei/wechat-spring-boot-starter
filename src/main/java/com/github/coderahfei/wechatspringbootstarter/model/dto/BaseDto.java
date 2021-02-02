package com.github.coderahfei.wechatspringbootstarter.model.dto;

import com.github.coderahfei.wechatspringbootstarter.common.enums.WechatErrorCode;

/**
 * @author yang [yiixuan@163.com]
 */
public class BaseDto {
	
	
	/**
	 * errcode : 45159
	 * errmsg : invalid tag id hint: [9xgZWa02938665]
	 */
	
	private int errcode;
	private String errmsg;
	
	private WechatErrorCode wechatErrorCode;
	
	public WechatErrorCode getWechatErrorCode() {
		return wechatErrorCode;
	}
	
	public BaseDto setWechatErrorCode(WechatErrorCode wechatErrorCode) {
		this.wechatErrorCode = wechatErrorCode;
		return this;
	}
	
	public int getErrcode() {
		return errcode;
	}
	
	public void setErrcode(int errcode) {
		this.wechatErrorCode = WechatErrorCode.getByCode(errcode);
		this.errcode = errcode;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
