package one.digital.innovation.oop.employee;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();

        Employee manager = new Manager();
        Employee seller = new Seller();
        Employee janitor = new Janitor();

        //Manager manager_ = new Employee();
        Seller seller_ = (Seller) new Employee();
    }
}
