/**
 * Java 1. Home work 5
 *
 * @author Dykin Artur
 * @version 22.09.2021
 */

class Employee{

    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

    private String name;
    private String profession;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    // 2. Конструктор класса должен заполнять эти поля при создании объекта.

    Employee(String name, String profession, String email, String telephone, int salary, int age){
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getProfession(){
        return this.profession;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public int setSalary(){
        return salary;
    }

    public int getAge(){
        return this.age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    @Override
    public String toString(){
        return name + ", " + profession + ", " + email + ", " + telephone + ", " + salary + ", " + age;

    }
    public void getInfo(){
       System.out.println(name + ", " + profession + ", " + email + ", " + telephone + ", " + salary + ", " + age);
    }
}