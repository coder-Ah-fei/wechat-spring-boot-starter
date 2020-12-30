package com.fanhua.xia.wechatspringbootstarter.model;

public class UserTagDto {
	
	/**
	 * tag : {"id":100,"name":"分组1"}
	 * errcode : 45157
	 * errmsg : invalid tag name hint: [cEIaBa0920d459]
	 */
	
	private TagBean tag;
	private int errcode;
	private String errmsg;
	
	public TagBean getTag() {
		return tag;
	}
	
	public void setTag(TagBean tag) {
		this.tag = tag;
	}
	
	public int getErrcode() {
		return errcode;
	}
	
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
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
