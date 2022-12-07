package manager;

import entity.Product;
import java.util.Scanner;

public class Product_manager {
    private final Scanner scanner;

    public Product_manager(){
        this.scanner = new Scanner(System.in);
    }
    public Product create_product(){
        Product product = new Product();
        System.out.println(" Vvedite nazvanie producta: ");
        product.setName(scanner.nextLine());
        System.out.println("Vvedite Tcenu producta: ");
        product.setPrice(scanner.nextInt());
        System.out.println(" Vvedite koll-vo ");
        product.setQuantity(scanner.nextInt());
        scanner.nextLine();
        return product;

        }
    }

