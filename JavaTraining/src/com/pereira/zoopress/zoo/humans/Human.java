package com.pereira.zoopress.zoo.humans;

public class Human {
	private String name;
	private Integer age;
	private Gender sex;

	public Human() {

	}

	public Human(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Human(String name, Integer age, Gender sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "This is " + name + " and its age is " + age;
	}
}
