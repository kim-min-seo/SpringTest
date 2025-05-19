package com.minse0.spring.test.test02;

public class Post {
	 public String title;
	    public String user;
	    public String content;

	    public Post(String title, String user, String content) {
	        this.title = title;
	        this.user = user;
	        this.content = content;
	    }

		public String getTitle() {
			return title;
		}

		public String getUser() {
			return user;
		}

		public String getContent() {
			return content;
		}

		@Override
		public String toString() {
			return "Post [title=" + title + ", user=" + user + ", content=" + content + "]";
		}

		
}
