package kz.lab1.problem5;

public class Person {
	private final Gender gender;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return gender.toString();
	}
}
