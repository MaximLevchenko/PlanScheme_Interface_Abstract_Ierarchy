package Ierarchy.Walk;

public class Poor_People extends People implements Poorness {
    @Override
    void talk() {
        System.out.println("Talking like a poor");

    }

    @Override
    public void getPoor() {
        System.out.println("Person is poor:((");

    }

    @Override
    public void walk() {
        System.out.println("Person is walking");
    }

    @Override
    public void makeSound() {
        System.out.println("Person is making sound");

    }

    @Override
    public void breath() {

    }
}
