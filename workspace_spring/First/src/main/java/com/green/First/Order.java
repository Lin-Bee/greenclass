package com.green.First;

public class Order {
	private String food = "";
	private int cnt = 0;
	private String morecheck = "";
	private String order = "";
	private String orderDay = "";

	public Order() {

	}

	public Order(String food, int cnt, String morecheck, String order, String orderDay) {
		this.food = food;
		this.cnt = cnt;
		this.morecheck = morecheck;
		this.order = order;
		this.orderDay = orderDay;
	}

	public String getName() {	return food;}
	public void setName(String food) {	this.food = food;	}

	public int getCnt() {	return cnt;	}
	public void setCnt(int cnt) {	this.cnt = cnt;	}

	public String getMorecheck() {return morecheck;	}
	public void setMorecheck(String morecheck) {this.morecheck = morecheck;	}

	public String getOrder() {	return order;	}
	public void setOrder(String order) {	this.order = order;	}

	public String getOrderDay() {	return orderDay;	}
	public void setOrderDay(String orderDay) {	this.orderDay = orderDay;	}

	@Override
	public String toString() {
		return "Order{" +
						"food='" + food + '\'' +
						", cnt=" + cnt +
						", morecheck='" + morecheck + '\'' +
						", order='" + order + '\'' +
						", orderDay=" + orderDay +
						'}';
	}
}
