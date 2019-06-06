package com.wesharing.model;

import java.util.List;

public class Shared {
	private String uuid;
	private String user_id;
	private String name;
	private double price;
	private String price_unit;
	private String detail;
	private String publish_time;
	private String distance;
	private String distance_lat;
	private String distance_lng;
	private String page_views;
	private String intention;
	private String shared_state;
	private User user;
	private List<SharedImage> images;
	private List<SharedVideo> videos;
	private List<SharedComment> comments;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPrice_unit() {
		return price_unit;
	}
	public void setPrice_unit(String price_unit) {
		this.price_unit = price_unit;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance_lat() {
		return distance_lat;
	}
	public void setDistance_lat(String distance_lat) {
		this.distance_lat = distance_lat;
	}
	public String getDistance_lng() {
		return distance_lng;
	}
	public void setDistance_lng(String distance_lng) {
		this.distance_lng = distance_lng;
	}
	public String getPage_views() {
		return page_views;
	}
	public void setPage_views(String page_views) {
		this.page_views = page_views;
	}
	public String getIntention() {
		return intention;
	}
	public void setIntention(String intention) {
		this.intention = intention;
	}
	public String getShared_state() {
		return shared_state;
	}
	public void setShared_state(String shared_state) {
		this.shared_state = shared_state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<SharedImage> getImages() {
		return images;
	}
	public void setImages(List<SharedImage> images) {
		this.images = images;
	}
	public List<SharedVideo> getVideos() {
		return videos;
	}
	public void setVideos(List<SharedVideo> videos) {
		this.videos = videos;
	}
	public List<SharedComment> getComments() {
		return comments;
	}
	public void setComments(List<SharedComment> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Shared [uuid=" + uuid + ", user_id=" + user_id + ", name=" + name + ", price=" + price + ", price_unit="
				+ price_unit + ", detail=" + detail + ", publish_time=" + publish_time + ", distance=" + distance
				+ ", distance_lat=" + distance_lat + ", distance_lng=" + distance_lng + ", page_views=" + page_views
				+ ", intention=" + intention + ", shared_state=" + shared_state + ", user=" + user + ", images="
				+ images + ", videos=" + videos + ", comments=" + comments + "]";
	}
	
	
}
