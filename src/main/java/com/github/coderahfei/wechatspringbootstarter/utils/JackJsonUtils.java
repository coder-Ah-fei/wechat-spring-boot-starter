package com.github.coderahfei.wechatspringbootstarter.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author yang [yiixuan@163.com]
 */
public class JackJsonUtils {
	static ObjectMapper objectMapper;
	
	/**
	 * 解析json
	 *
	 * @param content   c
	 * @param valueType c
	 * @param <T>       c
	 * @return f
	 */
	public static <T> T fromJson(String content, Class<T> valueType) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		try {
			return objectMapper.readValue(content, valueType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 生成json
	 *
	 * @param object 参数
	 * @return 返回值
	 */
	public static String toJson(Object object) {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		}
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
