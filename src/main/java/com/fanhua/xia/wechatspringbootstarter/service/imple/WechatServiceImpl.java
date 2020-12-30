//package com.fanhua.xia.wechatspringbootstarter.service.imple;
//
//import com.fanhua.xia.wechatspringbootstarter.config.WechatConfig;
//import com.fanhua.xia.wechatspringbootstarter.model.AuthToken;
//import com.fanhua.xia.wechatspringbootstarter.model.UserInfoDto;
//import com.fanhua.xia.wechatspringbootstarter.service.WechatService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLConnection;
//
///**
// * 描述：接收前台
// *
// * @author yang
// * @date 2020-12-30
// */
//public class WechatServiceImpl implements WechatService {
//
//	@Override
//	public AuthToken getWebAccessToken(String code) {
//		AuthToken authToken = null;
//		StringBuilder json = new StringBuilder();
//		try {
//			String urlStr = WechatConfig.Url.webAccessToken + "appid=" + WechatConfig.Config.appid + "&secret=" + WechatConfig.Config.appsecret + "&code=" + code + "&grant_type=authorization_code";
//			URL url = new URL(urlStr);
//			URLConnection uc = url.openConnection();
//			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//			String inputLine;
//			while ((inputLine = in.readLine()) != null) {
//				json.append(inputLine);
//			}
//			in.close();
////			log.info("-------------------------------------------------------------------------------------");
////			log.info("获取网页授权的access_token是【" + json.toString() + "】");
//			//将json字符串转成javaBean
//			ObjectMapper objectMapper = new ObjectMapper();
//			authToken = objectMapper.readValue(json.toString(), AuthToken.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return authToken;
//	}
//
//	/**
//	 * 根据微信网页授权的access_token获取用户的基本信息
//	 *
//	 * @param accessToken
//	 */
//	public UserInfoDto getUserInfoByWechatLogin(AuthToken accessToken) {
//		UserInfoDto userInfoDto = null;
//		StringBuilder json = new StringBuilder();
//		try {
//			String urlStr = WechatConfig.Url.userInfo + "?access_token=" + accessToken.getAccess_token() + "&openid=" + accessToken.getOpenid();
////			log.info("-------------------------------------------------------------------------------------");
////			log.info("根据微信网页授权的access_token获取用户的基本信息【" + urlStr + "】");
//			URL url = new URL(urlStr);
//			URLConnection uc = url.openConnection();
//			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//			String inputLine;
//			while ((inputLine = in.readLine()) != null) {
//				json.append(inputLine);
//			}
//			in.close();
////			log.info("-------------------------------------------------------------------------------------");
////			log.info("获取用户的基本信息是【" + json.toString() + "】");
//			//将json字符串转成javaBean
//			ObjectMapper objectMapper = new ObjectMapper();
//			userInfoDto = objectMapper.readValue(json.toString(), UserInfoDto.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return userInfoDto;
//	}
//}
