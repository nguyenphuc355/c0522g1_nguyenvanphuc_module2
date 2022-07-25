package ss17_binary_file.exercise.product.controller;

import ss17_binary_file.exercise.product.model.Product;
import ss17_binary_file.exercise.product.service.IProductService;
import ss17_binary_file.exercise.product.service.impl.ProductService;
import ss17_binary_file.exercise.product.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void menuController() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Iphone 6s", "Apple", 3000000));
        ReadWriteFile.writeProduct("vanphuc/src/ss17_binary_file/exercise/product/data/product.csv", productList);
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        do {
            System.out.println("===Quan LY San Pham====:\n" +
                    "1. Them san pham.\n" +
                    "2. hien thi san pham.\n" +
                    "3. tim kiem san pham.\n" +
                    "4. thoat.");

            int choose = 0;
            try {
                System.out.print("moi nhap lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so");
            }

            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.findByName();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("ko ton tai, moi nhap lai!");
            }
        } while (true);
    }
}
