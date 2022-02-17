package com.jspider.pkg;

public class User {

	private String order;
	private int quantity;
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "User [order=" + order + ", quantity=" + quantity + "]";
	}
	
	
	
}
