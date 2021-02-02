package com.github.coderahfei.wechatspringbootstarter.model.form;

import java.util.TreeMap;


/**
 * 模板消息（发送给微信公众号用户的消息）
 *
 * @author yang
 */
public class WechatTemplateMsgSendData {
	/**
	 * 接收者openid
	 */
	private String touser;
	//模板ID
	private String template_id;
	/**
	 * 模板跳转链接
	 * 请注意，URL置空，则在发送后，点击模板消息会进入一个空白页面（ios），或无法点击（android）。
	 */
	private String url;
	/**
	 * data数据
	 */
	private TreeMap<String, TreeMap<String, String>> data;
	
	/**
	 * 参数
	 *
	 * @param value 内容
	 * @param color 可不填
	 * @return 返回值
	 */
	public static TreeMap<String, String> item(String value, String color) {
		TreeMap<String, String> params = new TreeMap<String, String>();
		params.put("value", value);
		params.put("color", color);
		return params;
	}
	
	public String getTouser() {
		return touser;
	}
	
	public void setTouser(String touser) {
		this.touser = touser;
	}
	
	public String getTemplate_id() {
		return template_id;
	}
	
	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public TreeMap<String, TreeMap<String, String>> getData() {
		return data;
	}
	
	public void setData(TreeMap<String, TreeMap<String, String>> data) {
		this.data = data;
	}
}
