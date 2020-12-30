package com.fanhua.xia.wechatspringbootstarter.model;

/**
 * 描述：
 *
 * @author Administrator
 * @date 2020-03-11
 */


public class BaseDto {
	
	
	/**
	 * errcode : 45159
	 * errmsg : invalid tag id hint: [9xgZWa02938665]
	 */
	
	private int errcode;
	private String errmsg;
	
	public int getErrcode() {
		return errcode;
	}
	
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
