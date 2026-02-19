package kz.lab1.problem4;

import practice2.Student;
import java.util.*;

public class GradeBook {
	
	private Course course;
	private List<Student> students;
	private Map<Student, Integer> grades;
	
	public GradeBook() {
		this.course = null;
		this.students = new ArrayList<>();
		this.grades = new HashMap<>();
	}
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
		this.grades = new HashMap<>();
	}
	
	public GradeBook(Course course, List<Student> students) {
		this.course = course;
		this.students = students;
		this.grades = new HashMap<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + course.getName() + "!");
	}
	
	public void inputGrades() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, input grades for students:");
		System.out.println();
		
		for (Student student : students) {
			System.out.print(student.getName() + ": ");
			int grade = scanner.nextInt();
			grades.put(student, grade);
		}
		scanner.close();
	}
	
	public double determineClassAverage() {
		if (students.isEmpty()) return 0.0;
		double sum = 0;
		for (int grade : grades.values()) {
			sum += grade;
		}
		return sum / grades.size();
	}
	
	public Student getLowestStudent() {
		if (grades.isEmpty()) return null;
		Student lowestStudent = null;
		int lowestGrade = 101;
		for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
			if (entry.getValue() < lowestGrade) {
				lowestGrade = entry.getValue();
				lowestStudent = entry.getKey();
			}
		}
		return lowestStudent;
	}
	
	public Student getHighestStudent() {
		if (grades.isEmpty()) return null;
		Student highestStudent = null;
		int highestGrade = -1;
		for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
			if (entry.getValue() > highestGrade) {
				highestGrade = entry.getValue();
				highestStudent = entry.getKey();
			}
		}
		return highestStudent;
	}
	
	public int getGrade(Student student) {
		return grades.getOrDefault(student, 0);
	}
	
	public void displayGradeReport() {
	    System.out.println();
	    
	    double average = determineClassAverage();
	    System.out.printf("Class average is %.2f. ", average);
	    
	    Student lowestStudent = getLowestStudent();
	    Student highestStudent = getHighestStudent();
	    
	    if (lowestStudent != null) {
	        System.out.printf("Lowest grade is %d (%s, id: %s).%n", 
	            getGrade(lowestStudent), 
	            lowestStudent.getName(), 
	            lowestStudent.getId());
	    }
	    
	    if (highestStudent != null) {
	        System.out.printf("Highest grade is %d (%s, id: %s).%n", 
	            getGrade(highestStudent), 
	            highestStudent.getName(), 
	            highestStudent.getId());
	    }
	    
	    outputBarChart();
	}
	
	public void outputBarChart() {
		System.out.println();
		int[] frequency = new int[11];
		
		for (int grade : grades.values()) {
			if (grade == 100) {
				frequency[10]++;
			}
			else {
				frequency[grade / 10]++;
			}
		}
		
		System.out.println("\nGrades distribution: ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			for (int stars = 0; stars < frequency[i]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("100: ");
		for (int stars = 0; stars < frequency[10]; stars++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	@Override
	public String toString() {
	    if (grades.isEmpty()) {
	        return String.format("GradeBook: %s (no grades yet)", course.getName());
	    }
	    return String.format("GradeBook: %s | Students: %d | Average: %.1f | Min: %d | Max: %d", 
	                       course.getName(),
	                       students.size(),
	                       determineClassAverage(),
	                       getGrade(getLowestStudent()),
	                       getGrade(getHighestStudent()));
	}
}