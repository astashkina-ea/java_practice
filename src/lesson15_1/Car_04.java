package lesson15_1;

import java.util.Objects;

public class Car_04 {
    private String name;
    private int speed;

    public Car_04(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //равны по памяти?
        if (o == null || getClass() != o.getClass()) return false; //если входящий объект ноль или не равны типы
        Car_04 car_04 = (Car_04) o; //входной объект Object мы можем привести к текущему классу  Car
        return speed == car_04.speed && Objects.equals(name, car_04.name); //вернум true если условия совпадают
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed);
    }

//Если хеш-коды разные, то и входные объекты гарантированно разные.
//Если хеш-коды равны, то входные объекты не всегда равны.
//Ситуация, когда у разных объектов одинаковые хеш-коды называется — коллизией. Вероятность возникновения коллизии зависит от используемого алгоритма генерации хеш-кода.

   //для одного и того же объекта хеш код всегда будет одинаковым
   //если объекты одинаковые то и хеш код одинаковый
    //если хещ коды равны то входные объекты не всегда равны
}

