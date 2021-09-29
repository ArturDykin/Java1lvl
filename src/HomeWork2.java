/**
 * Java 1. Home work 2
 *
 * @author Dykin Artur
 * @version 12.09.2021
 */

class HomeWork2 {

    public static void main(String[] args) {
        whatNumber(20);
        whatNumber(-20);
        System.out.println(twoNumbers(5, 10));
        System.out.println(twoNumbers(30, 10));
        System.out.println(twoNumbers(1, 1));
        System.out.println(whatNumbers(5));
        System.out.println(whatNumbers(-1));
        numberOfLines("ТЫ", 3);
        numberOfLines("PIPI", 2);
        whatYear(2000);
        whatYear(2021);
    }

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    static boolean twoNumbers(int a, int b) {
        return 10 <= a + b && a + b <= 20;
    }

//2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    static void whatNumber(int a) {
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

//3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean whatNumbers(int a) {
        if (a >= 0) return false;
        return true;
    }

//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
// отпечатать в консоль указанную строку, указанное количество раз;

    static void numberOfLines(String line, int a) {
        for (int i = 1; i <= a; i++, System.out.println(line)) ;
    }

//5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.

    static void whatYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}