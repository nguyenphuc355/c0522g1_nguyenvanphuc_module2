package ss12_java_collection_frame_work.exercise.controller;

import ss12_java_collection_frame_work.exercise.service.IProductService;
import ss12_java_collection_frame_work.exercise.service.impl.ProductService;

import java.util.Scanner;

public class MainListController {

    public static void menuDisplay() {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=========Menu=========\n" +
                    "1.Them san pham\n" +
                    "2. Sua thong tin san pham theo id\n" +
                    "3. Xoa san pham theo id\n" +
                    "4. Hien thi danh sach san pham\n" +
                    "5. Tim kiem san pham theo ten\n" +
                    "6. Sap xep san pham tang dan, giam dan theo gia\n" +
                    "7. Thoat chuong trinh\n");
            System.out.print("Moi nhap lua chon: ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.findProduct();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
