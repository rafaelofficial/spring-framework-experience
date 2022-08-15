package one.digital.innovation.oop.polymorphism;

public class Main {

    public static void main(String[] args) {

        ClassMother[] classes = new ClassMother[] {
                new ClassChildOne(), new ClassChildTwo(), new ClassMother()
        };

        for (ClassMother c : classes) {
            c.methodOne();
        }

        System.out.println();

        for (ClassMother c : classes) {
            c.methodTwo();
        }

        System.out.println();

        ClassChildTwo classChildOne = new ClassChildTwo();
        classChildOne.methodTwo();
    }
}