package com.github.coderahfei.wechatspringbootstarter.model.dto;

/**
 * 接口长连接转短链接返回的数据
 *
 * @author yang [yiixuan@163.com]
 */
public class ShortUrlDto extends BaseDto {
	
	/**
	 * 短链接。目前短链接域名为w.url.cn，
	 * 自2020年10月24日起，短链接域名将升级为新域名mmbizurl.cn，原有w.url.cn域名仍可以正常访问。
	 */
	private String short_url;
	
	public String getShort_url() {
		return short_url;
	}
	
	public ShortUrlDto setShort_url(String short_url) {
		this.short_url = short_url;
		return this;
	}
}
