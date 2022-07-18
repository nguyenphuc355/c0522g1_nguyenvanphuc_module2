package ss12_java_collection_frame_work.exercise.service.impl;

import ss12_java_collection_frame_work.exercise.model.Product;
import ss12_java_collection_frame_work.exercise.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Product productInfo() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhap name: ");
        String name = scanner.nextLine();
        System.out.print("nhap price: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, price);
        return product;
    }

    @Override
    public void add() {
        Product product = productInfo();
        products.add(product);
        System.out.println("-----them thanh cong!!-----");
    }

    @Override
    public void editProduct() {
        System.out.print("nhap id can chinh sua: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (idEdit == product.getId()) {
                System.out.print("nhap ten can sua:");
                product.setName(scanner.nextLine());
                System.out.print("nhap gia ban can sua: ");
                product.setPrice(Integer.parseInt(scanner.nextLine()));
            }
        }
    }

    @Override
    public void removeProduct() {
        System.out.print("nhap id can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product : products) {
            if (product.getId() == idRemove) {
                System.out.println("-----ban co chac muon xoa khong?-----\n" +
                        "1. co\n" +
                        "2. khong");

                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    products.remove(product);
                    System.out.println("-----xoa thanh cong!!-----");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("-----khong tim thay id-----");
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void findProduct() {
        System.out.print("nhap ten can tim: ");
        String findName = scanner.nextLine();
        boolean isFlag = false;
        for (Product product : products) {
            if (product.getName().equals(findName)) {
                System.out.println(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("-----khong tim thay!!-----");
        }
    }

    @Override
    public void sort() {
        int choose;
        do {
            System.out.println("====sap xep theo====\n" +
                    "1. sap xep tang dan\n" +
                    "2. sap xep giam dan");

            System.out.print("nhap lua chon: ");
            choose= Integer.parseInt(scanner.nextLine());
            if (choose != 1 && choose != 2)
                System.out.println("---lua chon sai,xin nhap lai--- ");
        } while (choose != 1 && choose != 2);
        if (choose==1){
            AscendingService ascendingService = new AscendingService();
            products.sort(ascendingService);
        }else {
            DecreaseService decreaseService = new DecreaseService();
            products.sort(decreaseService);
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
