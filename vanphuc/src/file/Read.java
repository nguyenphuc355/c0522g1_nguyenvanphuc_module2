package file;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {
        File file = new File("vanphuc/src/extra_exercise/service/impl/StudentService.java");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
