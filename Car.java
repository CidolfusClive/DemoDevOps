package com.main.appdet;

public class Car {
	
	// Fields or Properties
	private String brandName;
	private String color;
	private int seatCap;
	
	public Car() {
		this.brandName = "Unknown";
		this.color = "Unknown";
		this.seatCap = 0;
	}
	
	public Car(String brandName, String color) {
		this.brandName = brandName;
		this.color = color;
	}

	public Car(String brandName, String color, int setCap) {
		this.brandName = brandName;
		this.color = color;
		this.seatCap = setCap;
	}
	
	public void displayCarInfo() {
		System.out.println("Brand Name: " + getBrandName());
		System.out.println("Color: " + getColor());
		System.out.println("Seat Capacity: " + getSeatCap());
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeatCap() {
		return seatCap;
	}
	public void setSeatCap(int seatCap) {
		this.seatCap = seatCap;
	}
	


}
