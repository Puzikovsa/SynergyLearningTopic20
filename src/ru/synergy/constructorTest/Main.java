package ru.synergy.constructorTest;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(1,"Sergey", 25);
        Person person1 = new Person(2, "Anna", 32);
        Person person2 = new Person(3,"Andrey", 23);
        Person person3 = new Person(4,"Natal", 26);

        System.out.println(person3);
        System.out.println(person1);
        System.out.println(Person.getCounter());

        Fraction fraction = new Fraction(1, 0);
        System.out.println(fraction);
        Fraction fraction1 = new Fraction(2, 20);
        System.out.println(fraction1);
    }

}
