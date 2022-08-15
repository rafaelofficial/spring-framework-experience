package one.digital.innovation.oop.vehicle;

public class Car extends Vehicle {

    // Attributes of class
    String color;
    String model;
    int tankCapacity;

    // constructors
    public Car() {
    }

    public Car(String color, String model, int tankCapacity) {
        this.color = color;
        this.model = model;
        this.tankCapacity = tankCapacity;
    }

    // methods getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    // method that calculate the quantity of liter of tank capacity
    public double totalValueTankCapacity(double valueOfFuel) {
        return this.tankCapacity * valueOfFuel;
    }

    @Override
    public String toString() {
        return color + ", " + model + ", " + tankCapacity;
    }
}
