package ss16_text_file.exercise.demo_file_text.service.impl;

import ss16_text_file.exercise.demo_file_text.model.Student;
import ss16_text_file.exercise.demo_file_text.service.IStudentService;
import ss16_text_file.exercise.demo_file_text.utils.ReadFileUtil;
import ss16_text_file.exercise.demo_file_text.utils.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final String PATH = "vanphuc/src/ss16_text_file/student.txt";
    List<Student> students;

    {
        try {
            students = ReadFileUtil.readStudent(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap vao diem: ");
        double score = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, score);
        students.add(student);

        WriteFileUtil.writeStudentFile(PATH, students);
    }


    @Override
    public void display() {
        for (Student student : students) {
            System.out.println(student.getInfo());
        }
    }
}
