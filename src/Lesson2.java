/**
 * Java 1. Lesson 2
 *
 * @author Dykin Artur
 * @version 12.09.2021
 */
class Lesson2 {
    public static void main(String[] args) {
        exampleSwitch();
    }

    private static void exampleSwitch() {
        int a = 10;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            case 5:
                System.out.println("a = 5");
                break;
            case 7:
                System.out.println("a = 7");
                break;
            case 10:
                System.out.println("a = 10");
                break;
            default:
                System.out.println("Ни один из case не сработал");
        }
    }
}