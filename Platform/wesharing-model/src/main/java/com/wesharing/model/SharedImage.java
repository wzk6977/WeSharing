package com.wesharing.model;

public class SharedImage {
	private String uuid;
	private String shared_id;
	private int is_cover;
	private String image_url;
	private double image_width;
	private double image_height;
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
	public int getIs_cover() {
		return is_cover;
	}
	public void setIs_cover(int is_cover) {
		this.is_cover = is_cover;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public double getImage_width() {
		return image_width;
	}
	public void setImage_width(double image_width) {
		this.image_width = image_width;
	}
	public double getImage_height() {
		return image_height;
	}
	public void setImage_height(double image_height) {
		this.image_height = image_height;
	}
	@Override
	public String toString() {
		return "Image [uuid=" + uuid + ", shared_id=" + shared_id + ", is_cover=" + is_cover + ", image_url="
				+ image_url + ", image_width=" + image_width + ", image_height=" + image_height + "]";
	}
	
	
}
