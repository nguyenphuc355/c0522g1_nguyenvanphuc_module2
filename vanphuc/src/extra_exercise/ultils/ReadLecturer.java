package extra_exercise.ultils;

import extra_exercise.model.Lecturer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadLecturer {
    private static List<String> readLecturer(String path){
        List<String> strings = new ArrayList<>();
        String line;
        try {
            File file= new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine())!=null){
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static List<Lecturer> readLecturerFile(String path){
        List<String> stringList = readLecturer(path);
        List<Lecturer> lecturerList = new ArrayList<>();
        String[] info;
        for (String line : stringList){
            info = line.split(",");
            lecturerList.add(new Lecturer(Integer.parseInt(info[0]), info[1], info[2], (info[3]), info[4]));
        }
        return lecturerList;
    }
}
