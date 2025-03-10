package com.green.First;

public class PhoneDTO {
	private String brand;
	private int price;
	private String color;

	//DTO Data Transfer Object
	//데이터를 이동시켜주는 객체 > 걍 이동용 객체이름
	public PhoneDTO() {
	}

	public PhoneDTO(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public String getColor() {return color;	}
	public void setColor(String color) {this.color = color;}

	@Override
	public String toString() {
		return "PhoneDTO{" +
						"brand='" + brand + '\'' +
						", price=" + price +
						", color='" + color + '\'' +
						'}';
	}
}
