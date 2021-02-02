package com.github.coderahfei.wechatspringbootstarter.model.dto;

/**
 * 接受发送微信模板消息返回的记过
 *
 * @author yang
 */
public class WechatTemplateMsgDto extends BaseDto {
	private String msgid;
	
	public String getMsgid() {
		return msgid;
	}
	
	public WechatTemplateMsgDto setMsgid(String msgid) {
		this.msgid = msgid;
		return this;
	}
}
