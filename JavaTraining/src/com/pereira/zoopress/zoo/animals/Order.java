package com.pereira.zoopress.zoo.animals;

public class Order {

	private String orderName;
	private String familyName;

	public Order(){}
	
	public Order(String orderName, String familyName){
		this.orderName = orderName;
		this.familyName = familyName;
	}
	
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

}
