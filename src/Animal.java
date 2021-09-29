/**
 * Java 1. Home work 6
 *
 * @author Dykin Artur
 * @version 26.09.2021
 */

abstract class Animal implements IAnimals{
    protected int distanceLength, swimLength;

    Animal(int distanceLength, int swimLength) {
        this.distanceLength = distanceLength;
        this.swimLength = swimLength;
    }
}