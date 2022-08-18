package one.digital.innovation.oop.interfaces;

public class Calculator implements MathOperation {

    @Override
    public void sum(double operating1, double operation2) {
        System.out.println(operating1 + operation2);
    }

    @Override
    public void subtraction(double operating1, double operation2) {
        System.out.println(operating1 - operation2);
    }

    @Override
    public void multiplication(double operating1, double operation2) {
        System.out.println(operating1 * operation2);
    }

    @Override
    public void divide(double operating1, double operation2) {
        System.out.println(operating1 / operation2);
    }
}
