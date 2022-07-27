package ru.synergy.constructorTest;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sergey", 35, "Krasnoflotskaya, 151", "8800555055");
        person.displayName();
        person.displayAge();
        person.displayPhone();
    }

}
