package az.abbtech.lesson_4.tasks.task1;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        System.out.println("Enter the name of the product: ");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();

        Product product = new Product(productName);
        System.out.println(Product.companyName);    //MyCompany
        System.out.println(product.productID);      //1001
        System.out.println(product.productName);    //new Scanner(System.in)
    }
}
