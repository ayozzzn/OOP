package practice2;

public class Student {
	
	private String name;
	private String id;
	private int yearOfStudy;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		this.yearOfStudy = 1;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	public void incrementYearOfStudy() {
		yearOfStudy++;
	}
	
	public String toString() {
		return String.format("Student: %s (ID: %s), Course: %d", name, id, yearOfStudy);
	}
	
	public static void main(String[] args) {
		
		Student student = new Student("Azamatkyzy Ayazhan", "24B031603");
		
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getYearOfStudy());
		
		student.incrementYearOfStudy();
		
		System.out.println("Current course: " + student.getYearOfStudy());
		System.out.println(student);
		
	}
	
}
