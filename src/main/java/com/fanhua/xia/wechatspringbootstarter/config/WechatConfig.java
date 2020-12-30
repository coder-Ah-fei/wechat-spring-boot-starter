package com.fanhua.xia.wechatspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 描述：接收前台
 *
 * @author yang
 * @date 2020-12-30
 */
@ConfigurationProperties(prefix = "fanhua.xia.wechat")
public class WechatConfig {
	
	private final Config config = new Config();
	
	private final Url url = new Url();
	
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
		public static String code = "https://open.weixin.qq.com/connect/oauth2/authorize?";
		
		/**
		 * 通过code获取网页授权的access_token的URL
		 */
		public static String webAccessToken = "https://api.weixin.qq.com/sns/oauth2/access_token?";
		
		/**
		 * 获取用户信息的URL
		 */
		public static String userInfo = "https://api.weixin.qq.com/sns/userinfo";
		
		
		/**
		 * 基础支持access_token的URl
		 */
		public static String accessToken = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&";
		
		/**
		 * 获取公众号用户列表（关注者？）
		 */
		public static String userList = "https://api.weixin.qq.com/cgi-bin/user/get?";
		
		/**
		 * 创建普通菜单
		 */
		public static String createMenu = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";
		
		/**
		 * 批量获取用户基本信息
		 */
		public static String userInfoBatchget = "https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=";
		/**
		 * 批量获取用户基本信息
		 */
		public static String sendKfMessage = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
		/**
		 * 新增除了（图文类型）之外的其他类型的永久素材
		 */
		public static String addMaterial = "https://api.weixin.qq.com/cgi-bin/material/add_material?access_token=";
		/**
		 * 新增临时素材
		 */
		public static String mediaUpload = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=";
		/**
		 * 上传图文消息内的图片获取URL
		 */
		public static String mediaUploadimg = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=";
		/**
		 * 上传图文消息
		 */
		public static String materialAddNews = "https://api.weixin.qq.com/cgi-bin/material/add_news?access_token=";
		/**
		 * 创建用户标签
		 */
		public static String tagsCreate = "https://api.weixin.qq.com/cgi-bin/tags/create?access_token=";
		/**
		 * 创建用户标签
		 */
		public static String tagsUpdate = "https://api.weixin.qq.com/cgi-bin/tags/update?access_token=";
		/**
		 * 批量为用户打标签
		 */
		public static String tagsBatchtagging = "https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging?access_token=";
		
		public void setCode(String code) {
			Url.code = code;
		}
		
		public void setWebAccessToken(String webAccessToken) {
			Url.webAccessToken = webAccessToken;
		}
		
		public void setUserInfo(String userInfo) {
			Url.userInfo = userInfo;
		}
		
		public void setAccessToken(String accessToken) {
			Url.accessToken = accessToken;
		}
		
		public void setUserList(String userList) {
			Url.userList = userList;
		}
		
		public void setCreateMenu(String createMenu) {
			Url.createMenu = createMenu;
		}
		
		public void setUserInfoBatchget(String userInfoBatchget) {
			Url.userInfoBatchget = userInfoBatchget;
		}
		
		public void setSendKfMessage(String sendKfMessage) {
			Url.sendKfMessage = sendKfMessage;
		}
		
		public void setAddMaterial(String addMaterial) {
			Url.addMaterial = addMaterial;
		}
		
		public void setMediaUpload(String mediaUpload) {
			Url.mediaUpload = mediaUpload;
		}
		
		public void setMediaUploadimg(String mediaUploadimg) {
			Url.mediaUploadimg = mediaUploadimg;
		}
		
		public void setMaterialAddNews(String materialAddNews) {
			Url.materialAddNews = materialAddNews;
		}
		
		public void setTagsCreate(String tagsCreate) {
			Url.tagsCreate = tagsCreate;
		}
		
		public void setTagsUpdate(String tagsUpdate) {
			Url.tagsUpdate = tagsUpdate;
		}
		
		public void setTagsBatchtagging(String tagsBatchtagging) {
			Url.tagsBatchtagging = tagsBatchtagging;
		}
	}
	
	public static class Config {
		/**
		 * 公众号appid
		 */
		public static String appid;
		/**
		 * 公众号secret
		 */
		public static String appsecret;
		
		
		public void setAppid(String appid) {
			Config.appid = appid;
		}
		
		public void setAppsecret(String appsecret) {
			Config.appsecret = appsecret;
		}
	}
	
	
}
