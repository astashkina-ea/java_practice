package lesson15_1;

import java.util.Objects;

public abstract class Car_05_2 {
    protected String name;
    protected int speed;

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

    protected void run() {
        System.out.println("Еду");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //равны по памяти?
        if (o == null || getClass() != o.getClass()) return false; //если входящий объект ноль или не равны типы
        Car_05_2 car_04 = (Car_05_2) o; //входной объект Object мы можем привести к текущему классу  Car
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

    @Override
    public String toString() {
        return "Car_05_2{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}

