package com.main.appdet;

public class Demo {
	
	public static void main(String[] args) {
	
		Car car1 = new Car();
		
		car1.setBrandName("KIA");
		car1.setColor("WHITE");
		car1.setSeatCap(7);
		car1.displayCarInfo();
		
		Car car2 = new Car("HONDA", "BLACK", 5);
		
		System.out.println(car2.getBrandName());
		car2.setBrandName("TOYOTA");
		System.out.println("Brand Name: " + car2.getBrandName());
		System.out.println("Color: " + car2.getColor());
		System.out.println("Seat Capacity: " + car2.getSeatCap());
		
	}

}
