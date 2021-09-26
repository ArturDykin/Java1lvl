class Dog extends Animal{

    Dog(int distanceLength, int swimLength){
        super(distanceLength, swimLength);
    }
    @Override
    public void run(){
        if (distanceLength <= 500) System.out.println("Собака пробежала " + distanceLength + " метров");
        else System.out.println("Собака не может пробежать более " + distanceLength + " метров");
    }

    @Override
    public void swim(){
        if (swimLength <= 10) System.out.println("Собака проплыла " + swimLength + " метров");
        else System.out.println("Собака не может плавать более " + swimLength + " метров");
    }
}