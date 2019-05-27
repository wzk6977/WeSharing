package com.wesharing.model;

public class User {
	
	private String uuid;
	private String union_id;
	private String name;
	private int gender;
	private String city;
	private String province;
	private String country;
	private String image_url;
	private String credit_core;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUnion_id() {
		return union_id;
	}
	public void setUnion_id(String union_id) {
		this.union_id = union_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getCredit_core() {
		return credit_core;
	}
	public void setCredit_core(String credit_core) {
		this.credit_core = credit_core;
	}
	@Override
	public String toString() {
		return "User [uuid=" + uuid + ", union_id=" + union_id + ", name=" + name + ", gender=" + gender + ", city="
				+ city + ", province=" + province + ", country=" + country + ", image_url=" + image_url
				+ ", credit_core=" + credit_core + "]";
	}
	
	

}
