package com.github.coderahfei.wechatspringbootstarter.model.dto;

/**
 * 接受生成二维码请求返回的参数
 *
 * @author yang
 */
public class CreateQrcodeDto {
	/**
	 * 获取的二维码ticket，凭借此ticket可以在有效时间内换取二维码。
	 */
	private String ticket;
	/**
	 * 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天）。
	 */
	private String expire_seconds;
	/**
	 * 二维码图片解析后的地址，开发者可根据该地址自行生成需要的二维码图片
	 */
	private String url;
	
	public String getTicket() {
		return ticket;
	}
	
	public CreateQrcodeDto setTicket(String ticket) {
		this.ticket = ticket;
		return this;
	}
	
	public String getExpire_seconds() {
		return expire_seconds;
	}
	
	public CreateQrcodeDto setExpire_seconds(String expire_seconds) {
		this.expire_seconds = expire_seconds;
		return this;
	}
	
	public String getUrl() {
		return url;
	}
	
	public CreateQrcodeDto setUrl(String url) {
		this.url = url;
		return this;
	}
}
