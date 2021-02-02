package com.github.coderahfei.wechatspringbootstarter.model.form;

import java.util.List;

/**
 * @author yang [yiixuan@163.com]
 */
public class KfMessageSendData {
	
	/**
	 * touser : OPENID
	 * msgtype : text
	 * text : {"content":"Hello World"}
	 * voice : {"media_id":"MEDIA_ID"}
	 * video : {"media_id":"MEDIA_ID","thumb_media_id":"MEDIA_ID","title":"TITLE","description":"DESCRIPTION"}
	 * music : {"title":"MUSIC_TITLE","description":"MUSIC_DESCRIPTION","musicurl":"MUSIC_URL","hqmusicurl":"HQ_MUSIC_URL","thumb_media_id":"THUMB_MEDIA_ID"}
	 * image : {"media_id":"MEDIA_ID"}
	 */
	
	private String touser;
	private String msgtype;
	private TextBean text;
	private VoiceBean voice;
	private VideoBean video;
	private MusicBean music;
	private ImageBean image;
	private NewsBean news;
	
	public String getTouser() {
		return touser;
	}
	
	public void setTouser(String touser) {
		this.touser = touser;
	}
	
	public String getMsgtype() {
		return msgtype;
	}
	
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	
	public TextBean getText() {
		return text;
	}
	
	public void setText(TextBean text) {
		this.text = text;
	}
	
	public VoiceBean getVoice() {
		return voice;
	}
	
	public void setVoice(VoiceBean voice) {
		this.voice = voice;
	}
	
	public VideoBean getVideo() {
		return video;
	}
	
	public void setVideo(VideoBean video) {
		this.video = video;
	}
	
	public MusicBean getMusic() {
		return music;
	}
	
	public void setMusic(MusicBean music) {
		this.music = music;
	}
	
	public ImageBean getImage() {
		return image;
	}
	
	public void setImage(ImageBean image) {
		this.image = image;
	}
	
	public NewsBean getNews() {
		return news;
	}
	
	public void setNews(NewsBean news) {
		this.news = news;
	}
	
	public static class TextBean {
		/**
		 * content : Hello World
		 */
		
		private String content;
		
		public String getContent() {
			return content;
		}
		
		public void setContent(String content) {
			this.content = content;
		}
	}
	
	public static class VoiceBean {
		/**
		 * media_id : MEDIA_ID
		 */
		
		private String media_id;
		
		public String getMedia_id() {
			return media_id;
		}
		
		public void setMedia_id(String media_id) {
			this.media_id = media_id;
		}
	}
	
	public static class VideoBean {
		/**
		 * media_id : MEDIA_ID
		 * thumb_media_id : MEDIA_ID
		 * title : TITLE
		 * description : DESCRIPTION
		 */
		
		private String media_id;
		private String thumb_media_id;
		private String title;
		private String description;
		
		public String getMedia_id() {
			return media_id;
		}
		
		public void setMedia_id(String media_id) {
			this.media_id = media_id;
		}
		
		public String getThumb_media_id() {
			return thumb_media_id;
		}
		
		public void setThumb_media_id(String thumb_media_id) {
			this.thumb_media_id = thumb_media_id;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getDescription() {
			return description;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
	}
	
	public static class MusicBean {
		/**
		 * title : MUSIC_TITLE
		 * description : MUSIC_DESCRIPTION
		 * musicurl : MUSIC_URL
		 * hqmusicurl : HQ_MUSIC_URL
		 * thumb_media_id : THUMB_MEDIA_ID
		 */
		
		private String title;
		private String description;
		private String musicurl;
		private String hqmusicurl;
		private String thumb_media_id;
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getDescription() {
			return description;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public String getMusicurl() {
			return musicurl;
		}
		
		public void setMusicurl(String musicurl) {
			this.musicurl = musicurl;
		}
		
		public String getHqmusicurl() {
			return hqmusicurl;
		}
		
		public void setHqmusicurl(String hqmusicurl) {
			this.hqmusicurl = hqmusicurl;
		}
		
		public String getThumb_media_id() {
			return thumb_media_id;
		}
		
		public void setThumb_media_id(String thumb_media_id) {
			this.thumb_media_id = thumb_media_id;
		}
	}
	
	public static class ImageBean {
		/**
		 * media_id : MEDIA_ID
		 */
		
		private String media_id;
		
		public String getMedia_id() {
			return media_id;
		}
		
		public void setMedia_id(String media_id) {
			this.media_id = media_id;
		}
	}
	
	public static class NewsBean {
		private List<ArticlesBean> articles;
		
		public List<ArticlesBean> getArticles() {
			return articles;
		}
		
		public void setArticles(List<ArticlesBean> articles) {
			this.articles = articles;
		}
		
		public static class ArticlesBean {
			/**
			 * title : Happy Day
			 * description : Is Really A Happy Day
			 * url : URL
			 * picurl : PIC_URL
			 */
			
			private String title;
			private String description;
			private String url;
			private String picurl;
			
			public String getTitle() {
				return title;
			}
			
			public void setTitle(String title) {
				this.title = title;
			}
			
			public String getDescription() {
				return description;
			}
			
			public void setDescription(String description) {
				this.description = description;
			}
			
			public String getUrl() {
				return url;
			}
			
			public void setUrl(String url) {
				this.url = url;
			}
			
			public String getPicurl() {
				return picurl;
			}
			
			public void setPicurl(String picurl) {
				this.picurl = picurl;
			}
		}
	}
}
