package ss12_java_collection_framework.java_collection_framework_demo;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ProductManager productManager = new ProductManager();
        menu();
        int choice = readChoice();
        while (choice != 3) {
            switch (choice) {
                case 1:
                    addProduct(productManager);
                    break;
                case 2:
                    listProducts(productManager);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            choice = readChoice();
        }
    }

    public static void menu() {
        System.out.println("---Product Management---");
        System.out.println("1. Add Product To List");
        System.out.println("2. View Product List");
        System.out.println("3. Exit");
    }

    public static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void addProduct(ProductManager productManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        Product product = new Product(name, price);
        productManager.add(product);
        System.out.println("Product added successfully.");
    }

    public static void listProducts(ProductManager productManager) {
        List<Product> products = productManager.list();
        System.out.println("---Product List---");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total products: " + products.size());
    }
}