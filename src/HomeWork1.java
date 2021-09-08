ArturDykin/Java1class HomeWork1 {
public static void main(String[] args) {
        //   System.out.println("Hello, World!");
        printThreeWords();
        int a = 5;
        int b = 10;
        int f = a + b;
        System.out.println (f >= 0? "Сумма положительная" : "Сумма отрицательная");
        System.out.println (a + " + " + b + " = " + checkSumSign(a, b));
        printColor();        compareNumber();
        }


static int checkSumSign(int a, int b) {
        return a + b;
        }

static void printThreeWords() {
        String[] arr = {"Orange", "Banana", "Apple"};
        for (int i = 0; i < arr.length; i++) {
        System.out.println (arr[i]);
        }
        }

static void printColor() {
        int value = 500;
        if (value < 0) System.out.println ("Красный");
        if (value >= 0 & value < 100) System.out.println ("Желтый");
        if (value > 100) System.out.println ("Зеленый");
        }
static void compareNumber() {
        int a1 = 1;
        int b1 = 5;
        System.out.println (a1 >= b1? "a1 >= b1" : "a1 < b1");
        }
        }
