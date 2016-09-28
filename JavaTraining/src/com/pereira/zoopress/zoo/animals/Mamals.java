package com.pereira.zoopress.zoo.animals;

public class Mamals extends Animal {
	private Order order;
	
	public Mamals(){
		super(Specie.MAMAL);
		
	}
	
	public Mamals(Order order){
		super (Specie.MAMAL);
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
