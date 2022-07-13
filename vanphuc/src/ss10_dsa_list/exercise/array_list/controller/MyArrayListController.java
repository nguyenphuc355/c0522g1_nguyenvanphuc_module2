package ss10_dsa_list.exercise.array_list.controller;

import ss10_dsa_list.exercise.array_list.model.Student;
import ss10_dsa_list.exercise.array_list.service.impl.StudentService;

import java.util.Scanner;

public class MyArrayListController {
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);


        StudentService<Student> newMyArrayList = new StudentService<>();
        StudentService<Student> studentStudentService = new StudentService<>();

        Student student1 = new Student(1, "Nguyen Van Phuc");
        Student student2 = new Student(2, "Vo Van Ty");
        Student student3 = new Student(3, "Huynh Van Nam");
        Student student4 = new Student(4, "Huynh Trung Thuyen");
        Student student5 = new Student(5, "le Dai Loi");


        studentStudentService.add(student1);
        studentStudentService.add(student2);
        studentStudentService.add(student3);
        studentStudentService.add(student4);
        studentStudentService.add(student5);

        studentStudentService.add(student1, 5);
        for (int i = 0; i < studentStudentService.size(); i++) {
            System.out.print(studentStudentService.get(i).getId() + " ");
            System.out.println(studentStudentService.get(i).getName());
        }

    }
}
