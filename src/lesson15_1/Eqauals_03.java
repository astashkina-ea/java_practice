package lesson15_1;

public class Eqauals_03 {
    public static void main(String[] args) {
        String a = "Привет";
        String b = new String("Привет");
        String c = "Привет";

        //== - ссылются ли переменные на одну и ту же область памяти
        //equals - равны ли знаечния
        System.out.println(a == b); //false  тк создали новый объект
        System.out.println(a.equals(b)); //true

        System.out.println(a == c); //true тк значения одинаковые => в переменной с хранится ссылка на ту же строку ссылается переменная а
        // (2 переменные ссылаются на одну область памяти)
        System.out.println(a.equals(b)); //true
    }
}
