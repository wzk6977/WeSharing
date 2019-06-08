package com.wesharing.model;

public class Demand {
	
	private String uuid;
	private String user_id;
	private String name;
	private double price;
	private String detail;
	private String publish_time;
	private String distance_lat;
	private String distance_lng;
	private int page_views;
	private int intention;
	private int demand_state;
	
	private User user;
	
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
	public int getPage_views() {
		return page_views;
	}
	public void setPage_views(int page_views) {
		this.page_views = page_views;
	}
	public int getIntention() {
		return intention;
	}
	public void setIntention(int intention) {
		this.intention = intention;
	}
	public int getDemand_state() {
		return demand_state;
	}
	public void setDemand_state(int demand_state) {
		this.demand_state = demand_state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Demand [uuid=" + uuid + ", user_id=" + user_id + ", name=" + name + ", price=" + price + ", detail="
				+ detail + ", publish_time=" + publish_time + ", distance_lat=" + distance_lat + ", distance_lng="
				+ distance_lng + ", page_views=" + page_views + ", intention=" + intention + ", demand_state="
				+ demand_state + ", user=" + user + "]";
	}
	

}
