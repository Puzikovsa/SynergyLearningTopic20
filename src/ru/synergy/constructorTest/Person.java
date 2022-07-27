package ru.synergy.constructorTest;

public class Person {

    int id;
    private String name;
    private int age;
    public static int counter = 0;

    public Person(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 110)
        this.age = age;
    }


    @Override
    public String toString() {
        return  id + " " + name +" " + age;
    }
}

class Fraction{
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("denominator can't bee zero");
            return;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        if (denominator == 0){
            return "Несуществующая дробь";
        } else
        return "Fraction = " + numerator + " / "
                + denominator;
    }
}
