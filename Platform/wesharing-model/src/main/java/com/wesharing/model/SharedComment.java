package com.wesharing.model;

public class SharedComment {

	private String uuid;
	private String shared_id;
	private String user_id;
	private String content;
	private String publish_time;
	
	private User user;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getShared_id() {
		return shared_id;
	}

	public void setShared_id(String shared_id) {
		this.shared_id = shared_id;
	}
	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPublish_time() {
		return publish_time;
	}

	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SharedComment [uuid=" + uuid + ", shared_id=" + shared_id + ", user_id=" + user_id + ", content="
				+ content + ", publish_time=" + publish_time + ", user=" + user + "]";
	}
	
	
	
}
