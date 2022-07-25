package extra_exercise.ultils;

import extra_exercise.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteStudent {
    private static void writeStudent(String path,String data){
        try {
            File file= new File(path);
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeStudentFile(String path, List<Student> students){
        StringBuilder data = new StringBuilder();
        for (Student student: students){
            data.append(student.getInfo());
        }
        writeStudent(path,data.toString());
    }
}