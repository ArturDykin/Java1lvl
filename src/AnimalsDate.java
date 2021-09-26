class AnimalsDate{
    public static void main(String[] args){
        Dog dog = new Dog(500, 10);
        Cat cat = new Cat(300, 10);

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.run();
            animal.swim();
        }
    }
}