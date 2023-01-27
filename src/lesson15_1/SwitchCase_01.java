package lesson15_1;

public class SwitchCase_01 {
    public static void main(String[] args) {
//        int browser = 1;
        String browser = "opera";
//        if (browser == 1) {
//            System.out.println("Использую хром");
//        } else if (browser == 2) {
//            System.out.println("Использую оперу");
//        } else if (browser == 3) {
//            System.out.println("Использую сафари");
//        }

        switch (browser) {
            case "chrome":
                System.out.println("Использую хром");
                break;
            case "opera":
                System.out.println("Использую оперу");
                break;
            case "safari":
                System.out.println("Использую сафари");
                break;
            default: //необработанное условие
                System.out.println("Неизвестный браузер");
        }
    }
}
