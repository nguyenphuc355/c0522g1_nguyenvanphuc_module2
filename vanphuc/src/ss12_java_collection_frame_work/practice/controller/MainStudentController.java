package ss12_java_collection_frame_work.practice.controller;

import ss12_java_collection_frame_work.practice.model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudentController {
    public static void main(String[] args) {
        Student student = new Student("Nam",20,"Ha noi");
        Student student1 = new Student("Hung",22,"Ha noi");
        Student student2 = new Student("Ha",25,"Ha noi");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, Student> student4 : studentMap.entrySet()){
            System.out.println(student4.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student);
        students.add(student1);

        for(Student student4 : students){
            System.out.println(student4.toString());
        }
    }
}
