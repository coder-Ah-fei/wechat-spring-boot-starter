//package com.fanhua.xia.wechatspringbootstarter.service;
//
//import com.fanhua.xia.wechatspringbootstarter.model.AuthToken;
//import com.fanhua.xia.wechatspringbootstarter.model.UserInfoDto;
//
///**
// * 描述：
// *
// * @author yang
// * @date 2020-12-30
// */
//public interface WechatService {
//	/**
//	 * 通过code获取网页授权的access_token的URL
//	 *
//	 * @param code
//	 * @return
//	 */
//	AuthToken getWebAccessToken(String code);
//
//	/**
//	 * 根据微信网页授权的access_token获取用户的基本信息
//	 *
//	 * @param accessToken
//	 * @return
//	 */
//	UserInfoDto getUserInfoByWechatLogin(AuthToken accessToken);
//}
