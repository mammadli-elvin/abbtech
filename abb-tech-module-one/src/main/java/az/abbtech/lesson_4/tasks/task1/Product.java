package az.abbtech.lesson_4.tasks.task1;

public class Product {

    public static String companyName;
    public int productID = 1000;
    public String productName;

    static {
        companyName = "MyCompany";
    }

    {
        productID++;
    }

    public Product(String productName) {
        this.productName = productName;
    }
}
