package com.fanhua.xia.wechatspringbootstarter.model;

import java.util.List;

/**
 * 批量获取用户基本信息，请求的参数model
 *
 * @author yang [yiixuan@163.com]
 */
public class UserInfoBatchgetSendData {
	
	
	private List<UserListBean> user_list;
	
	public List<UserListBean> getUser_list() {
		return user_list;
	}
	
	public void setUser_list(List<UserListBean> user_list) {
		this.user_list = user_list;
	}
	
	public static class UserListBean {
		/**
		 * openid : otvxTs4dckWG7imySrJd6jSi0CWE
		 * lang : zh_CN
		 */
		
		private String openid;
		private String lang;
		
		public String getOpenid() {
			return openid;
		}
		
		public void setOpenid(String openid) {
			this.openid = openid;
		}
		
		public String getLang() {
			return lang;
		}
		
		public void setLang(String lang) {
			this.lang = lang;
		}
	}
}
