package com.github.coderahfei.wechatspringbootstarter.model.dto;

/**
 * @author yang [yiixuan@163.com]
 */
public class UserTagDto extends BaseDto {
	
	/**
	 * tag : {"id":100,"name":"分组1"}
	 * errcode : 45157
	 * errmsg : invalid tag name hint: [cEIaBa0920d459]
	 */
	
	private TagBean tag;
	
	public TagBean getTag() {
		return tag;
	}
	
	public void setTag(TagBean tag) {
		this.tag = tag;
	}
	
	public static class TagBean {
		/**
		 * id : 100
		 * name : 分组1
		 */
		
		private int id;
		private String name;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
}
