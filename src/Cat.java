class Cat extends Animal{

    Cat(int distanceLength, int swimLength) {
        super(distanceLength, swimLength);
    }
    @Override
    public void run() {
        if (distanceLength <= 200) System.out.println("Кот пробежал " + distanceLength + " метров");
        else System.out.println("Кот не может пробежать более " + distanceLength + " метров");
    }

    @Override
    public void swim() {
        System.out.println("Кот не может плавать");
    }
}