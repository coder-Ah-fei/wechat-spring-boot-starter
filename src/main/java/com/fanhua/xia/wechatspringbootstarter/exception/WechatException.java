package com.fanhua.xia.wechatspringbootstarter.exception;

/**
 * @author yang [yiixuan@163.com]
 */
public class WechatException extends Exception {
	/*无参构造函数*/
	public WechatException() {
		super();
	}
	
	//用详细信息指定一个异常
	public WechatException(String message) {
		super(message);
	}
	
	//用指定的详细信息和原因构造一个新的异常
	public WechatException(String message, Throwable cause) {
		super(message, cause);
	}
	
	//用指定原因构造一个新的异常
	public WechatException(Throwable cause) {
		super(cause);
	}
}
