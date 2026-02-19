package kz.lab1.problem4;

import practice2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        
        Course course = new Course(
                "CS101 Object-oriented Programming and Design",
                "Introduction to OOP concepts using Java",
                4
        );
        
        GradeBook gradeBook = new GradeBook(course);

        gradeBook.addStudent(new Student("Student A", "1"));
        gradeBook.addStudent(new Student("Student B", "4"));
        gradeBook.addStudent(new Student("Student C", "3"));
        gradeBook.addStudent(new Student("Student D", "87"));
        gradeBook.addStudent(new Student("Student E", "5"));
        gradeBook.addStudent(new Student("Student F", "6"));
        gradeBook.addStudent(new Student("Student G", "7"));
        gradeBook.addStudent(new Student("Student H", "8"));
        gradeBook.addStudent(new Student("Student I", "9"));
        gradeBook.addStudent(new Student("Student J", "10"));
        
        gradeBook.displayMessage();
        
        gradeBook.inputGrades();
        
        gradeBook.displayGradeReport();
    }
}
