package Ierarchy.Drive;

public class Salut_Bicycle extends Bicycle {
    Salut_Bicycle salut_bicycle = new Salut_Bicycle();

    @Override
    public void drive() {
        System.out.println("Bicycle is driving");

    }


    @Override
    public void jump() {
        System.out.println("Salut bicycle is jumping");

    }

    @Override
    public void getSpeed() {
        System.out.println("Bicycle is getting speed");

    }

    @Override
    public void makeSound() {
        System.out.println("Salut bicycle is making sounds");

    }
}
