package lesson15_2.animals.factories;

import lesson15_2.animals.animals.AbsAnimals;
import lesson15_2.animals.animals.pets.Cat;
import lesson15_2.animals.data.AnimalTypeData;

public class AnimalFactory {

    public AbsAnimals create(AnimalTypeData animalTypeData) {
        switch (animalTypeData) {
            case CAT: {
                return new Cat();
            }
            case DOG: {
                return new Cat();
            }
            case DUCK: {
                return new Cat();
            }
        }
        return null;
    }
}
