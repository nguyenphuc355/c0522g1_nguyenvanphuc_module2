package extra_exercise.ultils;

import extra_exercise.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudent {
    public static List<String> readFile(String path) {
        List<String> readStudent = new ArrayList<>() ;
            String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                readStudent.add(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return readStudent;
    }
    public static List<Student> readStudentFile(String path){
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] info;
        for (String line : strings){
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4],Double.parseDouble(info[5])));
        }
        return students;
    }
}
