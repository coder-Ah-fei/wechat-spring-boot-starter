package com.fanhua.xia.wechatspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yang [yiixuan@163.com]
 */
@ConfigurationProperties(prefix = "spring.xia.wechat")
public class WechatConfig {
	
	private Config config = new Config();
	
	private Url url = new Url();
	
	
	public Config getConfig() {
		return config;
	}
	
	public Url getUrl() {
		return url;
	}
	
	public static class Url {
		/**
		 * 获取微信页面授权时的access_token所需的code的URL
		 */
		private String code = "https://open.weixin.qq.com/connect/oauth2/authorize?";
		
		/**
		 * 通过code获取网页授权的access_token的URL
		 */
		private String webAccessToken = "https://api.weixin.qq.com/sns/oauth2/access_token?";
		
		/**
		 * 获取用户信息的URL
		 */
		private String userInfo = "https://api.weixin.qq.com/sns/userinfo";
		
		
		/**
		 * 基础支持access_token的URl
		 */
		private String accessToken = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&";
		
		/**
		 * 获取公众号用户列表（关注者？）
		 */
		private String userList = "https://api.weixin.qq.com/cgi-bin/user/get?";
		
		/**
		 * 创建普通菜单
		 */
		private String createMenu = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";
		
		/**
		 * 批量获取用户基本信息
		 */
		private String userInfoBatchget = "https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=";
		/**
		 * 批量获取用户基本信息
		 */
		private String sendKfMessage = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
		/**
		 * 新增除了（图文类型）之外的其他类型的永久素材
		 */
		private String addMaterial = "https://api.weixin.qq.com/cgi-bin/material/add_material?access_token=";
		/**
		 * 新增临时素材
		 */
		private String mediaUpload = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=";
		/**
		 * 上传图文消息内的图片获取URL
		 */
		private String mediaUploadimg = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=";
		/**
		 * 上传图文消息
		 */
		private String materialAddNews = "https://api.weixin.qq.com/cgi-bin/material/add_news?access_token=";
		/**
		 * 创建用户标签
		 */
		private String tagsCreate = "https://api.weixin.qq.com/cgi-bin/tags/create?access_token=";
		/**
		 * 创建用户标签
		 */
		private String tagsUpdate = "https://api.weixin.qq.com/cgi-bin/tags/update?access_token=";
		/**
		 * 批量为用户打标签
		 */
		private String tagsBatchtagging = "https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging?access_token=";
		
		public String getCode() {
			return code;
		}
		
		public void setCode(String code) {
			this.code = code;
		}
		
		public String getWebAccessToken() {
			return webAccessToken;
		}
		
		public void setWebAccessToken(String webAccessToken) {
			this.webAccessToken = webAccessToken;
		}
		
		public String getUserInfo() {
			return userInfo;
		}
		
		public void setUserInfo(String userInfo) {
			this.userInfo = userInfo;
		}
		
		public String getAccessToken() {
			return accessToken;
		}
		
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}
		
		public String getUserList() {
			return userList;
		}
		
		public void setUserList(String userList) {
			this.userList = userList;
		}
		
		public String getCreateMenu() {
			return createMenu;
		}
		
		public void setCreateMenu(String createMenu) {
			this.createMenu = createMenu;
		}
		
		public String getUserInfoBatchget() {
			return userInfoBatchget;
		}
		
		public void setUserInfoBatchget(String userInfoBatchget) {
			this.userInfoBatchget = userInfoBatchget;
		}
		
		public String getSendKfMessage() {
			return sendKfMessage;
		}
		
		public void setSendKfMessage(String sendKfMessage) {
			this.sendKfMessage = sendKfMessage;
		}
		
		public String getAddMaterial() {
			return addMaterial;
		}
		
		public void setAddMaterial(String addMaterial) {
			this.addMaterial = addMaterial;
		}
		
		public String getMediaUpload() {
			return mediaUpload;
		}
		
		public void setMediaUpload(String mediaUpload) {
			this.mediaUpload = mediaUpload;
		}
		
		public String getMediaUploadimg() {
			return mediaUploadimg;
		}
		
		public void setMediaUploadimg(String mediaUploadimg) {
			this.mediaUploadimg = mediaUploadimg;
		}
		
		public String getMaterialAddNews() {
			return materialAddNews;
		}
		
		public void setMaterialAddNews(String materialAddNews) {
			this.materialAddNews = materialAddNews;
		}
		
		public String getTagsCreate() {
			return tagsCreate;
		}
		
		public void setTagsCreate(String tagsCreate) {
			this.tagsCreate = tagsCreate;
		}
		
		public String getTagsUpdate() {
			return tagsUpdate;
		}
		
		public void setTagsUpdate(String tagsUpdate) {
			this.tagsUpdate = tagsUpdate;
		}
		
		public String getTagsBatchtagging() {
			return tagsBatchtagging;
		}
		
		public void setTagsBatchtagging(String tagsBatchtagging) {
			this.tagsBatchtagging = tagsBatchtagging;
		}
	}
	
	public static class Config {
		/**
		 * 公众号appid
		 */
		private String appid;
		/**
		 * 公众号secret
		 */
		private String appsecret;
		
		
		public String getAppid() {
			return appid;
		}
		
		public void setAppid(String appid) {
			this.appid = appid;
		}
		
		public String getAppsecret() {
			return appsecret;
		}
		
		public void setAppsecret(String appsecret) {
			this.appsecret = appsecret;
		}
	}
	
	public void setConfig(Config config) {
		this.config = config;
	}
	
	public void setUrl(Url url) {
		this.url = url;
	}
}
