/**
 * Java 1. Home work 7
 *
 * @author Dykin Artur
 * @version 29.09.2021
 */

class Lesson7 {

    public static void main(String[] args) {

        Kot[] cats = new Kot[3];
        cats[0] = new Kot("Рыжик", 6);
        cats[1] = new Kot("Барсик", 7);
        cats[2] = new Kot("Мурзик", 8);

        Plate plate = new Plate(15);

        for (Kot kot : cats) {
            kot.eat(plate);
            kot.info();
        }
    }

    static class Plate {

        public int food;

        public Plate(int food) {
            this.food = food;
        }


        boolean decreaseFood(int n) {
            int diff = food - n;
            if (diff < 0) return false;

            food -= n;
            return true;
        }

        void addFood(int food) {
            this.food += food;
        }

        void info() {
            System.out.println("plate: " + food);
        }
    }

    static class Kot {

        private String name;
        private int appetite;
        private boolean hungry;

        Kot(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.hungry = true;
        }

        void info() {
            String isHungry = !hungry ? "сытый" : "голоден";
            System.out.println(name + ": " + isHungry);
        }

        void eat(Plate plate) {
            if (hungry && plate.decreaseFood(appetite))
                hungry = false;
        }
    }
}