package extra_exercise.ultils;

import extra_exercise.model.Lecturer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteLecturer {
    private static void writeLecturer(String path,String data){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeLecturerFile(String path, List<Lecturer> lecturerList){
        StringBuilder data = new StringBuilder();
        for (Lecturer lecturer : lecturerList){
            data.append(lecturer.getInfo());
        }
        writeLecturer(path,data.toString());
    }
}
