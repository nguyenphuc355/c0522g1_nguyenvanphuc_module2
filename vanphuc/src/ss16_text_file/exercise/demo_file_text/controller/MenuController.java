package ss16_text_file.exercise.demo_file_text.controller;


import ss16_text_file.exercise.demo_file_text.service.IStudentService;
import ss16_text_file.exercise.demo_file_text.service.impl.StudentService;

import java.io.IOException;

public class MenuController {
   private static IStudentService iStudentService = new StudentService();

   public static void menuController() throws IOException {
       iStudentService.add();

       iStudentService.display();
   }
}

