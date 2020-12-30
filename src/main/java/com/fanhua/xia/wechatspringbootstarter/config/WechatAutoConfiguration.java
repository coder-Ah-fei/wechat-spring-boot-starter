package com.fanhua.xia.wechatspringbootstarter.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：接收前台
 *
 * @author yang
 * @date 2020-12-30
 */
@Configuration
@EnableConfigurationProperties(WechatConfig.class)
public class WechatAutoConfiguration {
	/**
	 * 初始化自定义Starter的Bean
	 *
	 * @return
	 */
//	@Bean
//	public WechatService wechatUtils() {
//		return new WechatServiceImpl();
//	}
}
