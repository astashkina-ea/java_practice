package lesson15_1;

public class CarMain_04_2 {

    public static void main(String[] args) {
        Car_04 lada = new Car_04("lada", 100);
        Car_04 bmw = new Car_04("bmw", 100);
        Car_04 bmw2 = new Car_04("lada", 100);
        //System.out.println(lada == bmw); // false сравнение по области памяти куда они ссылаются
        System.out.println(lada.equals(bmw)); //false сравнение значению
        System.out.println(lada.equals(bmw2)); //false сравнение значению даже не смотря на то что они одинаковые но если переопределим то будет true

        System.out.println(lada.hashCode());
        System.out.println(bmw2.hashCode());
    }
}
