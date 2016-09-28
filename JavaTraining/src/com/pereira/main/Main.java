package com.pereira.main;

import com.pereira.zoopress.zoo.animals.Mamals;
import com.pereira.zoopress.zoo.animals.Order;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamals babu = new Mamals(new Order("Primate", "Spider"));
		babu.setAnimalName("Babu");

		System.out.println(babu.getAnimalName() + "is a " + babu.getAnimalSpecie() + " from the order "
				+ babu.getOrder().getOrderName() + " and the family of "
				+ babu.getOrder().getFamilyName());
		
		
	}

}
