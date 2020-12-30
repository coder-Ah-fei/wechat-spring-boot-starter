package com.fanhua.xia.wechatspringbootstarter.model;

import java.util.List;

/**
 * 描述：给用户批量绑定标签发送的参数
 *
 * @author Administrator
 * @date 2020-03-11
 */
public class BatchTaggingSendData {
	
	
	/**
	 * openid_list : ["ocYxcuAEy30bX0NXmGn4ypqx3tI0","ocYxcuBt0mRugKZ7tGAHPnUaOW7Y"]
	 * tagid : 134
	 */
	
	private int tagid;
	private List<String> openid_list;
	
	public int getTagid() {
		return tagid;
	}
	
	public void setTagid(int tagid) {
		this.tagid = tagid;
	}
	
	public List<String> getOpenid_list() {
		return openid_list;
	}
	
	public void setOpenid_list(List<String> openid_list) {
		this.openid_list = openid_list;
	}
}
