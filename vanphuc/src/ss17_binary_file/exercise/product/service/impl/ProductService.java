package ss17_binary_file.exercise.product.service.impl;

import ss17_binary_file.exercise.product.exception.DuplicateIDException;
import ss17_binary_file.exercise.product.model.Product;
import ss17_binary_file.exercise.product.service.IProductService;
import ss17_binary_file.exercise.product.utils.ReadWriteFile;


import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final String PATH = "vanphuc/src/ss17_binary_file/exercise/product/data/product.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Product> productList = ReadWriteFile.readProduct(PATH);

        int id;
        while (true) {
            try {
                System.out.print("Nhap id: ");
                id = Integer.parseInt(SCANNER.nextLine());
                for (Product product : productList) {
                    if (product.getId() == id) {
                        throw new DuplicateIDException("trung id, vui long nhap lai!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap so!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("nhap ten san pham: ");
        String name = SCANNER.nextLine();

        System.out.print("nhap hang san xuat: ");
        String manufacturer = SCANNER.nextLine();

        int price;
        while (true) {
            try {
                System.out.print("nhap gia san pham: ");
                price = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so!");
            }
        }

        productList.add(new Product(id, name, manufacturer, price));
        ReadWriteFile.writeProduct(PATH, productList);
        System.out.println("them thanh cong!");
    }

    @Override
    public void display() {
        List<Product> productList = ReadWriteFile.readProduct(PATH);
        System.out.println("danh sach san pham: ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void findByName() {
        List<Product> productList = ReadWriteFile.readProduct(PATH);
        System.out.println("nhap ten san pham can tim: ");
        String nameFind = SCANNER.nextLine();
        boolean isExist = false;

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(nameFind.toLowerCase())) {
                System.out.println(product);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("khong tim thay san pham!");
        }
    }
}
