package com.fanhua.xia.wechatspringbootstarter.config;

import com.fanhua.xia.wechatspringbootstarter.WeChatUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author yang [yiixuan@163.com]
 */
@EnableConfigurationProperties(WechatConfig.class)
public class WechatAutoConfiguration {
	@Bean
	public WeChatUtils wechatUtils(WechatConfig wechatConfig) {
		return new WeChatUtils(wechatConfig);
	}
}
