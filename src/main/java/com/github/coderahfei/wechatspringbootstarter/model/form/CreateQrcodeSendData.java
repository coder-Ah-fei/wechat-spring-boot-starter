package com.github.coderahfei.wechatspringbootstarter.model.form;

/**
 * 生成二维码请求的参数
 *
 * @author yang
 */
public class CreateQrcodeSendData {
	public static final String ACTION_NAME_QR_SCENE = "QR_SCENE";
	public static final String ACTION_NAME_QR_STR_SCENE = "QR_STR_SCENE";
	public static final String ACTION_NAME_QR_LIMIT_SCENE = "QR_LIMIT_SCENE";
	public static final String ACTION_NAME_QR_LIMIT_STR_SCENE = "QR_LIMIT_STR_SCENE";
	
	
	/**
	 * 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天），此字段如果不填，则默认有效期为30秒。
	 */
	private Integer expire_seconds;
	/**
	 * 二维码类型，QR_SCENE为临时的整型参数值，QR_STR_SCENE为临时的字符串参数值，QR_LIMIT_SCENE为永久的整型参数值，QR_LIMIT_STR_SCENE为永久的字符串参数值
	 */
	private String action_name;
	/**
	 * 二维码详细信息
	 */
	private ActionInfo action_info;
	
	
	public static class ActionInfo {
		
		private Scene scene;
		
		public static class Scene {
			/**
			 * 场景值ID，临时二维码时为32位非0整型，永久二维码时最大值为100000（目前参数只支持1--100000）
			 */
			private Integer scene_id;
			/**
			 * 场景值ID（字符串形式的ID），字符串类型，长度限制为1到64
			 */
			private String scene_str;
			
			public Integer getScene_id() {
				return scene_id;
			}
			
			public Scene setScene_id(Integer scene_id) {
				this.scene_id = scene_id;
				return this;
			}
			
			public String getScene_str() {
				return scene_str;
			}
			
			public Scene setScene_str(String scene_str) {
				this.scene_str = scene_str;
				return this;
			}
		}
		
		public Scene getScene() {
			return scene;
		}
		
		public ActionInfo setScene(Scene scene) {
			this.scene = scene;
			return this;
		}
	}
	
	
	public Integer getExpire_seconds() {
		return expire_seconds;
	}
	
	public CreateQrcodeSendData setExpire_seconds(Integer expire_seconds) {
		this.expire_seconds = expire_seconds;
		return this;
	}
	
	public String getAction_name() {
		return action_name;
	}
	
	public CreateQrcodeSendData setAction_name(String action_name) {
		this.action_name = action_name;
		return this;
	}
	
	public ActionInfo getAction_info() {
		return action_info;
	}
	
	public CreateQrcodeSendData setAction_info(ActionInfo action_info) {
		this.action_info = action_info;
		return this;
	}
}
