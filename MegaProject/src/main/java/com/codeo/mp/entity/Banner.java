package com.codeo.mp.entity;

public class Banner {

	String bann_id =null;
	String bannertagline=null;
	String buttonstyle=null;
	String status = null;
	
	
	public Banner(String bann_id, String bannertagline, String buttonstyle, String status) {
		super();
		this.bann_id = bann_id;
		this.bannertagline = bannertagline;
		this.buttonstyle = buttonstyle;
		this.status = status;
	}
	
	public Banner(String bannertagline, String buttonstyle, String status) {
		super();
		this.bannertagline = bannertagline;
		this.buttonstyle = buttonstyle;
		this.status = status;
	}
	
	
	
	public String getBannertagline() {
		return bannertagline;
	}
	public void setBannertagline(String bannertagline) {
		this.bannertagline = bannertagline;
	}
	public String getButtonstyle() {
		return buttonstyle;
	}
	public void setButtonstyle(String buttonstyle) {
		this.buttonstyle = buttonstyle;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Banner [bann_id=" + bann_id + ", bannertagline=" + bannertagline + ", buttonstyle=" + buttonstyle
				+ ", status=" + status + "]";
	}
	
	
	
}
