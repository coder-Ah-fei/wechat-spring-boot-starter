package com.github.coderahfei.wechatspringbootstarter.model;

import java.util.List;

/**
 * 接收获取公众号关注用户的数据模型
 *
 * @author yang [yiixuan@163.com]
 */
public class FindUserListDto {
	
	/**
	 * total : 6
	 * count : 6
	 * data : {"openid":["oZp9Q1pnVRR6KDtSaLl5PVgbeNls","oZp9Q1ueyoKuYFggSJEj_sAjphJA","oZp9Q1mM5oS2JukWTyIqAmjxRRJU","oZp9Q1vyoNsl5jpQtsslvy6kXmRk","oZp9Q1oWyxORMxNNmbs6-MrgMVQE","oZp9Q1jvqU-_6M1m5bw7E5PEX6qs"]}
	 * next_openid : oZp9Q1jvqU-_6M1m5bw7E5PEX6qs
	 */
	
	private int total;
	private int count;
	private DataBean data;
	private String next_openid;
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public DataBean getData() {
		return data;
	}
	
	public void setData(DataBean data) {
		this.data = data;
	}
	
	public String getNext_openid() {
		return next_openid;
	}
	
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}
	
	public static class DataBean {
		private List<String> openid;
		
		public List<String> getOpenid() {
			return openid;
		}
		
		public void setOpenid(List<String> openid) {
			this.openid = openid;
		}
	}
}

