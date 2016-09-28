package com.pereira.zoopress.zoo;

public class Animal {

	private String animalName;
	private Specie animalSpecie;
	private Habitat animalHabitat;
	private Habits animalHabit;
	private Diet animalDiet;

	public Animal(String animalName, Specie animalSpecie, Habitat animalHabitat, Habits animalHabit, Diet animalDiet) {
		super();
		this.animalName = animalName;
		this.animalSpecie = animalSpecie;
		this.animalHabitat = animalHabitat;
		this.animalHabit = animalHabit;
		this.animalDiet = animalDiet;
	}
	
	public Animal(){}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public Specie getAnimalSpecie() {
		return animalSpecie;
	}

	public void setAnimalSpecie(Specie animalSpecie) {
		this.animalSpecie = animalSpecie;
	}

	public Habitat getAnimalHabitat() {
		return animalHabitat;
	}

	public void setAnimalHabitat(Habitat animalHabitat) {
		this.animalHabitat = animalHabitat;
	}

	public Habits getAnimalHabit() {
		return animalHabit;
	}

	public void setAnimalHabit(Habits animalHabit) {
		this.animalHabit = animalHabit;
	}

	public Diet getAnimalDiet() {
		return animalDiet;
	}

	public void setAnimalDiet(Diet animalDiet) {
		this.animalDiet = animalDiet;
	}

}
