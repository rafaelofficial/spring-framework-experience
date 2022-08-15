package one.digital.innovation.oop.vehicle;

public class Main {

    public static void main(String[] args) {

        var car1 = new Car();
        car1.setColor("Black");
        car1.setModel("BMW");
        car1.setTankCapacity(59);
        System.out.println(car1.getModel() + ", " + car1.getColor() + ", " + car1.getTankCapacity());
        System.out.println(car1.totalValueTankCapacity(6.39));

        var car2 = new Car("White", "Ferrari", 66);
        System.out.println(car2.getModel() + ", " + car2.getColor() + ", " + car2.getTankCapacity());
        System.out.println(car1.totalValueTankCapacity(6.65));
    }
}