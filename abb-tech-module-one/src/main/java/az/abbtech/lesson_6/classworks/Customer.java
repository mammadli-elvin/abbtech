package az.abbtech.lesson_6.classworks;

public class Customer {

    private int id;
    private String name;
    private String surname;
    private int age;

    public Customer() {

    }

    public Customer(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    class CustomerBuilder extends Customer{

        public CustomerBuilder() {

        }
    }

    static class CustomerBuilderStatic {
        private int id;

        public CustomerBuilderStatic() {

        }
    }

    public static void main(String[] args) {
        Customer.CustomerBuilder customer = new Customer().new CustomerBuilder();
        Customer.CustomerBuilderStatic customer2 = new Customer.CustomerBuilderStatic();
    }
}
