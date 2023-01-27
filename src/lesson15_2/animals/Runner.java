package lesson15_2.animals;

import lesson15_2.animals.animals.AbsAnimals;
import lesson15_2.animals.data.AnimalTypeData;
import lesson15_2.animals.factories.AnimalFactory;

import java.util.Scanner;

public class Runner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        AbsAnimals animal = fillAnimalData(AnimalTypeData.CAT);



    }

    private static AbsAnimals fillAnimalData(AnimalTypeData animalTypeData) {
        AnimalFactory animalFactory = new AnimalFactory();
        AbsAnimals animal = animalFactory.create(animalTypeData);

        System.out.println("Как зовут животное?");
        animal.setName(scanner.next());

        System.out.println("Какой цвет у животного?");
        animal.setColor(scanner.next());

        System.out.println("Сколько лет животному?");
        String ageStr = scanner.next();
        while (!isNumber(ageStr)) {
            System.out.println("Введен неверный возраст");
            System.out.println("Повторите ввод");
            ageStr = scanner.next();
        }

        animal.setAge(Integer.parseInt(ageStr));

        animal.setAge(scanner.nextInt());

        System.out.println("Какой вес животного?");
        String ageWeight= scanner.next();
        while (!isNumber(ageWeight)) {
            System.out.println("Введен неверный вес");
            System.out.println("Повторите ввод");
            ageWeight = scanner.next();
        }

        animal.setWeight(Integer.parseInt(ageWeight));

        return animal;
    }

    private static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ignoring){
            return false;
        }
    }
}

