package ss16_text_file.exercise.demo_file_text.utils;


import ss16_text_file.exercise.demo_file_text.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;
    }

    public static List<Student> readStudent(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2])));
        }
        System.out.println(students);
        return students;
    }
}
