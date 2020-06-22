package Ierarchy.Walk;

public class Rich_People extends People implements Richities {


    @Override
    void talk() {
        System.out.println("Talking like a rich");

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
    public void getRich() {
        System.out.println("Person is rich :)))");


    }

    @Override
    public void breath() {

    }
}
