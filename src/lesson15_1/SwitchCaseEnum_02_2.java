package lesson15_1;

public class SwitchCaseEnum_02_2 {
    public static void main(String[] args) {
        Browsers_02_1 browser = Browsers_02_1.CHROME;

        switch (browser) {
            case CHROME:
                System.out.println("Использую хром");
                break;
            case OPERA:
                System.out.println("Использую оперу");
                break;
            case SAFARI:
                System.out.println("Использую сафари");
                break;
            default: //необработанное условие
                System.out.println("Неизвестный браузер");
        }
    }
}
