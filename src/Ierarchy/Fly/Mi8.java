package Ierarchy.Fly;

public class Mi8 extends Helicopter {
    @Override
    public void fly() {

    }
    public void attack(){
        System.out.println("Helicopter Mi8 is attacking");
    }

    @Override
    public void takingOff() {
        System.out.println("Helicopter Mi8 is taking off");

    }

    @Override
    public void makeSound() {
        System.out.println("Helicopter Mi8 is making sounds");
    }
}
