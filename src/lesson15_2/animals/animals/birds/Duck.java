package lesson15_2.animals.animals.birds;

import lesson15_2.animals.animals.AbsAnimals;

public class Duck extends AbsAnimals implements IFlying {

//    public Duck(String name, int age, int weight, String color){
//        super(name, age, weight, color);
//    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
