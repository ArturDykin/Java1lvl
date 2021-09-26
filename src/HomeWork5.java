/**
 * Java 1. Home work 5
 *
 * @author Dykin Artur
 * @version 22.09.2021
 */

//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

class HomeWork5 {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "88005555535", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Engineer", "Petrog@mail.ru", "88005555536", 35000, 36);
        persArray[2] = new Employee("Sidorov Sidr", "Actor", "Sidor@mail.ru", "88005555537", 40000, 50);
        persArray[3] = new Employee("Putinov Putin", "Enemy", "urod@mail.ru", "88005555538", 12792, 68);
        persArray[4] = new Employee("Pamela Anderson", "Actor", "milaya@mail.ru", "88005555539", 100000, 55);

        for (Employee upToForty : persArray) if (upToForty.getAge() > 40) upToForty.getInfo();
    }
}
