package com.github.coderahfei.wechatspringbootstarter.model;

import java.util.List;

/**
 * 接收微信素材相关请求的返回参数的model
 *
 * @author yang [yiixuan@163.com]
 */
public class MaterialDto {
	
	
	/**
	 * title : VIDEO_TITLE
	 * introduction : INTRODUCTION
	 * media_id : d_kuHr7C-LwS10llo1NjZlki-U6ZSgYQGjPZjq9s0co
	 * url : http://mmbiz.qpic.cn/mmbiz_jpg/Z44MaYvRtiap5IZ2lNicMicYXWIPDRYQb68u4giax0fAEpLTaymtwWzGViafnfTFEC2BDKs2CfZ4HYaA68ztaDWGMlg/0?wx_fmt=jpeg
	 * item : []
	 * errcode : 40007
	 * errmsg : invalid media_id
	 */
	
	private String title;
	private String introduction;
	private String media_id;
	private String url;
	private int errcode;
	private String errmsg;
	private List<?> item;
	
	public String getTitle() {
		return title;
	}
	
	public MaterialDto setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public String getIntroduction() {
		return introduction;
	}
	
	public MaterialDto setIntroduction(String introduction) {
		this.introduction = introduction;
		return this;
	}
	
	public String getMedia_id() {
		return media_id;
	}
	
	public MaterialDto setMedia_id(String media_id) {
		this.media_id = media_id;
		return this;
	}
	
	public String getUrl() {
		return url;
	}
	
	public MaterialDto setUrl(String url) {
		this.url = url;
		return this;
	}
	
	public int getErrcode() {
		return errcode;
	}
	
	public MaterialDto setErrcode(int errcode) {
		this.errcode = errcode;
		return this;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	
	public MaterialDto setErrmsg(String errmsg) {
		this.errmsg = errmsg;
		return this;
	}
	
	public List<?> getItem() {
		return item;
	}
	
	public MaterialDto setItem(List<?> item) {
		this.item = item;
		return this;
	}
}
