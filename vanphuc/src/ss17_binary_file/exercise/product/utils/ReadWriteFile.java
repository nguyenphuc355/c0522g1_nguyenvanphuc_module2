package ss17_binary_file.exercise.product.utils;

import ss17_binary_file.exercise.product.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<Product>  readProduct(String path){
        List<Product> products = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            ObjectInputStream  objects = new ObjectInputStream(fileInputStream);

            products =(List<Product>) objects.readObject();
            objects.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

    public static void writeProduct(String path, List<Product> products){
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
