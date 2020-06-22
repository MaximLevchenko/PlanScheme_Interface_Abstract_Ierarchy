package Ierarchy.Fly;

public class Transporting_Plane extends Plane {
    @Override
    public void fly() {

    }

    public void transportPeople() {
        System.out.println("Plane is transporting people");
    }

    @Override
    public void takingOff() {
        System.out.println("Plane is taking off");

    }

    @Override
    public void makeSound() {
        System.out.println("Plane is making sounds");

    }
}
