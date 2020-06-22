package Ierarchy.Drive;

public class Ferrari_Car extends Car {
    @Override
    public void drive() {
        System.out.println("Car Ferrari is driving");


    }

    @Override
    public void getSpeed() {
        System.out.println("Car Ferrari is getting speed");

    }

    @Override
    public void toGasCar() {
        System.out.println("Car Ferrari is fully gased");

    }

    @Override
    public void makeSound() {
        System.out.println("Car Ferrari is making sounds");
    }
}
