package ss16_text_file.exercise.copy_filr_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            File file = new File("vanphuc/src/ss16_text_file/source_file.txt");

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder temp = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                temp.append(line);
                temp.append("\n");
            }
            temp.delete(temp.length() - 2, temp.length());
            bufferedReader.close();

            File file2 = new File("vanphuc/src/ss16_text_file/target file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(temp.toString());

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}