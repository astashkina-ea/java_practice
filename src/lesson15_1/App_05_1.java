package lesson15_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App_05_1 {

    public static void main(String[] args) {

       // Browsers_02_1 br = Browsers_02_1.valueOf("CHROME");// из строки сделали enum

        List<Car_05_2> cars = new ArrayList<>();

        Scanner sc = new  Scanner(System.in);
        boolean isExit= true;

        while (isExit){ //(true) для второго 2
            System.out.println("Выберите из меню add/list/exit");
            String choice = sc.next().toUpperCase().trim();
            switch (choice){
                case "ADD":
                    System.out.println("Какую машину создать рено / вольво");
                    String carName = sc.next();
                    Car_05_2 auto;
                    if (carName.equals("рено")) {
                        auto = new Reno_05_3();
                        createCar(auto, sc);
                        cars.add(auto);
                        auto.run();
                    } else if (carName.equals("вольво")) {
                        auto = new Volvo_05_3();
                        createCar(auto, sc);
                        cars.add(auto);
                        auto.run();
                    }
                    break;
                case "LIST":
                    //cars.forEach(car -> System.out.println(car)); вар 1
                    for (Car_05_2 car : cars) {
                        System.out.println(car);
                    }
                    break;
                case "EXIT":
                    System.out.println("выход");
                    isExit = false;
                    //System.exit(1);  2ой вариант выхода (без break) закончит полностью программу
                    break;
                default:
                    System.out.println("неизвестная команда");
            }
        }
    }

    public static void createCar (Car_05_2 car, Scanner scanner) {
        System.out.println("Введи название машины");
        car.setName(scanner.next());
        System.out.println("Введи скорость");
        car.setSpeed(scanner.nextInt());
    }
}
