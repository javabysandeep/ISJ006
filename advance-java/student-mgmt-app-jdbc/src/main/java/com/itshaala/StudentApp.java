package com.itshaala;

import controller.StudentController;
import model.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student studentToBeAdded = new Student(11, "Adnan", "Pune", "adnan@gmail,com", "123456");
        Student studentToBeUpdated = new Student(2, "Jairaj", "Nagpur", "jairaj@gmail.com", "9898989");
        StudentController studentController = new StudentController();
        // studentController.addStudent(student); //CREAT
        //  studentController.deleteStudent(1); //DELETE
        //studentController.editStudent(studentToBeUpdated); //UPDATE
        // System.out.println(studentController.getStudentById(11));
        studentController.getAllStudents().forEach(System.out::println);
    }
}
