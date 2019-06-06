package com.wesharing.model;

public class SharedVideo {

	private String uuid;
	private String shared_id;
	private String video_image;
	private String video_path;
	private double video_duration;
	private double video_size;
	private double video_width;
	private double video_height;
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
	public String getVideo_image() {
		return video_image;
	}
	public void setVideo_image(String video_image) {
		this.video_image = video_image;
	}
	public String getVideo_path() {
		return video_path;
	}
	public void setVideo_path(String video_path) {
		this.video_path = video_path;
	}
	public double getVideo_duration() {
		return video_duration;
	}
	public void setVideo_duration(double video_duration) {
		this.video_duration = video_duration;
	}
	public double getVideo_size() {
		return video_size;
	}
	public void setVideo_size(double video_size) {
		this.video_size = video_size;
	}
	public double getVideo_width() {
		return video_width;
	}
	public void setVideo_width(double video_width) {
		this.video_width = video_width;
	}
	public double getVideo_height() {
		return video_height;
	}
	public void setVideo_height(double video_height) {
		this.video_height = video_height;
	}
	@Override
	public String toString() {
		return "SharedVideo [uuid=" + uuid + ", shared_id=" + shared_id + ", video_image=" + video_image
				+ ", video_path=" + video_path + ", video_duration=" + video_duration + ", video_size=" + video_size
				+ ", video_width=" + video_width + ", video_height=" + video_height + "]";
	}
	
	
	
}
