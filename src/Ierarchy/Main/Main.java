package Ierarchy.Main;

import Ierarchy.Walk.Elephant;
import Ierarchy.Walk.Frog;
import Ierarchy.Walk.Rich_People;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Elephant elephant = new Elephant();
        Test test = new Test();
        Rich_People rich_people=new Rich_People();
        test.foo(rich_people);
    }
}
