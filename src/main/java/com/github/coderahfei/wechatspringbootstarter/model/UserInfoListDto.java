package com.github.coderahfei.wechatspringbootstarter.model;

import java.util.List;

/**
 * @author yang [yiixuan@163.com]
 */
public class UserInfoListDto {
	
	private List<UserInfoDto> user_info_list;
	
	public List<UserInfoDto> getUser_info_list() {
		return user_info_list;
	}
	
	public UserInfoListDto setUser_info_list(List<UserInfoDto> user_info_list) {
		this.user_info_list = user_info_list;
		return this;
	}
}
