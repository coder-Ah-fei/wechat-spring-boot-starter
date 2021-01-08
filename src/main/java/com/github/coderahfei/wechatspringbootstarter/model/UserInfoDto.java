package com.github.coderahfei.wechatspringbootstarter.model;

import java.util.List;

/**
 * @author yang [yiixuan@163.com]
 */
public class UserInfoDto {
	/**
	 * subscribe : 1
	 * openid : otvxTs4dckWG7imySrJd6jSi0CWE
	 * nickname : iWithery
	 * sex : 1
	 * language : zh_CN
	 * city : 揭阳
	 * province : 广东
	 * country : 中国
	 * headimgurl : http://thirdwx.qlogo.cn/mmopen/xbIQx1GRqdvyqkMMhEaGOX802l1CyqMJNgUzKP8MeAeHFicRDSnZH7FY4XB7p8XHXIf6uJA2SCunTPicGKezDC4saKISzRj3nz/0
	 * subscribe_time : 1434093047
	 * unionid : oR5GjjgEhCMJFyzaVZdrxZ2zRRF4
	 * remark :
	 * groupid : 0
	 * tagid_list : [128,2]
	 * subscribe_scene : ADD_SCENE_QR_CODE
	 * qr_scene : 98765
	 * qr_scene_str :
	 */
	
	private int subscribe;
	private String openid;
	private String nickname;
	private int sex;
	private String language;
	private String city;
	private String province;
	private String country;
	private String headimgurl;
	private long subscribe_time;
	private String unionid;
	private String remark;
	private int groupid;
	private String subscribe_scene;
	private int qr_scene;
	private String qr_scene_str;
	private List<Integer> tagid_list;
	private List<String> privilege;
	
	public int getSubscribe() {
		return subscribe;
	}
	
	public UserInfoDto setSubscribe(int subscribe) {
		this.subscribe = subscribe;
		return this;
	}
	
	public String getOpenid() {
		return openid;
	}
	
	public UserInfoDto setOpenid(String openid) {
		this.openid = openid;
		return this;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public UserInfoDto setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}
	
	public int getSex() {
		return sex;
	}
	
	public UserInfoDto setSex(int sex) {
		this.sex = sex;
		return this;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public UserInfoDto setLanguage(String language) {
		this.language = language;
		return this;
	}
	
	public String getCity() {
		return city;
	}
	
	public UserInfoDto setCity(String city) {
		this.city = city;
		return this;
	}
	
	public String getProvince() {
		return province;
	}
	
	public UserInfoDto setProvince(String province) {
		this.province = province;
		return this;
	}
	
	public String getCountry() {
		return country;
	}
	
	public UserInfoDto setCountry(String country) {
		this.country = country;
		return this;
	}
	
	public String getHeadimgurl() {
		return headimgurl;
	}
	
	public UserInfoDto setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
		return this;
	}
	
	public long getSubscribe_time() {
		return subscribe_time;
	}
	
	public UserInfoDto setSubscribe_time(long subscribe_time) {
		this.subscribe_time = subscribe_time;
		return this;
	}
	
	public String getUnionid() {
		return unionid;
	}
	
	public UserInfoDto setUnionid(String unionid) {
		this.unionid = unionid;
		return this;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public UserInfoDto setRemark(String remark) {
		this.remark = remark;
		return this;
	}
	
	public int getGroupid() {
		return groupid;
	}
	
	public UserInfoDto setGroupid(int groupid) {
		this.groupid = groupid;
		return this;
	}
	
	public String getSubscribe_scene() {
		return subscribe_scene;
	}
	
	public UserInfoDto setSubscribe_scene(String subscribe_scene) {
		this.subscribe_scene = subscribe_scene;
		return this;
	}
	
	public int getQr_scene() {
		return qr_scene;
	}
	
	public UserInfoDto setQr_scene(int qr_scene) {
		this.qr_scene = qr_scene;
		return this;
	}
	
	public String getQr_scene_str() {
		return qr_scene_str;
	}
	
	public UserInfoDto setQr_scene_str(String qr_scene_str) {
		this.qr_scene_str = qr_scene_str;
		return this;
	}
	
	public List<Integer> getTagid_list() {
		return tagid_list;
	}
	
	public UserInfoDto setTagid_list(List<Integer> tagid_list) {
		this.tagid_list = tagid_list;
		return this;
	}
	
	public List<String> getPrivilege() {
		return privilege;
	}
	
	public UserInfoDto setPrivilege(List<String> privilege) {
		this.privilege = privilege;
		return this;
	}
}
